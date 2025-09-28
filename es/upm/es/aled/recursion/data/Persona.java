package es.upm.es.aled.recursion.data;

import java.util.List;

public class Persona {

	private String nombre;
	private List<Persona> hijos;
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
		this.hijos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public List<Persona> getHijos() {
		return hijos;
	}

	public void addHijo(Persona p) {
		this.hijos.add(p);// TODO 
	}

	public String descendientes() {
		// TODO: Devuelve un String con todos los descendientes
		// Seguro que hay que llamar de nuevo a descendientes()
		return null;
	
	//Devuelve un String con todos los descendientes (usar recursividad)
	public String descendientes() { // TODO:
		//caso base
		if(this.hijos.isEmpty()){
			return "(esta persona no tiene descendientes) ";
		}
		//código
		String descendientes = "los descendientes de esa persona son: ";
		
		for(int i=0; i<this.hijos.size(); i++) {
			descendientes += this.hijos.get(i).getNombre()+" "+this.hijos.get(i).descendientes();
		}
		return descendientes;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona ro = new Persona("Rodrigo");
		Persona no = new Persona("Nora");
		ro.addHijo(no);
		Persona lu = new Persona("Luis");
		no.addHijo(lu);
		Persona ra = new Persona("Ramona");
		no.addHijo(ra);
		System.out.println(ro.descendientes());
		
		
		
		
	}

}
