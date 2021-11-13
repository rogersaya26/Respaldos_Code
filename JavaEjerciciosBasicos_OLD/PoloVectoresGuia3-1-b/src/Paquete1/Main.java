/*Guía de Ejercicios Nº 3: Vectores y Matrices
1) Vectores
e. En tres vectores diferentes se guardan los nombres, temperaturas mínimas y máximas
de 5 ciudades de la provincia de Misiones. En el primer vector se guardan los nombres de 
las ciudades, en el segundo las temperaturas mínimas alcanzadas y en el tercero las 
temperaturas máximas alcanzadas en la última semana. Se necesita un programa que 
permita la carga de las ciudades, sus temperaturas mínimas y máximas; además, deberá 
poder informar por pantalla cual fue la ciudad con la temperatura más baja y cual con la 
temperatura más alta (dando a conocer al mismo tiempo la cantidad de grados).
obera - 16 - 29.
posadas - 18 - 32.
Alem - 15 28.

*/
package Paquete1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String ciudades[] = new String[3]; //Vector para mis ciudades
            int minimas[] = new int[3];    //Vector para mis temp minimas
            int maximas[] = new int[3];    //Vector para mis temp maximas
            
            Scanner teclado = new Scanner (System.in);
            
            for(int i=0; i<ciudades.length; i++) {
                
                System.out.println("Ingrese la ciudad de la posicion: " +i);
                ciudades[i] = teclado.next();
                System.out.println("ingrese la temperatura minima para dicha "
                        + "ciudad");
                minimas[i] = teclado.nextInt();
                System.out.println("ingrese la temperatura maxima para dicha "
                        + "ciudad");
                maximas[i] = teclado.nextInt();
                
            }
            
        // determinar la minima 
            int minima = 9999999;
            int posicion = -1;
            for (int i=0; i< minimas.length; ++i) {
                
                if (minimas[i]<minima) {
                    minima = minimas[i];
                    posicion = i;
                }
                
            }
        System.out.println("la temperatura minimas es de: " + minima + " y "
                + "corresponde a la ciudad de: " + ciudades[posicion]);
        

        // como determinar la maxima
               int maxima = -9999999;
            posicion = -1;
            for (int i=0; i< maximas.length; ++i) {
                
                if (maximas[i]>maxima) {
                    maxima = maximas[i];
                    posicion = i;
                }
                
            }
        System.out.println("la temperatura maximas es de: " + maxima + " y "
                + "corresponde a la ciudad de: " + ciudades[posicion]);
        
    }
    
}
