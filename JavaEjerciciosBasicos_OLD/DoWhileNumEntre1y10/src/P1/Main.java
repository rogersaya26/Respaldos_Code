
package P1;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a;
        
        do
        {
            System.out.println("Por favor intruduce un número entre 1 y 10");
            a=sc.nextInt();
            
                 
        } 
        while(a<=0 || a>=10);//a menor que 0 ó a mayor que 10 
        
        System.out.println("Felicidades entre el 1 y el 10 elegistes el "+a);
                
        }
        
    
    
}
