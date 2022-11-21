package org.iesalandalus.programacion.reinaajedrez;

public class Posicion {

	private int fila;
	private char columna;
	
	public Posicion (int fila, char columna) throws IllegalArgumentException {
		
		setFila(fila);
		setColumna(columna);
		
	}
	
	
	
	
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		if (fila < 1 || fila > 8)
			throw new IllegalArgumentException("ERROR: La fila introducida no es correcta");
		else
			this.fila = fila;
	}
	public char getColumna() {
		return columna;
	}
	public void setColumna(char columna) {
		if (columna != 'a'|| columna != 'b' || columna != 'c' || columna != 'd' || columna != 'e' || columna != 'f' || columna != 'g' || columna != 'h')
			throw new IllegalArgumentException("ERROR: La columna introducida no es correcta");
		else
			this.columna = columna;
	}
	
	
	
}
