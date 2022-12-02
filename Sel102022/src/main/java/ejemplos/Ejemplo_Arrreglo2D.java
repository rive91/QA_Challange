package ejemplos;

public class Ejemplo_Arrreglo2D {

	public static void main(String[] args) {
		int arr[][] = {{2 , 7 , 9},{3 , 6 , 1 , 5, 5},{7 , 4 , 5 , 7}};

		System.out.println(arr[0][1]);
		
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");//"print" en la misma linea
			}
			System.out.println();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");//"print" en la misma linea
			}
			System.out.println();
		}
	}

}
