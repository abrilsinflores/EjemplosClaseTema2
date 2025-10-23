package es.upm.aled.datastructures;

public class MiLinkedList {

	private Node primero;
	private Node ultimo;
	
	public MiLinkedList(Node primero) {
		this.primero = primero;
		this.ultimo = primero;
	}

	public Node getPrimero() {
		return primero;
	}
	
	//insertar un nodo al final
	public void addNode(Node nuevo) {
		this.ultimo.setNext(nuevo);
		this.ultimo = nuevo;
	}

	public void setPrimero(Node primero) {
		this.primero = primero;
	}
	
	//inserción
	public void insertar(Node despuesDe, Node aInsertar) {
		aInsertar.setNext(despuesDe.getNext());
		despuesDe.setNext(aInsertar);
	}
	
	//borrado HECHO EN CASA 
	public void borrar(Node aBorrar, Node antesDe) {
		antesDe.setNext(aBorrar.getNext());
		aBorrar.setNext(null);
	}
}
