package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	
	private int opcionElegida=0, numColorElegido=0;
	
	
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
	
	public Color elegirColor () {
		do {
		System.out.println("¿Qué color quieres elegir?");
		System.out.println("1. BLANCO.");
		System.out.println("2. NEGRO.");
		numColorElegido=Entrada.entero();
		} while (numColorElegido > 2 || numColorElegido < 1);
		
		
		if (numColorElegido == 1)
			return Color.BLANCO;
		else
			return Color.NEGRO;
	}
	
	
}
