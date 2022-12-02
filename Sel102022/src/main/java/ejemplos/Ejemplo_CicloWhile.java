package ejemplos;

public class Ejemplo_CicloWhile {

	public static void main(String[] args) {
		int a = 7;
		
		while(a <= 10) {//Salir del while cuando "a" es mayor que 4
			System.out.println("el valor de A: " + a);
			a++; // Incrementa el valor de "a" para la siguiente iteracion
			// a +=2; | a = a + 2; | 
		}
	}

}
