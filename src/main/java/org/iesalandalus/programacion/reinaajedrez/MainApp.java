package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
	
	Reina reina;
	
	public static void main(String[] args) {
		
	}
	
	private int ejecutarOpcion(int opcion) {
		
		opcion=Entrada.entero();
		
		return opcion;
	}

	private Reina crearReinaDefecto() {
		reina=new Reina();
		return reina;
	}
	
	private Reina crearReinaColor (Color color) {
		reina=new Reina(color);
		return reina;
	}
	
	
}
