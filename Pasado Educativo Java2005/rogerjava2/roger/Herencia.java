class Superclase {
	public int a;
	protected int b;
	private int c;
}

class Subclase extends Superclase {
	int d;
	public Subclase (int x, int y, int z) {
		a=x;
		b=y;
		d=z;
	}
	public void mostrar () {
		System.out.println("el valor de a es: "+a);
		System.out.println("el valor de b es: "+b);
		System.out.println("el valor de d es: "+d);
	}
}

class PruebaHerencia {
	public static void main (String args[]) {
		Subclase S = new Subclase (0,1,2);
		S.mostrar();
	}
}