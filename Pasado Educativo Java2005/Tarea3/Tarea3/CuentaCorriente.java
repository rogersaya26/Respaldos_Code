package banco.cuentas;
import banco.usuarios.Persona;
public final class CuentaCorriente extends Cuenta{
	public static final int tasa = 3;
	public static final double saldoMinimo = 10;
	
	public CuentaCorriente (double s, String n, Persona t) throws Exception{
		super (s, n, t);
	}
	
	public int getTasaInteres() {
		return tasa;
	}
	
	public double getSaldoMinimo(){
		return saldoMinimo;
	}
	
	public void retiro (double monto) throws Exception {
		monto += 0.5;
		super.retiro(monto);
	}
	
	public void emitirChequera (int cant) throws Exception{
		try {
			super.retiro (15*cant);
		} catch (Exception e) {
			throw new Exception ("Saldo insuficiente para emitir chequeras");
		}
		
	}
	
}