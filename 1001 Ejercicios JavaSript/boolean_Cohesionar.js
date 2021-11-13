//Promocionar Valores a Tipo Lógico (Booleano)

console.log(Boolean(-0));
console.log(Boolean(0));
console.log(Boolean(-1));
console.log(Boolean(1));
console.log(Boolean(new Number(0)));
console.log(Boolean(NaN));
console.log();


console.log(Boolean(true));
console.log(Boolean(false));
console.log();


console.log(Boolean(undefined));
console.log(Boolean(null));
console.log();


console.log(Boolean(""));
console.log(Boolean(new String()));
console.log();


console.log(Boolean("true"));
console.log(Boolean("false"));
console.log();


console.log(Boolean({}));
console.log(Boolean([]));
console.log();

let fn = function() {};
console.log(Boolean(fn));
