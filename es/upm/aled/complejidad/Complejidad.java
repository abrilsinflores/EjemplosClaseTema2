package es.upm.aled.complejidad;

public class Complejidad {
	
	//si el array mide 100 esto se ejecuta 100 veces
	//devolver suma d todos enteros de un array
	//o(N-1+1+1)
	public static int sumIntArray(int[] lista) {
		int sum = 0;
		//esto se ejecuta tantas veces como el tamaño del array - 1
		for(int i = 0; i<lista.length; i++) {
			sum += lista[i];
		}
		return sum;

	}
	
	//o(1+1+n-1+n+1)
	public static int sumIntArrayTwice(int[] lista) {
		int sum = 0;
		//si el array mide 100 esto se ejecuta 100 veces
		//esto se ejecuta tantas veces como el tamaño del array - 1
		for(int i = 0; i<lista.length; i++) {
			sum += lista[i];
		}
		//otras 100
		//esto se ejecuta tantas veces como el tamaño del array - 1
		for(int j = 0; j<lista.length; j++) {
			sum += lista[j];
		}
		//se ha sumado 200 veces
		return sum;

	}
	
	public static int sumIntArrayStop69(int[] lista) {
		int sum = 0;
		//esto se ejecuta tantas veces como el tamaño del array - 1
		for(int i = 0; i<lista.length; i++) {
			if(lista[i]==69) {
				return sum;
			}
			sum += lista[i];
		}
		return sum;
	}
	
	//si el array mide 100
	//o(n*n+1+1) -> o(n^2)
	//method pa contar los números duplicados en un array
	public static int numDuplicates(int[] lista) {
		int numDupl = 0;
		for(int i = 0; i <lista.length; i++) {
			for(int j = 0; j<lista.length; j++) {
				//esto se ejecuta tantas veces como (tamaño de array)^2
				//esto se ejecuta 10000
				if((i<j) && (lista[i]==lista[j])) {
					numDupl++;
				}
			}
		}
		return numDupl;
	}

}
