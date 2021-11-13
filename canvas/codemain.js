let texto = document.getElementById("texto_lineas");
let boton = document.getElementById("botoncito");
boton.addEventListener("click", dibujoPorClick);

let d = document.getElementById("dibujito");
let ancho = d.width;
let lienzo = d.getContext("2d");


function dibujarLinea (color, x_a, y_a, x_b, y_b )
 {
	lienzo.beginPath();
	lienzo.strokeStyle = color;
	lienzo.moveTo(x_a, y_a);
	lienzo.lineTo(x_b, y_b);
	lienzo.stroke();
	lienzo.closePath();
}

function dibujoPorClick() 

{
	let lineas = parseInt(texto.value);
	let l = 0;
	let y_i;
	let x_f;
	let espacio = ancho / lineas;

for (l = 0; l < lineas; l++) 
{
	y_i = espacio * l;
	x_f = espacio * (l + 1);
	dibujarLinea("#faa", 0, y_i, x_f, 300);
	dibujarLinea("#faa", y_i, 0, 300, x_f);
	
}

dibujarLinea("#faa", 1, 1, 1, 299);
dibujarLinea("#faa", 1, 299, 299, 299);

dibujarLinea("#faa", 299, 299, 299, 1);
dibujarLinea("faa", 299, 1, 1, 1);
}
