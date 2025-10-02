package es.upm.es.aled.recursion.data;

import java.util.ArrayList;
import java.util.List;

public class Persona {

	private String nombre;
	private List<Persona> hijos;
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
		this.hijos = new ArrayList<Persona>();
	}

	public String getNombre() {
		return nombre;
	}

	public List<Persona> getHijos() {
		return hijos;
	}

	public void addHijo(Persona p) { // TODO 
		if(!hijos.contains(p)) {
			this.hijos.add(p);
		}
	}
	
	//Devuelve un String con todos los descendientes (usar recursividad)
	public String descendientes() { // TODO:
		//caso base
		if(this.hijos.size()==0) {
			return this.nombre;
		}
		
		//paso recursivo
		String misDescendientes = this.nombre + ": ";
		for(Persona hijo:this.hijos) {
			String descendientes = hijo.descendientes();
			misDescendientes = misDescendientes + descendientes + ",";
			
		}
		return descendientes;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona ro = new Persona("Rodrigo");
		Persona no = new Persona("Nora");
		ro.addHijo(no);
		Persona afro = new Persona("Afrodita");
		ro.addHijo(afro);
		Persona perseo = new Persona("Perseo");
		Persona cronos = new Persona("Cronos");
		afro.addHijo(perseo);
		afro.addHijo(cronos);
		Persona lu = new Persona("Luis");
		no.addHijo(lu);
		Persona ra = new Persona("Ramona");
		no.addHijo(ra);
		System.out.println(ro.descendientes());
		
		
		
		
	}

}
