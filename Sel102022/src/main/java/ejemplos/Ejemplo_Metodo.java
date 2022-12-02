package ejemplos;

public class Ejemplo_Metodo {

	public static void main(String[] args) {
		int resultado = suma(55,66);
		System.out.println(resultado);
		
		int resultado2 = suma(5566,123);
		System.out.println(resultado2);
		
		int resultado3 = suma(33,101);
		System.out.println(resultado3);
		
		int resultado4 = suma(2,2,9);
		System.out.println(resultado4);


	}
	
	public static int suma(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static int suma(int a, int b,int c) {
		int d = a + b + c;
		return d;
	}

}
