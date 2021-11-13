package Paquete1;

import java.util.*;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      String ar[]=new String[10]; 
     Arrays.fill(ar, "lupita");
      
      /* Scanner sc=new Scanner(System.in);
       int n;
      
        System.out.println("ingrese los valores del arreglo: ");
        for (int i = 0; i < ar.length; i++) 
        {
        n=sc.nextInt();
        ar[i]=n;
            
        }
        
        Arrays.sort(ar);//me permite ordenar los valores de el arreglo */
       
      
      System.out.println(Arrays.toString (ar));
        
        

    }
    
}
