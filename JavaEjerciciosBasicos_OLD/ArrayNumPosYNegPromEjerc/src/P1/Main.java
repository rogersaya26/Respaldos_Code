/*
Pide un número para definir el tamaño del arreglo
Introduce los números que definiran el arreglo
Suma los números positivos 
Suma los números negativos
Calcula el promedio de los positivos
Calcula el promedio de los negativos
 */
package P1;
import java.util.Scanner;
public class Main {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int tam;
        double sumapositivos=0;
        double sumanegativos=0;
        int contpos = 0;
        int contneg = 0;
        System.out.println("Introduce número del tamaño del arreglo");
        tam = sc.nextInt();
        double arr[] = new double[tam];
        System.out.println("Introduce los "+tam+" números del arreglo");
        
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=sc.nextDouble();
            if (arr[i]>0) 
            {
            sumapositivos = sumapositivos + arr[i];
            contpos ++;
            }
            else
            {
            sumanegativos = sumanegativos + arr[i];
            contneg ++;
            }
            
        }
            System.out.println("El promedio de los números positivos es: "+sumapositivos/contpos);
            System.out.println("El promedio de los números negativos es: "+sumanegativos/contneg);
            System.out.println("Cantidad de números positivos: "+contpos);
            System.out.println("Cantidad de números negativos: "+contneg);
            
        
        
        
    }
    
}

