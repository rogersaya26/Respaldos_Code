class promedio {
	public static void main (String args[]){
		
		double números [] = {10.2, 10.6, 8.5, 15.9, 3.1, 20.12};
		double promedio = 0;
		
		for (int i=0; i<6; i++)
			promedio = promedio + números [i];
			promedio=promedio /6;
			System.out.println("el promedio es: "+promedio);
	}		
}