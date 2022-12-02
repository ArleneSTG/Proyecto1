let baseUrl = "http://localhost:8080";
let mensajes = [];

function ObtenerMensajes() {
    fetch(baseUrl + '/mensajes/all').then(res => {
        res.json().then(json => {
            mensajes = json;
            ImprimirConsultas();
        });
    });
}

function ImprimirConsultas(){
    let Consultas = document.getElementById("consultas");
    Consultas.innerHTML = "";

    mensajes.forEach(element => {
        Consultas.innerHTML += MapearConsultas(element);
    });
}

function MapearConsultas(elemento){
    return `
    <tr>
        <td class="nombre">${elemento.nombre}</td>
        <td class="correo">${elemento.correo}</td>
        <td class="mensaje">${elemento.mensaje}</td>
        <td class="repond">No</td>
        <td><a href="#" onclick="AceptarMensaje()">Validar</a></td>
    </tr>
    `;
}

function AceptarMensaje(){
    
}

function ValidarLogin() {
    ObtenerMensajes();

    var login = sessionStorage.getItem("login");
    var usuario = sessionStorage.getItem("nombre");
    var tusuario = sessionStorage.getItem("tusuario");

    if (login == 1 && tusuario == 0) {
        let nav = document.getElementById("navbar");
        nav.innerHTML = `<ul>
        <a href="../Pagina Principal/Home.html"><img class="logo" src="img/logo.png"></a>
        <li class="imagen"><a href="../Pagina EditarPerfil/ProfileSettings.html"><img src="img/perfil.png" alt=""><p>${usuario}</p></a></li>
        <li class="info"><a href="../Pagina Contacto/Contact.html">Contacto</a></li>
        <li class="info"><a href="../Pagina SobreNosotros/AboutUs.html">Sobre Nosotros</a></li>
        <li class="info"><a href="../Pagina comidas/comidas.html">comidas</a></li>
        <li class="info"><a href="../Pagina Principal/Home.html">Inicio</a></li>
    </ul>`;
    } else if (login == 1 && tusuario == 1) {
        let nav = document.getElementById("navbar");
        nav.innerHTML = `<ul>
        <a href="../Pagina Principal/Home.html"><img class="logo" src="img/logo.png"></a>
        <li class="imagen"><a href="../Pagina EditarPerfil/ProfileSettings.html"><img src="img/perfil.png" alt=""><p>${sessionStorage.getItem("nombre")}</p></a></li>
        <li class="info"><a href="../Pagina NuevoPlatillo/NewFood.html">Creacion de platillos</a></li>
        <li class="info"><a href="../Pagina RevisionPlatillos/Revision.html">Revisiones</a></li>
        <li class="info"><a href="../Pagina Reportes/Platillos.html">Reportes</a></li>
    </ul>`;
    } else {
        let nav = document.getElementById("navbar");
        nav.innerHTML = `<ul>
        <a href="../Pagina Principal/Home.html"><img class="logo" src="img/logo.png"></a>
        <li><a href="../Pagina InicioSesion/LogIn.html">Iniciar sesion</a></li>
        <li><a href="../Pagina Contacto/Contact.html">Contacto</a></li>
        <li><a href="../Pagina SobreNosotros/AboutUs.html">Sobre Nosotros</a></li>
        <li><a href="../Pagina comidas/comidas.html">comidas</a></li>
        <li><a href="../Pagina Principal/Home.html">Inicio</a></li>
    </ul>`;
    }
}