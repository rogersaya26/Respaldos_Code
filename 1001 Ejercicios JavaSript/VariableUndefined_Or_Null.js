//Validar si una Variable es null o undefined
let numero = undefined;

if (numero === undefined) {
    console.log('(1)la variable ´numero´ es undefined' );
}

if (numero === null) {
    console.log('(2)la variable ´numero´ es null');
}

numero = null;


if (numero === null) {
    console.log('(3)la variable ´numero´ es null');
}

if (numero === undefined) {
    console.log('(3.1) la variable ´numero´ es undefined');
}

// ! (bang) sirve para negar una operacion

if (!numero) {
    console.log('(4) la variable ´numero´ es null')
}