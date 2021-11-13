// Recibir dos números usando prompt y sumarlos, restarlos, dividirlos y multiplicarlos
var num1 = prompt("Into First Integer Number; ");
var num2 = prompt("Into Second Integer Number; ");

var sumar = () => {console.log(parseInt(num1) + parseInt(num2))};
var restar = () => {console.log(num1 - num2)};
var multiplicar = () => {console.log(num1 * num2)};
var dividir = () => {console.log(num1 / num2)};

sumar();
restar();
multiplicar();
dividir();