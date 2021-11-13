class PruebaEspecificadores {
	int x;
	public int y;
	private int z;
	public void setz (int i) {
		z = i;
	}
	public int getz () {
		return z;
	}}
	
class UsoEspecificadores{
	public static void main (String args[]) {
		PruebaEspecificadores PE = new PruebaEspecificadores ();
		PE.x = 10;
		PE.y = 15;
		PE.setz (20);
		System.out.println("el valor de x es: "+PE.x);
		System.out.println("el valor de y es: "+PE.y);
		System.out.println("el valor de z es: "+PE.getz());
	}}