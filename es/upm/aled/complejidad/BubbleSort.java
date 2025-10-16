package es.upm.aled.complejidad;

import java.util.Arrays;

public class BubbleSort {
	
	//definición del método bubble sort con complejidad algorítmica O(n^2)
	//me dan un array de ints desordenados y devuelvo uno ordenado


	private static void bubbleSort(int[] list) {
		for (int i = 0 ; i < list.length; i++) {
			for (int j = 0; j < list.length - 1 - i; j++) { //x qué -1-i?
				//-1 xq voy comparando con el sigueinte, q es j+1
				//si no, devolvería arrayoutofboundexception
				//-i xq este método deja el número más grande d todos en la última posicc
				//luego en la siguiente iteración no hace falta comparar con el último
				//y así para la todos, para i = 3 no hace falta comparar con los 3 últimos...
				// Si es mayor el segundo, los cambiamos
				if (list[j] > list[j+1]) {
					// Permutacion de dos números
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] list = { 31, 29, 27, 25, 23, 21, 19, 17, 15, 13, 11, 9, 7, 5, 3, 1 };
		int[] listBazillion = new int[1000000];
		for (int i = 0; i < listBazillion.length; i ++) {
			listBazillion[i] = 1000000 - i;
		}
		long t1 = System.nanoTime();
		bubbleSort(listBazillion);
		long t2 = System.nanoTime();
		System.out.println("Esto tarda: " + (t2-t1)); //muchísimo, x eso se deja comentado ->
//		System.out.println("Ordenado:");
//		for (int v : list) {
//			System.out.println(v);
//		}
	}

}
