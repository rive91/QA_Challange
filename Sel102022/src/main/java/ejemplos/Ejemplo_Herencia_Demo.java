package ejemplos;

public class Ejemplo_Herencia_Demo {

	public static void main(String[] args) {
		Ejemplo_Herencia_Triangulo t1 = new Ejemplo_Herencia_Triangulo();
		
		t1.base = 4.0;
		t1.altura = 4.0;
		t1.estilo = "Estilo 1";
		
		System.out.println("informacion para t1: ");
		t1.mostrarEstilo();
		t1.mostrarDimension();
		System.out.println("Su area es: " + t1.area());
		
		Ejemplo_Herencia_Triangulo t2 = new Ejemplo_Herencia_Triangulo();
		
		t2.base = 8.0;
		t2.altura = 12.0;
		t2.estilo = "Estilo 2";
		
		System.out.println("informacion para t2: ");
		t2.mostrarEstilo();
		t2.mostrarDimension();
		System.out.println("Su area es: " + t2.area());

	}

}
