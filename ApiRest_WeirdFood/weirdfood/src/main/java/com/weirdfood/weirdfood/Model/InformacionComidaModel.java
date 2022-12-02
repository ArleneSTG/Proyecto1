package com.weirdfood.weirdfood.Model;

public class InformacionComidaModel {
    private int id;
    private int id_categoria;
    private int idcategorias_comida;
    private String nombre_categoria;
    private String nombre_comida;
    private String descrip_ingre;
    private String fotoUrl;
    private int publicada;
    private String precioComida;

    public String getPrecioComida() {
        return precioComida;
    }
    public void setPrecioComida(String precioComida) {
        this.precioComida = precioComida;
    }
    
    public InformacionComidaModel(int id, int id_categoria, int idcategorias_comida, String nombre_categoria,
            String nombre_comida, String descrip_ingre, String fotoUrl, int publicada, String precioComida) {
        this.id = id;
        this.id_categoria = id_categoria;
        this.idcategorias_comida = idcategorias_comida;
        this.nombre_categoria = nombre_categoria;
        this.nombre_comida = nombre_comida;
        this.descrip_ingre = descrip_ingre;
        this.fotoUrl = fotoUrl;
        this.publicada = publicada;
        this.precioComida = precioComida;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId_categoria() {
        return id_categoria;
    }
    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    public int getIdcategorias_comida() {
        return idcategorias_comida;
    }
    public void setIdcategorias_comida(int idcategorias_comida) {
        this.idcategorias_comida = idcategorias_comida;
    }
    public String getNombre_categoria() {
        return nombre_categoria;
    }
    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }
    public String getNombre_comida() {
        return nombre_comida;
    }
    public void setNombre_comida(String nombre_comida) {
        this.nombre_comida = nombre_comida;
    }
    public String getDescrip_ingre() {
        return descrip_ingre;
    }
    public void setDescrip_ingre(String descrip_ingre) {
        this.descrip_ingre = descrip_ingre;
    }
    public String getFotoUrl() {
        return fotoUrl;
    }
    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }
    public int getPublicada() {
        return publicada;
    }
    public void setPublicada(int publicada) {
        this.publicada = publicada;
    }



}
