class Conversion {
	public static void main (String args []) {
		byte b;
		int i = 258;
		double d = 330.289;
	
	System.out.println("Conversi�n de int a byte.");
		b = (byte) i;
	System.out.println("i = " + i + " b = " + b);
	System.out.println("Conversi�n de double a int.");
		i = (int) d;
	System.out.println(" d = " + d + " i = " + i);
	System.out.println("Conversi�n de double a byte.");	
		b = (byte) d;
	System.out.println("d = " + d + " b = " + b);


}
}