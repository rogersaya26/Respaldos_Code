/*
Ejemplo muestra como funciona una matriz
Recorre y carga una matriz 
 */
package Pack1;
import java.util.Scanner;
/**
 *
 * @author Sayas
 */
public class Main {
    public static void main (String [] args) {

//Declaracion y asignacion de mi matriz
        int matriz[][] = new int [4][4];
        
    Scanner teclado = new Scanner(System.in);        
//Recorrido y carga
    for (int f=0; f<4; f++) {
        for (int c=0; c<4; c++) {
        
        System.out.println("Estoy en la fila " + f + " cruce"
                + "con columna " + c);
        matriz [f] [c] = teclado.nextInt();
    }
}



    }
    
}
