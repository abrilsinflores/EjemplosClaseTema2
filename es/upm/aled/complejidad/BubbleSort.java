package es.upm.aled.complejidad;

import java.util.Arrays;

public class BubbleSort {
	
	//definición del método bubble sort con complejidad algorítmica O(n^2)
	//me dan un array de ints desordenados y devuelvo uno ordenado
	
	public static int[] bubbleSort(int[] arrayDesordenado) {
		int[] arrayOrdenado = arrayDesordenado;
		//para hacer el código más legible:
		int n = arrayOrdenado.length; 
		for(int j = 0; j<n; j++) { //recorremos el array tantas veces como su longitud
			for(int i = 0; (i+1)<n; i++) {
				int valor = arrayOrdenado[i];
				if(valor>arrayOrdenado[i+1]) {
					arrayOrdenado[i] = arrayOrdenado[i+1];
					arrayOrdenado[i+1] = valor;
				}
			}
			
		}
		
		return arrayOrdenado;
	}
			

	public static void main(String[] args) {
		
		int[] miArray = {4,3,45,9,777,5,2,3};
		System.out.println(Arrays.toString(BubbleSort.bubbleSort(miArray)));
	}

}
