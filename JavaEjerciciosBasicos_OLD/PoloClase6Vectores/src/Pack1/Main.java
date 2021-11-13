/*
Guía de Ejercicios Nº 3: Vectores y Matrices 
2) Matrices
d. En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundario. 
Cada fila corresponde a las notas y al promedio de cada alumno.
i. Se necesita un programa que permita a un profesor cargar en las 3 primeras 
posiciones de cada fila las notas del alumno y que en la última columna se calculen 
los promedios.
ii. Una vez realizados los cálculos, se desea mostrar las 3 notas de cada alumno y el 
promedio correspondiente recorriendo la matriz. Ejemplo:

Alumno / nota1 / nota2 / nota3 / promedio
Alumno1 / .8 / ...8 / .....7 / ???
Alumno2 / .7 / ...9 / ....10 / ???
Alumno3 / 10 / ...9 / .....5 / ???
Alumno4 / .4 / ...9 / ..8,50 / ???
 */
package pack1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//Declaracion y asignacion de mi vector 
    double numeros[] = new double [4];
    Scanner teclado = new Scanner(System.in);


//Cargo mi vector        
    for (int i=0; i<numeros.length; i++) {
        System.out.println("Ingrese el valor que quiere guardar"
                + "en la posicion de indice " + i);
        numeros[i] = teclado.nextInt();
}        
        
        
//Recorrido para mostrar lo que tiene guardado
    for (int i=0; i<numeros.length; i++) {
        System.out.println("Estoy en el indice: " + i+
        " el numero que esta guardado es el "  + numeros[i]);
        }
     
 
    
    }
    
}
