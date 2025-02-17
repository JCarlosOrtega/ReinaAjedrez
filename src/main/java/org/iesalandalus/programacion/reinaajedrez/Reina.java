package org.iesalandalus.programacion.reinaajedrez;

public class Reina {
	
	private Color color;
	private Posicion posicion;
	
	//constructores de Reina
	public Reina () {
		
		setColor(Color.BLANCO);
		this.posicion=new Posicion(1, 'd');
		
	}
	
	public Reina (Color color) {
		
		setColor(color);
		
		if (color.equals(Color.BLANCO)) {
			setPosicion(new Posicion(1, 'd'));
		} else {
			setPosicion(new Posicion(8, 'd'));
		}
	}
	
	//este método me ha resultado mas abstracto y no lo he podido comprender del todo
	//la manera de poder hacerlo funcionar
	public void Mover (Direccion direccion, int pasos) {
		
		if (direccion == null)
			throw new NullPointerException("Error: La dirección no puede ser nula.");
		else if (pasos < 1 || pasos > 7)
			throw new IllegalArgumentException("Error: Los pasos deben estar entre 1 y 7.");
		else
		this.Mover(direccion, pasos);
		
		
		
		
		
	}
	
	
	
	
	//Setters and getters de Reina con sus validaciones
	
	public Color getColor() {
		return color;
	}
	private void setColor(Color color) {
		if (color == null)
			throw new NullPointerException("Error: El color no puede ser nulo.");
		if (!color.equals(Color.BLANCO) && !color.equals(Color.NEGRO))
			throw new IllegalArgumentException("Error: El color de la Reina solo puede ser NEGRO O BLANCO");
		this.color = color;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	private void setPosicion(Posicion posicion) {
		if (posicion == null)
			throw new NullPointerException("Error: La posicion no puede ser nula.");
		
		this.posicion = posicion;
	}

	
	//método toString
	
	@Override
	public String toString() {
		return "La Reina es de color: " + color + " y, su posición es: " + posicion.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
