package org.iesalandalus.programacion.reinaajedrez;

import java.util.Objects;

public class Posicion {

	private int fila;
	private char columna;
	
	public Posicion () {
		setFila(1);
		setColumna('d');
	}
	
	public Posicion (int fila, char columna) throws IllegalArgumentException {
		
		setFila(fila);
		setColumna(columna);
		
	}
	
	public Posicion (Posicion e) {
		setFila(e.getFila());
		setColumna(e.getColumna());
	}
	
	
	
	public int getFila() {
		return fila;
	}
	private void setFila(int fila) {
		if (fila < 1 || fila > 8)
			throw new IllegalArgumentException("ERROR: La fila introducida no es correcta");
		else
			this.fila = fila;
	}
	public char getColumna() {
		return columna;
	}
	private void setColumna(char columna) {
		if (columna != 'a'|| columna != 'b' || columna != 'c' || columna != 'd' || columna != 'e' || columna != 'f' || columna != 'g' || columna != 'h')
			throw new IllegalArgumentException("ERROR: La columna introducida no es correcta");
		else
			this.columna = columna;
	}

	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}

	@Override
	public String toString() {
		return "La Reina está en la fila= " + fila + ", y columna=" + columna;
	}
	
	
	
}
