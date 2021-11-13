class sentencia_switch {
	public static void main (String args[]){
		int i = 2;
		switch (i) {
			case 1: System.out.println("i tiene valor 1.");
			break;
			case 2: System.out.println("i tiene valor 2.");
			case 3: System.out.println("falto un break");
			break;
			default: System.out.println("i no tiene valor 1, 2 o 3");
			
		}
	}
}