package edu.upc.eetac.acouceiro.constructores;

public class Tree {
	private String arbol;
	private int altura;
	
	public Tree (){
		arbol = null;
		altura = 0;
	}
	
	public Tree (String name) {
		arbol = name;
		altura = 0;
	}
	
	public Tree (String name, int alto) {
		arbol = name;
		altura = alto;
	}
	
	public Tree (int alto) {
		altura = alto;
		arbol = null;
	}
	
	@Override
	public String toString() {
		StringBuilder new_string = new StringBuilder();
		new_string.append("Un ");
		
		if (arbol != null){
			new_string.append(arbol);
		}
		
		else {
			new_string.append("árbol");
		}
		
		if (altura != 0) {
			new_string.append(" de " + altura + " metros");
		}
		
		return new_string.toString();
	}
}


