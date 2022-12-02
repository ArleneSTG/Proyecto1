package com.weirdfood.weirdfood.Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.weirdfood.weirdfood.Model.ContactanosModel;

public class ContactanosServices {
    Connection conn;

    public ContactanosServices() {
        conn = new ConexionServices().ConexionDB();
    }

    public List<ContactanosModel> ObtenerMensajes() {
        try {
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM contactanos";

            List<ContactanosModel> contac = new ArrayList<>();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                ContactanosModel contactanosModel = new ContactanosModel(
                    result.getString("nombre"),
                    result.getString("correo"),
                    result.getString("mensaje")
                );

                contac.add(contactanosModel);
            }

            result.close();
            stmt.close();
            return contac;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public int EnviarMensaje(ContactanosModel contactanosModel) {
        int resultado = 0;
        try {
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO contactanos (nombre, correo, mensaje) VALUES ('"+contactanosModel.getNombre()+"','"+contactanosModel.getCorreo()+"','"+contactanosModel.getMensaje()+"')";

            resultado = stmt.executeUpdate(query);
            return resultado;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }
}
