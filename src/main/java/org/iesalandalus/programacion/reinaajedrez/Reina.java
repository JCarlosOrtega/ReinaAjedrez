package org.iesalandalus.programacion.reinaajedrez;

public class Reina {
	
	private Color color;
	private Posicion posicion;
	
	
	public Reina () {
		
		setColor(Color.BLANCO);
		setPosicion(posicion);
		
	}
	
	public Reina (Color color, Posicion posicion) {
		
	}
	
	
	
	
	
	
	
	
	
	public Color getColor() {
		return color;
	}
	private void setColor(Color color) {
		
		this.color = color;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	private void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
