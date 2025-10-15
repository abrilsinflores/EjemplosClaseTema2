package es.upm.aled.complejidad;

public class BubbleSort {
	
	//definición del método bubble sort con complejidad algorítmica O(n^2)
	//me dan un array de ints desordenados y devuelvo uno ordenado
	
	public int[] bubbleSort(int[] arrayDesordenado) {
		int[] arrayOrdenado = arrayDesordenado;
		for(int i = 0; i<arrayOrdenado.length; i++) {
			int valor = arrayOrdenado[i];
			if(valor>arrayOrdenado[i+1]) {
				arrayOrdenado[i] = arrayOrdenado[i+1];
				arrayOrdenado[i+1] = valor;
			}
		}
		
		return arrayOrdenado;
	}
			

	public static void main(String[] args) {
		
		

	}

}
