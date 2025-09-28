package es.upm.aled.recursion.backtrack;

public class Test {

	public static void main(String[] args) {
		Coordinate sitio1 = new Coordinate(4,3);
		Coordinate sitio2 = new Coordinate(4,3);
		boolean iguales = (sitio1==sitio2);
		System.out.println("son iguales?: "+iguales); // sale false, tendrán distinta direcc d memoria usamos el equals
		boolean igualesConEquals = (sitio1.equals(sitio2));
		System.out.println("son iguales?: "+igualesConEquals); // sale false tmb xq no hemos q definido  el equals


		
		
	}

}
