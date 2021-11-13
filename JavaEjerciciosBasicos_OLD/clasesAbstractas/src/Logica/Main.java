package Logica;


public class Main {

    public static void main(String[] args) {
   
        Cuadrado cuad = new Cuadrado(10);
        double areaCuadrado = cuad.calcularArea();  
        System.out.println(areaCuadrado);
        
        
        Triangulo trian = new Triangulo(2,5);
        double areaTriangulo = trian.calcularArea();
        System.out.println(areaTriangulo);
       
        
        Circulo circ = new Circulo(4);
        double areaCirculo = circ.calcularArea();
        System.out.println(areaCirculo);
        
        
    }
    
}
