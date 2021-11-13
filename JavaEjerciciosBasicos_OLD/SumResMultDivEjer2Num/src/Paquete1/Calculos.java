package Paquete1;
import java.util.Scanner;
public class Calculos {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double a;
        double b;
        System.out.println("Introduce primer número");
        a=sc.nextDouble();
        System.out.println("Introduce segundo número");
        b=sc.nextDouble();
        double suma=a+b;
        double resta=a-b;
        double multi=a*b;
        double div=a/b;
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multi);
        System.out.println("La división es: "+div);
        
    }
    
}
