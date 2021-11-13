/*map devuelve la misma longitud que el arreglo inicial
pero en el orden segun la condicion
permite tomar la funcion que le pasamos como argumento
y aplicarla a cada uno de los elementos del arreglo*/
const numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9];

const suma = (ns) => {
    let acumulado = 0;
    for (i = 0; i < ns.length; i++){
        acumulado += ns[i]; 
    }
    return acumulado
}

const resultado1 = suma(numeros)
console.log(resultado1);

const multiplicados = numeros.map(x => x * 2)
//a pares
console.log(multiplicados);

const parejas = numeros.map(x => [x, x]);
console.log(parejas);


const mascotas = [
    {nombre: 'Puchini', edad: 12, tipo: 'perro'},
    {nombre: 'Chanchito Feliz', edad: 3, tipo: 'perro'},
    {nombre: 'Pulga', edad: 10, tipo: 'perro'},
    {nombre: 'Pelusa', edad: 16, tipo: 'gato'}
];

const edades = mascotas.map(x => x.edad)
const resultado = suma(edades)
console.log(resultado / edades.length);


 