// Programar el juego del "Número Mágico" en el que se define un número y el usuario trata de adivinarlo, si el número que ingresó el usuario es menor, imprimir la pista "El número mágico es mayor", si el número que ingresó el usuario es mayor, imprimir la pista "El número mágico es menor".


var n = Math.random(n);
var num = n * 10;
num = Math.round(num);
console.log(num);
if (num !== numero_usuario) {
    var numero_usuario = prompt("introduce numero magico ADIVINA del 1 al 10");
    console.log("No Adivinastes, Intentalo denuevo perro");
    
}


