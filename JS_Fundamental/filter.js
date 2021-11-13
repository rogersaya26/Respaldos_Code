/**La función filter permite filtrar los elementos de un array 
 * y generar uno nuevo array con todos los elementos que cumplen una determinada condición 
 * destaca que la longitud del array es igual o menor que la orginal segun la condición*/
const numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9];

const mascotas = [
    {nombre: 'Puchini', edad: 12, raza: 'perro'},
    {nombre: 'Chanchito Feliz', edad: 3, raza: 'perro'},
    {nombre: 'Pulga', edad: 10, raza: 'perro'},
    {nombre: 'Pelusa', edad: 16, raza: 'gato'}
];

const numFiltrados = numeros.filter(n => n < 5);
console.log(numFiltrados);

const perros = mascotas.filter(p => p.raza == 'perro');
console.log(perros);

const edadesMayores = mascotas.filter(e => e.edad > 10);
console.log(edadesMayores);

const nombresMascotas = mascotas.filter(nm => nm.nombre == nm.nombre);
console.log("Estos son los nombres de las maskotas registradas");
console.log(nombresMascotas);
console.log(mascotas)