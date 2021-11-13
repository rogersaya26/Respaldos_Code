package P1;
import java.util.Scanner;
public class Factorial 
{
public static void main(String[]arg)
{
    Scanner teclado = new Scanner(System.in);
      int f=1;
      int num;
   
     System.out.println("Ingrese un numero ENTERO para saber Factorial");
     num = teclado.nextInt();
    for (int i = 1; i <= num; i++) 
    {
         f*=i; 
       
    } 
    
     System.out.println("El Factorial es: "+f);

}
}


