function mostrarSaludo(){
    var mensaje = "hola... Este código se ejecuta en una funcion";
    console.log(mensaje);
}

console.log(mensaje);

//el error se produce por la variable mensaje esta dentro de la funcion
//forma correcta es:
//mostrarSaludo();