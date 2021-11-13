package banco.usuarios;
public class Persona {
	private String nombre;
	private char sexo;
	private int cedula;
	
	public Persona (String n, char s, int c) {
		this.nombre = n;
		this.sexo = s;
		this.cedula = c;
	}
	
	public String getNombre () {
		return this.nombre;
	}
	
	public char getSexo () {
		return this.sexo;
	}
	
	public int getCedula () {
		return this.cedula;
	}
}