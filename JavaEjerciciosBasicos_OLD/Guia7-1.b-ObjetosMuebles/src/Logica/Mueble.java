
package Logica;


public class Mueble {
    
    private int id_mueble;
    private String nombre;
    private double alto;
    private double ancho;
    private String material;
    private int cantidad;

    public Mueble() {
    }

    public Mueble(int id_mueble, String nombre, double alto, double ancho, String material, int cantidad) {
        this.id_mueble = id_mueble;
        this.nombre = nombre;
        this.alto = alto;
        this.ancho = ancho;
        this.material = material;
        this.cantidad = cantidad;
    }

    public int getId_mueble() {
        return id_mueble;
    }

    public void setId_mueble(int id_mueble) {
        this.id_mueble = id_mueble;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
}
