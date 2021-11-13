package banco.main;
import banco.usuarios.Persona;
import banco.cuentas.CuentaCorriente;
import banco.cuentas.CuentaAhorro;
import banco.cuentas.CuentaFAL;
import banco.cuentas.Cuenta;
public final class Tarea3 {

    public static void main (String[] args) {
    	
    	// Se crean tres personas
    	Persona P1 = new Persona ("Pedro Perez",'M',14258369);
		Persona P2 = new Persona ("Maria Rodriguez",'F',10232111);
		Persona P3 = new Persona ("Jesus Alvarez",'M',12343255);
		
		// Se define las referencias a cuentas
		CuentaCorriente cte = null;
		CuentaAhorro aho = null;
		CuentaFAL fal = null;
		
		// Se instancian las clases
    	try {
    		cte = new CuentaCorriente (1000.00,"00001",P1);
    		aho = new CuentaAhorro(1000.00,"00002",P2);
    		fal = new CuentaFAL(1000.00,"00003",P3);
    	} catch (Exception e) {
    		System.out.println (e.getMessage());
    	}
    	
    	// Se muestra el saldo de las cuentas
    	System.out.println ("CONSULTA DE CUENTAS: \n");
		consultarCuenta(cte);
		consultarCuenta(aho);
		consultarCuenta(fal);
		
		// Realizamos retiros
		System.out.println ("RETIRO DE CUENTAS: \n");
		retirar (cte,905);
		retirar (aho,905);
		retirar (fal,905);
    
    	// Se muestra el saldo de las cuentas
    	System.out.println ("CONSULTA DE CUENTAS: \n");
		consultarCuenta(cte);
		consultarCuenta(aho);
		consultarCuenta(fal);
		
		// Realizamos depositos
		System.out.println ("DEPOSITO EN CUENTAS: \n");
		depositar (cte,100);
		depositar (aho,100);
		depositar (fal,100);
		
		// Se muestra el saldo de las cuentas
    	System.out.println ("CONSULTA DE CUENTAS: \n");
		consultarCuenta(cte);
		consultarCuenta(aho);
		consultarCuenta(fal);
		
		// se emiten chequeras de la cuenta corriente
		try {
			cte.emitirChequera(2);
			System.out.println ("Se emitieron 2 chequeras. \n");
		} catch (Exception e) {
			System.out.println ("Error al emitir chequera");
			System.out.println (e.getMessage()+"\n");
		}
		// Se muestra el saldo de la cuenta coriente
    	System.out.println ("CONSULTA DE CUENTAS: \n");
		consultarCuenta(cte);
		
	}
	
	static void consultarCuenta (Cuenta cta) {
		if (cta instanceof CuentaCorriente)
			System.out.println ("Cuenta Corriente");
			
		if (cta instanceof CuentaAhorro)
			System.out.println ("Cuenta de Ahorro");
			
		if (cta instanceof CuentaFAL)
			System.out.println ("Cuenta FAL");
			
		System.out.println ("Titular: "+cta.getTitular().getNombre());
		System.out.println ("Saldo: "+cta.getSaldo());
		System.out.println ("Tasa de Interes: "+cta.getTasaInteres());
		System.out.println ("\n");
	}
	
	static void retirar (Cuenta cta, double monto) {
		try {
			cta.retiro(monto);
			System.out.println ("Se han retirado Bs. "+monto+" de la cuenta.\n");
		} catch (Exception e) {
			System.out.println ("Error al retirar "+monto);
			System.out.println (e.getMessage()+"\n");
		}
	}
	
	static void depositar (Cuenta cta, double monto) {
		try {
			cta.deposito(monto);
			System.out.println ("Se han depositado Bs. "+monto+" en la cuenta.\n");
		} catch (Exception e) {
			System.out.println ("Error al depositar "+monto);
			System.out.println (e.getMessage());
		}
	}
    
    
}