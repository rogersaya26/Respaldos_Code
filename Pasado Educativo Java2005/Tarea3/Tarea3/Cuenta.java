package banco.cuentas;
import banco.usuarios.Persona;
public abstract class Cuenta {
	private double saldo;
	private String numero;
	private Persona titular;
	
	public Cuenta (double s, String n, Persona t) throws Exception{
		if (s<=this.getSaldoMinimo()) {
			throw new Exception ("Datos de cuenta invalidos." 
								+"Saldo Minimo:"
								+this.getSaldoMinimo());
		}
		if (n.length()!=5) {
			throw new Exception ("Datos de cuenta invalidos."
								+"Longitud de cuenta: 5 digitos.");
		}
		this.saldo = s;
		this.numero = n;
		this.titular = t;
	}
	
	public double getSaldo () {
		return this.saldo;
	}
	
	public Persona getTitular () {
		return this.titular;
	}
	
	public void setTitutar (Persona p) {
		this.titular = p;
	}
	
	public String getNumero () {
		return this.numero;
	}
	
	public void deposito (double monto) throws Exception {
		if (monto>0)
			this.saldo += monto;
		else
			throw new Exception ("El deposito debe ser > 0");
	}
	
	public void retiro (double monto) throws Exception {
		if (this.getSaldoMinimo()<=(this.saldo-monto))
			this.saldo = this.saldo-monto;
		else
			throw new Exception ("El retiro excede su saldo minimo");
	}
	
	public abstract int getTasaInteres();
	
	public abstract double getSaldoMinimo();
	 
}