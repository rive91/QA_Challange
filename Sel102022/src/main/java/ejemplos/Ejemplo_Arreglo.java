package ejemplos;

public class Ejemplo_Arreglo {

	public static void main(String[] args) {
	 int intArray[];
	 int[] intArray2;
	 
	 byte byteArray[];
	 boolean boolArray[];
	 
	 //Declarando un array de strings
	 String[] arr;
	 
	 //asignar memoria para 5 posiciones
	 arr = new String[5];
	 
	 arr[0] = "cero";
	 arr[1] = "uno";
	 arr[2] = "dos";
	 arr[3] = "tres";
	 arr[4] = "cuatro";
	 
	 //System.out.println("Elemento en el indice 3: " + arr[3]);
	 //System.out.println("Elemento en el indice 4: " + arr[4]);
	 
	 for(int i = 0; i < arr.length; i++) {//.lenght es una funcion de java que nos regresa la longitud del arreglo
		 System.out.println("Element en el indice " + i + ": " + arr[i]);
	 }

	}

}
