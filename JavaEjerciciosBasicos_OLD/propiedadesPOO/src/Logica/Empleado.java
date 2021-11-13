
package Logica;

public class Empleado extends Persona {
    
    private int numlegajo;
    private String cargo;
    private Double sueldo;

    public Empleado(int numlegajo, String cargo, Double sueldo, int id_persona, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id_persona, dni, nombre, apellido, domicilio, telefono);
        this.numlegajo = numlegajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNumlegajo() {
        return numlegajo;
    }

    public void setNumlegajo(int numlegajo) {
        this.numlegajo = numlegajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public void soyPersona() {
        System.out.println("soy Empleado");
    }
    
}
