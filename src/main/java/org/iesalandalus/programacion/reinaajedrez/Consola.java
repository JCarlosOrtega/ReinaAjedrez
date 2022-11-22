package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	
	private int opcionElegida=0;
	
	
	private Consola () {
		
	}
	
	public void mostrarMenu () {
		

		System.out.println("1. Crear una Reina por defecto.");
		System.out.println("2. Crear una Reina eligiendo color.");
		System.out.println("3. Mover.");
		System.out.println("4. Salir.");
	}

	public int elegirOpcionMenu () {
		mostrarMenu();
		System.out.println("¿Qué acción quieres realizar?");
		do {
		System.out.println("Elige entre las opciones 1 - 4");
		opcionElegida=Entrada.entero();
		} while (opcionElegida < 1 || opcionElegida > 4);
		
		return opcionElegida;
	}
}
