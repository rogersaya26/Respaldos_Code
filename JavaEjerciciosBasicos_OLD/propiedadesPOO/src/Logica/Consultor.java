package Logica;

public class Consultor extends Persona{
    
    private int id_consultor;
    private String empresaconsultora;

    public Consultor(int id_consultor, String empresaconsultora, int id_persona, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id_persona, dni, nombre, apellido, domicilio, telefono);
    }

    public int getId_consultor() {
        return id_consultor;
    }

    public void setId_consultor(int id_consultor) {
        this.id_consultor = id_consultor;
    }

    public String getEmpresaconsultora() {
        return empresaconsultora;
    }

    public void setEmpresaconsultora(String empresaconsultora) {
        this.empresaconsultora = empresaconsultora;
    }

    @Override
    public void soyPersona() {
        System.out.println("soy Consultor");
    }
    
}
