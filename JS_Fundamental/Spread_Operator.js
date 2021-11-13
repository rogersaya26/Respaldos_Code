/*El Spread Operator es un operador que simplifica la recogida de valores en una estructura de datos.
Convierte un array o un objeto en el conjunto de valores que contiene.*/

const gato = {
    nombre: 'Chanchito Feliz',
    edad: 15
};

const gato2 = { ...gato }; //con los 3puntos ... le estamos diciendo a js generame una copia de la constante de gato.
gato2.nombre = 'lala';

const gatos = [gato, gato2];
console.log(gatos);
