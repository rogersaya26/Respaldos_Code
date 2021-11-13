package excepciones;

public class Excepciones {

    public static void main(String[] args) {

        int vector[] = {65, 76, 86};
        
        try{
        System.out.println("El numero de la pocision 4 es: " + vector[8]);
        }catch (Exception e){
        System.out.println("Entre a la excepcion");
        }
        System.out.println("Esto paso despues");
    }

}
