package Pack1;
import java.util.Scanner;

public class OrdenarNum {

    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in);
        int tam;
        System.out.println("Ingrese el tamaño del arreglo");
        tam = teclado.nextInt();
        int arr[] = new int[tam];
        System.out.println("Ingrese los "+tam+" valores enteros");
        for (int i = 0; i < tam; i++) {
            arr[i] = teclado.nextInt();
        }
        int aux = 0;
        for (int j = 0; j < tam; j++) {
            for (int i = 0; i < tam-1; i++) {
                if(arr[i]>arr[i+1])
                        {
                    aux=arr[i]; 
                        arr[i] = arr[i+1];
                        arr[i+1] = aux;
                        }       
            
            }        
          
        }
        int k=0;
        System.out.println("Numeros ordenador: ");
        while(k<tam) {
            System.out.println(arr[k]);
            k++;
        }
    }
    
}
