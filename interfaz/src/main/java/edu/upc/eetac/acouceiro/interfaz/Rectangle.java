package edu.upc.eetac.acouceiro.interfaz;

public class Rectangle extends PrimaryShape 
{
	private double altura;
	private double amplada;
	
	public Rectangle (double amplada, double altura) {
		super("rectangle");
		this.amplada = amplada;
		this.altura = altura;
	}
	
	public double getAmplada() {
		return amplada;
	}
	
	public void setAmplada(double amplada) {
		this.amplada = amplada;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public double area(){
		return altura * amplada;
	}
}
