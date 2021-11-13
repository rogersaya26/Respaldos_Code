class PruebaStatic {
	private static int x = 3;
	private static int y;
	public PruebaStatic () {
		System.out.println("llamada al constructor");
	}
	public static void getx() {
		System.out.println("el valor de x es: "+x);
		gety();
	}
	public static void gety(){
		System.out.println("el valor de y es: "+y);
	}
	static {
		System.out.println("se ejecuta el bloque static");
		y=x*3;
	}
}

class UsoDeStatic {
	public static void main (String args[]) {
		PruebaStatic PS = new PruebaStatic ();
		PruebaStatic.getx();
	}
}