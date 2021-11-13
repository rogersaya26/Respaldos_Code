
package Logica;

class Circulo extends Figura {
    
    private double radio;

    public Circulo() {
    }
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    
    
    
    @Override
    public double calcularArea() {
        
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
        
    }

   
    
    
    
}
