
package Pack1;


public class Principal {

    
    public static void main(String[] args) {
      
        String nombres[]={"alma","juan","pedro","liset","victoria"};
        
        System.out.println("Ciclo normal for: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(nombres[i]);  
        }
        
        System.out.println("Ciclo for each: ");
        for(String var:nombres)
        {
            System.out.println(var);
        }
        
    }
    
}
