package es.upm.aled.complejidad;

import java.util.Arrays;

public class BinarySearch {
	
	//buscamos por división de intervalos en un array ORDENADO un valor concreto
	//devuelve la posición del array en la q se encuentra el valor pedido
	//he implementado que pueda devolverse posicc array original aunq no esté ordenado
	
	public static int binarySearch(int[] arrayParaBuscar, int valueToSearch) {
		//me aseguro de que el Array esté ordenado
		int[] miArray = BubbleSort.bubbleSort(arrayParaBuscar);
		int index = -1;
		int high = miArray.length-1;
		int low = 0;
		
		do {
			int indexPuntoMedio = (int)Math.floor((high-low)/2);	
			int puntoMedio = miArray[indexPuntoMedio];
			if(puntoMedio>valueToSearch) {
				high = indexPuntoMedio+1; 
			}
				
			else if(puntoMedio<valueToSearch) {
				low = indexPuntoMedio;
			}
					
			else if(puntoMedio==valueToSearch) {
				//si el valor coincide, queremos que nos devuelva la posición en la que estaba en el array ORIGINAL
				index = Arrays.binarySearch(arrayParaBuscar, puntoMedio);
				break;
			}
		} while(low<high);//si low=high es q ya hemos revisado un intervalo d un único elemento, así q no seguimos
		
		//si no se halla el valor
		if(index == -1) {
			System.out.println("El valor especificado no está en el array dado");
		}
		return index;
	}

	public static void main(String[] args) {
		int[] miArray1 = {1,2,3,4,5,6,7,8,9,10};
		int[] miArray2 = {1,6,54,5,4,6,16,20,9,100};
		int[] miArray3 = {1,2,3,4,5,6,7,8,9,10};

		System.out.println("comprobación del método con distintos casos");
		System.out.println("Caso 1: el array está ordenado y el valor pedido está. Posición: "+BinarySearch.binarySearch(miArray1,5));
		System.out.println("Caso 2: el array está desordenado y el valor pedido está. Posición: " +BinarySearch.binarySearch(miArray2,54));
		System.out.println("Caso 3: el valor pedido no está. Posición: "+BinarySearch.binarySearch(miArray3,0));

	}

}
