// Imprimir la sucesión fibonacci el número de veces que indicó el usuario
var n1 = 0;
var n2 = 1;
for (i = 2; i < 10; i++) {
    r = n1 + n2;
    n1 = n2;
    n2 = r;
    console.log(r + " ");
}

