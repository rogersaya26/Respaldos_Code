
package Pack1;
import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
       
        int num1,num2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce primer número: ");
        num1=sc.nextInt();
        System.out.println("Introduce segundo número: ");
        num2=sc.nextInt();
        
        if (num1==num2)
        {
            System.out.println(num1+" y "+num2+" son iguales");
        }
        else
            System.out.println("No son iguales");
    
    }
    
}
