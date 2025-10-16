package es.upm.aled.complejidad;

import java.util.Arrays;

public class MergeSort {
	
	//algoritmo que ordena un conjunto de datos (array d int) diviéndolo en intervalos 
	//con el número de elementos más ínfimo a comparar: 2 elementos entre sí (o 1 si es impar)
	


	private static int[] mergeSort(int[] list) {
		// Caso base
		if (list.length == 1) {
			return list;
		}
		// Paso recursivo
		int[] left = Arrays.copyOfRange(list, 0, list.length/2); // O(n/2)
		int[] right = Arrays.copyOfRange(list, list.length/2, list.length);// O(n/2)
		// Ordeno la mitad izquierda
		int[] sortedLeft = mergeSort(left);   // O(log SOMETHING_N)
		// Ordeno la mitad derecha
		int[] sortedRight = mergeSort(right); // O(log SOMETHING_N)
		// Creo el array en el que pondré las cosas ordenadas
		int[] sortedMerged = new int[list.length];
		int iMerged = 0, iLeft = 0, iRight = 0;
		while (iLeft < sortedLeft.length || iRight < sortedRight.length) {
			// Si el izquierdo se me acabó
			if (iLeft == sortedLeft.length) {
				// Cojo del array derecho
				sortedMerged[iMerged] = sortedRight[iRight];
				iRight++;
				iMerged++;
			}
			// Si el derecho se me acabó
			else if (iRight == sortedRight.length) {
				// Cojo del array izquierdo
				sortedMerged[iMerged] = sortedLeft[iLeft];
				iLeft++;
				iMerged++;
			}
			else if (sortedLeft[iLeft] <= sortedRight[iRight]) {
				// Cojo del array izquierdo
				sortedMerged[iMerged] = sortedLeft[iLeft];
				iLeft++;
				iMerged++;
			}
			else if (sortedLeft[iLeft] > sortedRight[iRight]) {
				// Cojo del array derecho
				sortedMerged[iMerged] = sortedRight[iRight];
				iRight++;
				iMerged++;
			}
		}
		return sortedMerged;

	}
	
	public static void main(String[] args) {
		int[] list = { 31, 29, 27, 25, 23, 21, 19, 17, 15, 13, 11, 9, 7, 5, 3, 1 };
		int[] listBazillion = new int[1000000];
		for (int i = 0; i < listBazillion.length; i ++) {
			listBazillion[i] = 1000000 - i;
		}
		long t1 = System.nanoTime();
		int[] listOrdenada = mergeSort(listBazillion);
		long t2 = System.nanoTime();
		System.out.println("Esto tarda: " + (t2-t1));
//		System.out.println("Ordenado:");
//		for (int v : listOrdenada) {
//			System.out.println(v);
//		}
	}


}
