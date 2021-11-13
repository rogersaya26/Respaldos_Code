var almuerzos = [
    {principal: 'arepa', postre: 'helado'},
    {principal: 'tacos', postre: 'torta de queso'},
    {principal: 'pizza', postre: 'galletas'},
    {principal: 'sushi', postre: 'quesillo'},
    {principal: 'arepa', postre: 'golfeados'},
    {principal: 'arepa', postre: 'churros'}
];

var cantidadArepas = 0;

//for(var i = 0; i < almuerzos.length; i++) {
//    if (almuerzos[i].principal === 'arepa') {
//        cantidadArepas++;  }
//}

var cantidadArepas = almuerzos.reduce(function(contador, almuerzo) {
    if (almuerzos[i].principal === 'arepa') {
        return
    }
})

console.log(cantidadArepas);


//el = elemento que esta iterando
//const reducer = (acumulador, valorActual) => nuevoAcumulador
//const reducido = [].reduce((acc, el) => acc + el, 0)