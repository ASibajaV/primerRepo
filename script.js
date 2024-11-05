function jsEstaLigado(){
    alert ("Parece ser que sí está ligado");
}

document.getElementById("registrar").addEventListener("click", function(){ //Añade evento al elemento

    console.log("Botón se clickeo");

    const nombre = document.querySelector("#nombrer input").value.trim(); //Para que le quite los espacios en blanco
    const email = document.querySelector("#emailer input").value.trim();
    const password = document.querySelector("#passer input").value.trim();
    const birthday = document.querySelector("#cumple input").value.trim();
    const phone = document.querySelector("#ringRing input").value.trim();
    const address = document.querySelector("#datoDeRelleno input").value.trim();
    
    if (document.getElementById("nombrer input") === ""){ //Estricta igualdad para
        alert("Oshe, el nombre no puede estar vacío. Tienes que poner el que te eligieron.");
    }
    
    else if (email === ""){
        alert("Oshe, el correo no puede estar vacío. Es correcto, esta aplicación te obliga a que pongas uno, no tiene que ser el tuyo.");
    }else if (!email.includes("@")){
        alert("Achis... ¿tu correo no lleva @?");
    }else if (!email.includes(".com") || !email.includes(".net")){
        alert("¿Te fijaste que tu email termine en .com o .net?");
    }
    
    else if (password === "" || password.length < 8){
        alert("Necesitas una contraseña menor a 8 caractéres. NO te recomiendo que pongas 12345678, pero si lo pones el sistema te la toma como buena.");
    }

    else if (birthday === ""){
        alert ("birthday test 1");
    }else if (birthday === null){
        alert ("birthday test 2");
    }else if (birthday === undefined){
        alert ("birthday test 3");
    }

    else if (phone === "" || phone.length != 10){
        alert("Necesitas un número de 10 dígitos.");
    }

    else if (address === ""){
        alert("Si no tienes casa, checate una dirección por ahí y ponla.");
    }
    
    else{
        alert ("Registro completo, lo lograste");
    }

}); //Se deja el paréntesis hasta acá para ponerlo com o función anónima.

/*
document.getElementById("registrarse").addEventListener("click", function(){ //Añade evento al elemento

    const nombre = document.querySelector("#nombre input").value.trim(); //Para que le quite los espacios en blanco
    const email = document.querySelector("#email input").value.trim();
    const password = document.querySelector("#password input").value.trim();

    if (nombre === ""){ //Estricta igualdad para
        alert("Oshe, el nombre no puede estar vacío");
    }else if (email === ""){
        alert("Oshe, el correo no puede estar vacío");
    }else if (!email.includes("@")){
        alert("Achis... ¿tu correo no lleva @?");
    }else if (password === "" || password.length < 8){
        alert("Oshe, la contraseña no puede estar vacía, ni ser menor a 8 caractéres");
    }else{
        alert ("Registro completo, lo lograste")
    }



}); //Se deja el paréntesis hasta acá para ponerlo com o función anónima.
*/