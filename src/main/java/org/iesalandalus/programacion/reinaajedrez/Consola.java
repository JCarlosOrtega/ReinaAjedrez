package org.iesalandalus.programacion.reinaajedrez;

public class Consola {
	
	private Consola () {
		
	}
	
	public static void mostrarMenu () {
		System.out.println("¡Bienvenido/a!");
		System.out.println("¿Qué acción quieres realiza?");
		System.out.println("Elige entre las opciones 1 - 4");
		System.out.println("1. Crear una Reina por defecto.");
		System.out.println("2. Crear una Reina eligiendo color.");
		System.out.println("3. Mover.");
		System.out.println("4. Salir.");
	}

}
