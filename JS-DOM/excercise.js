function js_style() {
    document.getElementById("text").style.fontFamily = "Impact";
    document.getElementById("text").style.fontSize = "50px";
    document.getElementById("text").style.color = "blue";
    document.getElementById("containerExOne").style.backgroundColor = "green";
}

function js_style_reset() {
    document.getElementById("text").style.fontFamily = "arial";
    document.getElementById("text").style.fontSize = "16px";
    document.getElementById("text").style.color = "black";
    document.getElementById("containerExOne").style.backgroundColor = "";
}

function getFormvalue(){
    const primero = document.getElementById("fname").value;
    const segundo = document.getElementById("fname").value
    alert ("click")

    console.log("Nombre: " +primerNombre+ " " +apellido);
}

