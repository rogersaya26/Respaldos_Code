package banco.cuentas;
import banco.usuarios.Persona;
public final class CuentaFAL extends Cuenta{
	private static final int tasa = 6;
	private static final double saldoMinimo = 100;
	
	public CuentaFAL (double s, String n, Persona t) throws Exception{
		super (s, n, t);
	}
	
	public int getTasaInteres() {
		return tasa;
	}
	
	public double getSaldoMinimo(){
		return saldoMinimo;
	}
}
