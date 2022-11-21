package org.iesalandalus.programacion.reinaajedrez;

public class Reina {
	
	private Color color;
	private Posicion posicion;
	
	
	public Reina () {
		
		setColor(Color.BLANCO);
		this.posicion=new Posicion(1, 'd');
		
	}
	
	public Reina (Color color) {
		
		setColor(color);
		if (color == color.BLANCO) {
			setPosicion(new Posicion(1, 'd'));
		} else {
			setPosicion(new Posicion(8, 'd'));
		}
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
