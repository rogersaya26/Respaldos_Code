function saludar(nombre) {
    console.log(`Hola ${nombre}`);
    setTimeout(() => {console.log('esto se muestra tras 5 seg')},5000);
}
saludar("Edward");
console.log("fin!");