package ejemplos;

public class Ejemplo_Demo {

	public static void main(String[] args) {
		Ejemplo_Demo_Vehiculo minivan = new Ejemplo_Demo_Vehiculo();
		int rango;
		
		//Asignar los valos a los campos de minivan
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;

		//calcular el rango
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de " + rango + " kilometros");
		
		Ejemplo_Demo_Vehiculo carro = new Ejemplo_Demo_Vehiculo();
		carro.pasajeros = 4;
		System.out.println("El carro puede llevar " + carro.pasajeros + " pasajeros");
	}

}
