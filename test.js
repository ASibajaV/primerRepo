document.getElementById("check").addEventListener("click", function(){

    const nameCheck = document.querySelector("#nombreC input");

    if (nameCheck === ""){
        alert("Oshe, el nombre no puede estar vacío. Tienes que poner el que te eligieron.");
        console.log(nameCheck);
    }else{
        alert("you're done!")
    }

    console.log(nameCheck);

});

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