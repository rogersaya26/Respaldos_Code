class SuperclaseA {
	protected int numero;
	public void Mostrar (){
		System.out.println("En la superclaseA, numero es: "+numero);
	}
}

class SubclaseB extends SuperclaseA {
	private int numero;
	public SubclaseB (int numero, int numero2){
		this.numero = numero;
		super.numero = numero2;
	}
	public void Mostrar () {
		super.Mostrar();
		System.out.println("en la subclaseB, numero es: "+numero);
	}
}
class HerenciaAB {
	public static void main (String[] args) {
		SubclaseB sub = new SubclaseB (10,20);
		sub.Mostrar();
}
}