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
        
    //Declaracion y asignacion de mi matriz
    double notas[][] = new double [2][4];
    double suma=0;
    Scanner teclado = new Scanner(System.in);
    //carga de la matriz
    for (int f=0; f<2; f++) {
        System.out.println("Ingrese las tres notas para"
                    + "el alumno " +f);
        for(int c=0; c<3; c++) {
    //guardando en la matriz la nota leida por teclado
        
        notas[f][c] = teclado.nextDouble();
        
    //voy sumando / acumulando en cada vuelta cada nota para desp
    
        suma = suma + notas[f][c];
                
            }
    //sacar el promedio
        notas [f][3] = suma / 3;
        suma=0;
        
    }
        
     //Recorrer la matriz y mostrar las notas
     for (int f=0; f<2; f++) {
         System.out.println("las notas y promedio del alumno " + f + "son: ");
         for (int c=0; c<4; c++) {
             System.out.println(notas[f][c]);
         }
     }
        
        
 
        
    }
    
}
