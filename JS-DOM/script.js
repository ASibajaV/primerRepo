document.getElementById("registrarse").addEventListener("click", function (){
    
    const nombre = document.querySelector("#userName input").value.trim();
    const password = document.querySelector("#password input").value.trim();

    if (nombre === "") {
        alert("Por favor ingresa tu nombre, este campo no puede quedar vacío");
    } else if (password === "") {
        alert ("Contraseña incorrecta")
    } else if (password.length < 8) {
        alert ("Tu contraseña debe ser de 8 caracteres o mas.");
    }else{
        const mensaje = document.getElementById("msj");
        mensaje.className= "valid";
        alert("Registro completo, " + nombre + "!");
    }

});

function destruyeLaPagina(){
    const containy = document.getElementById("thingy1");
    const rowy = document.getElementById("thingy2");
    const coly = document.getElementById("thingy3");

    containy.className = "row";
    containy.className = "col";
    containy.className = "container";
}