let peso = prompt("¿Cual es tu peso?");
let g_mercurio = 3.7;
let g_venus = 8.87;
let g_tierra;
let g_marte = 3.7;
let g_jupiter = 24.8;
let g_saturno = 10.44;
let g_urano = 8.87;
let g_neptuno = 11.15;
let nombre;
let peso_final;
let var_peso;

var_peso = (peso * g_mercurio) / 9.8;
var_peso = parseFloat(var_peso);
peso_final = var_peso.toFixed(2);
document.write("Tu peso en Mercurio es: " + peso_final + " Kilogramos.<br><br>");

var_peso = (peso * g_venus) / 9.8;
var_peso = parseFloat(var_peso);
peso_final = var_peso.toFixed(2);
document.write("Tu peso en Venus es: " + peso_final + " Kilogramos.<br><br>");

var_peso = (peso * g_marte) / 9.8;
var_peso = parseFloat(var_peso);
peso_final = var_peso.toFixed(2);
document.write("Tu peso en Marte es: " + peso_final + " Kilogramos.<br><br>");

var_peso = (peso * g_jupiter) / 9.8;
var_peso = parseFloat(var_peso);
peso_final = var_peso.toFixed(2);
document.write("Tu peso en Jupiter es: " + peso_final + " Kilogramos.<br><br>");


var_peso = (peso * g_saturno) / 9.8;
var_peso = parseFloat(var_peso);
peso_final = var_peso.toFixed(2);
document.write("Tu peso en Saturno es: " + peso_final + " Kilogramos.<br><br>");

var_peso = (peso * g_urano) / 9.8;
var_peso = parseFloat(var_peso);
peso_final = var_peso.toFixed(2);
document.write("Tu peso en Urano es: " + peso_final + " Kilogramos.<br><br>");

var_peso = (peso * g_neptuno) / 9.8;
var_peso = parseFloat(var_peso);
peso_final = var_peso.toFixed(2);
document.write("Tu peso en Neptuno es: " + peso_final + " Kilogramos.<br><br>");


