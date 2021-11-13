/*Metodo Suma Declarando un Funcion*/
function normalSuma (a, b) {
    return a + b
}
const resultadoNormal = normalSuma(1, 5);
console.log("Declarando la Funcion: " + resultadoNormal);




/*Metodo suma Declarando Fat Arrow Function*/
const fatArrowSuma = (a, b) => a + b;
const resultadoFatArrow = fatArrowSuma(1, 5);

console.log("Usando Fat Arrow Function: " + resultadoFatArrow);



/**Cuando la Fat Arrow Function usa mas de una linea se declara el return */
const fatArrowSumaReturn = (a, b) => {
    const c = a + b;
    return c;
}
const resultadoFatSumaReturn = fatArrowSumaReturn(1, 5);
console.log("Fat Arrow Function con Return: " + resultadoFatSumaReturn);
