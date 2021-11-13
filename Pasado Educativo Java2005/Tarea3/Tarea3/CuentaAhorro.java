package banco.cuentas;
import banco.usuarios.Persona;
public final class CuentaAhorro extends Cuenta{
	private static int tasa = 12;
	private static double saldoMinimo = 10;
	
/*	static { 
		tasa = 12; 
		saldoMinimo = 1;
	}
*/	
	public CuentaAhorro (double s, String n, Persona t) throws Exception{
		super (s, n, t);
	}
	
	public int getTasaInteres() {
		return tasa;
	}
	
	public double getSaldoMinimo(){
		return saldoMinimo;
	}
}