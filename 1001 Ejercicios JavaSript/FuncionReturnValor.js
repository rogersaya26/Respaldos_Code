//Comprobar si una Función Retorna Valor
function funcion1(){
    return;          //returna nada
}
function funcion2(){
    const A = 3;     //Se realiza la operacion de la funcion 1 y si retorna
}
function funcion3(){
    return 2 + 2;    //returna la suma 2 + 2 retorno concreto
}
function funcion4(){
    return true;     //retorna literal booleana true
}
function funcion5(){
    return {};       //retorna un literal de objeto sin propiedades
}

let fn1 = funcion1();
console.log('`funcion1` retorna:',fn1);
let fn2 = funcion2();
console.log('`funcion2` retorna:',fn2);
let fn3 = funcion3();
console.log('`funcion3` retorna:',fn3);
let fn4 = funcion4();
console.log('`funcion4` retorna:',fn4);
let fn5 = funcion5();
console.log('`funcion5` retorna:',fn5);

console.log(fn5 === undefined);

console.log(typeof fn2 === 'undefined');