package com.omaryahir.helloworldeclipse;

public class HelloWorldEclipse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World in Eclipse !!!");
		
		byte edad = 1;
		short edad1 = 1;
		int edad3 = 1;
		long edad2 = 2;
	
	
		/**
		 * Java doc
		 * This comment is for java doc
		 */
		
		long c = edad1 + edad2 + edad3+ edad;
		System.out.println(String.valueOf(c));
		
		System.out.println(String.valueOf(suma(2,2)));
		
			
	}

	/**
	 * Esto es una prueba
	 * Para probar los 
	 * comentarios de eclipse.
	 * @param valor1 para suma
	 * @param valor2 para suma
	 * @return la suma de los dos valores
	 */
	static int suma(int valor1, int valor2)
	{
		return valor1 + valor2;
	}
}