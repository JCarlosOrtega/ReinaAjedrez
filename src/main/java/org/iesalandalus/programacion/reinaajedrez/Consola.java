package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	
	private static int opcionElegida=0, numColorElegido=0, direccionElegida=0, pasosAMover=0;
	
	
	private Consola () {
		
	}
	
	public static void mostrarMenu () {
		

		System.out.println("1. Crear una Reina por defecto.");
		System.out.println("2. Crear una Reina eligiendo color.");
		System.out.println("3. Mover.");
		System.out.println("4. Salir.");
	}

	public static int elegirOpcionMenu () {
		
		System.out.println("¿Qué acción quieres realizar?");
		do {
		System.out.println("Elige entre las opciones 1 - 4");
		opcionElegida=Entrada.entero();
		} while (opcionElegida < 1 || opcionElegida > 4);
		
		return opcionElegida;
	}
	
	public static Color elegirColor () {
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
	
	public static void mostrarMenuDirecciones () {
		System.out.println("¿En que dirección quieres mover a la Reina?");
		
		System.out.println("1. NORTE.");
		System.out.println("2. NORESTE.");
		System.out.println("3. ESTE.");
		System.out.println("4. SURESTE.");
		System.out.println("5. SUR.");
		System.out.println("6. SUROESTE.");
		System.out.println("7. OESTE.");
		System.out.println("8. NOROESTE.");
		
	}
	
	public static Direccion elegirDireccion () {
		mostrarMenuDirecciones();
		do {
		System.out.println("Elige entre las opciones 1-8.");
		direccionElegida=Entrada.entero();
		} while (direccionElegida < 1 || direccionElegida > 8);
		
		switch (direccionElegida) {
			case 1:
					return Direccion.NORTE;
					
			case 2:
					return Direccion.NORESTE;
					
			case 3:
					return Direccion.ESTE;
					
			case 4:
					return Direccion.SURESTE;
					
			case 5:
					return Direccion.SUR;
					
			case 6:
					return Direccion.SUROESTE;
					
			case 7:
					return Direccion.OESTE;
					
			case 8:
					return Direccion.NOROESTE;
					
			default:
				return null;
				
					
		}
		
	}
	
	
	public static int elegirPasos () {
		
		System.out.println("¿Cuántos pasos quieres mover a la Reina?");
		pasosAMover=Entrada.entero();
		
		return pasosAMover;
		
	}
	
	
	
	
}
