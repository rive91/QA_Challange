package ejemplos;

public class Ejemplo_Herencia_Triangulo extends Ejemplo_Herencia_DosDimensiones{
	String estilo;
	
	public double area() {
		double areaT = base * altura/2;
		return areaT;
	}

	public void mostrarEstilo() {
		System.out.println("Triangulo es: " + estilo);
	}
}
