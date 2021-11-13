//Crear Instancias de Objetos por medio de Constructores con el lenguaje de programación JavaScript.
'JavaScript' // literales

new String('JavaScript'); //con constructor

//

[2, 3, 5, 7, 11] //literales

new Array(2, 3, 5, 7, 11); //con constructor

//Crear

function restar(a, b) {return a - b} // funcion sola
restar(2, 3);

let restarFn = new Function('a', 'b', 'return a - b');
restarFn(2, 3);               //con constructor

// objeto con literales
{} // literales

let persona = {id:1, nombre: 'juan'}; // literal

persona = new Object();

persona.id = 1;

persona.nombre = 'Juan';

persona

