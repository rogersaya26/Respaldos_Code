//el = elemento que esta iterando
//const reducer = (acumulador, valorActual) => nuevoAcumulador
//const reducido = [].reduce((acc, el) => acc + el, 0)

const numeros = [1, 2, 3, 4, 5]
const resultado = numeros.reduce((acc, el) => acc + el, 0)
console.log(resultado)
const mascotas = [
    {nombre: 'Pelusa', edad: 16, tipo: 'gato'},
    {nombre: 'Puchini', edad: 12, tipo: 'perro'},
    {nombre: 'Pulga', edad: 10, tipo: 'perro'},
    {nombre: 'Chanchito Feliz', edad: 3, tipo: 'perro'}   
];

const anidado = [1, [2, 3], 4, [5]]

