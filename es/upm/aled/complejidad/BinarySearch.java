package es.upm.aled.complejidad;

public class BinarySearch {
	private static int binarySearch(int[] list, int lo, int hi, int value) {
		do {
			int me = (int) Math.floor(lo + (hi - lo) / 2);
			int v = list[me]; // O(1)
			if (v == value) {
				return me;
			} else if (v > value) {
				hi = me;
			} else {
				lo = me + 1;
			}
		} while (lo < hi);
		return -1;
	}

	// Método facade
	public static int binarySearch(int[] list, int value) {
		return binarySearch(list, 0, list.length, value);
	}

	private static int binarySearchConRecursividad(int[] list, int lo, int hi, int value) {
		//caso base
		if(hi-lo<1) {System.out.println("no se encontró el valor especificado"); return -1;}
		// código general
		int me = (int) Math.floor(lo + (hi - lo) / 2);
		int v = list[me]; // O(1)
		if (v == value) {
			return me;
		}
		// código recursivo
		else if (v > value) {
			return binarySearchConRecursividad(list, lo, me, value);
		} else if (v < value) {
			lo = me + 1;
			return binarySearchConRecursividad(list, lo, hi, value);
		} 
		System.out.println("no se encontró el valor especificado"); 
		return -1;
	}

	// Método facade
	public static int binarySearchConRecursividad(int[] list, int value) {
		return binarySearchConRecursividad(list, 0, list.length, value);
	}

	public static void main(String[] args) {
		// Array ORDENADO
		int[] list = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31 };
		int value = 19;
		int posicion = binarySearch(list, value);
		System.out.println("Posición: " + posicion);

		// prueba del binarySearch con recursividad
		System.out.println("Posición: " + binarySearchConRecursividad(list, 13));
	}

}
