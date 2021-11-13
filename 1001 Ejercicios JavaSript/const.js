var nombre = 'edward';
let lenguaje = 'JavaScript';
const PI = 3.141592;

nombre = 'Edward Ortiz';
lenguaje = 'JavaScript ES6';
// PI = 3.1415; //genera error (TypeError)

const estudiante = {'id': 6, nombre: 'German Ortiz'};
console.log(estudiante);

estudiante.id = 7;        //modifico un elemento
console.log(estudiante);  //sin que cambie su espacio en memoria

estudiante.nombre = 'Raton Perez';
console.log(estudiante);

//estudiante = {'id': 8, nombre: 'Daniela Ortiz'};
//console.log(estudiante);
//da error por que no se puede modificar una constante
//ni tampoco su espacio en memoria