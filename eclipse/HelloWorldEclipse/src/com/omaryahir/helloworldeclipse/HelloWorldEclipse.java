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
		
		
		final byte a = 1; /*** constante ***/
		final byte b = 1; /*** constante ***/	
		byte result = a + b;
		System.out.println(String.valueOf(result));
	
			
		double d = 1.5;
		double e = 1.5;
		double result_double = d + e;
		
		System.out.println(String.valueOf(result_double));
		
		float f = 1.5F;
		float g = 1.5F;
		float result_float = f + g;
		System.out.println(result_float);
		
		long h = 1000000L;
		long i = 1000000L;
		long result_long = h + i;
		System.out.println(String.valueOf(result_long));
		
		char character = 'c'; // comillas simples
		System.out.println(character);
		
		boolean resp = false;
		System.out.println(String.valueOf(resp));
		
		
		
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