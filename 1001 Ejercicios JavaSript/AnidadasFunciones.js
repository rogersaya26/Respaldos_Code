//Estudiar el Comportamiento del Alcance o Contexto Funcional con el lenguaje de programación JavaScript.
function funcion1(){
    var a = 2;

    function funcion3(){
        var b = 5;

        function funcion5(){
            console.log(a, b);
        }
    }
}

function funcion2(){
    var a = 7;
    function funcion4(){
        console.log(a);
    }
}

funcion1();
funcion2();