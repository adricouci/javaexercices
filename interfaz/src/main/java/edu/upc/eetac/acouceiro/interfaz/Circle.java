package edu.upc.eetac.acouceiro.interfaz;

public class Circle extends PrimaryShape {
	
	private double radi;
	
	public Circle (double radi){
		super("circle");
		this.radi = radi;
	}
	
	public double getRadi(){
		return radi;
	}
	
	public void setRadi(double radi) {
		this.radi = radi;
	}
	
	
	public double area() {
		return Math.PI * radi * radi;
	}
}






