
package Logica;


public class Auto {
    
    private String color;
    private String marca;
    private String modelo;
    private String patente;
    private String cantPuertas;

    public Auto() {
    }

    public Auto(String color, String marca, String modelo, String patente, String cantPuertas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.cantPuertas = cantPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModalo() {
        return modelo;
    }

    public void setModalo(String modalo) {
        this.modelo = modalo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(String cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
    
    public void muestraVacio() {
        System.out.println("marca: " + marca);
    }
    
    public void muestra() {
        System.out.println("marca: " + marca + " modelo: " + modelo + " patente: " + patente );
        
    }
    
}
