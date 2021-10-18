//cargar estatico el mensaje y la llave

var mensaje = document.getElementById("Mensaje").innerHTML;

var password = document.getElementById("Password").innerHTML;


//parte importante

function Cifrado(){

    var cifrado = CryptoJS.AES.encrypt(mensaje, password);


    return document.getElementById("resultado").innerHTML = cifrado;

}

var cifrado = CryptoJS.AES.encrypt(mensaje, password);

var descifrado = CryptoJS.AES.decrypt(cifrado, password);


document.getElementById("demo0").innerHTML = mensaje;
document.getElementById("demo1").innerHTML = cifrado;
document.getElementById("demo2").innerHTML = descifrado;
document.getElementById("demo3").innerHTML = descifrado.toString(CryptoJS.enc.Utf8);