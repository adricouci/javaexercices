package edu.upc.eetac.acouceiro.interfaz;

public abstract class PrimaryShape implements Shape {
	private String tipo;
	public PrimaryShape(String tipo){
		this.tipo = tipo;
	}
	
	@Override
	public String toString(){
		return "I'm a " + tipo;
	}
}
