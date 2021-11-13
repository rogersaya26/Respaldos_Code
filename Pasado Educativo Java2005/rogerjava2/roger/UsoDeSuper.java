class Persona {
	private int cedula;
	private String nombre;
	public Persona (int c, String n) {
		cedula = c;
		nombre = n;
	}
	public int ObtenerCedula () {
		return cedula;
	}
	public String ObtenerNombre () {
		return nombre;
	}
}
class Estudiante extends Persona {
	private double Promedio;
	public Estudiante (int cedula, String nombre, double Prom) {
		super (cedula, nombre);
		Promedio = Prom;
	}
	public double ObtenerPromedio () {
		return Promedio;
	}
}
class PersonaEstudiante {
	public static void main (String[] args) {
		Estudiante E = new Estudiante (14358795,"Antonio Lopez",15.9);
		System.out.print("la cedula del estudiante es: ");
		System.out.println(E.ObtenerCedula());
		System.out.print("el nombre del estudiante es: ");
		System.out.println(E.ObtenerNombre());
		System.out.print("el promedio del estudiante es: ");
		System.out.println(E.ObtenerPromedio());
}
}