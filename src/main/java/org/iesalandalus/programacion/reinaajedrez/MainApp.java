package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
	
	private static Reina reina;
	
	
	public static void main(String[] args) {
		
			
		Consola.mostrarMenu();
		
		ejecutarOpcion(Consola.elegirOpcionMenu());
		
	}
	
	private static void ejecutarOpcion(int opcion) {
		
		switch (opcion) {
		case 1:
				crearReinaDefecto();
				mostrarReina();
			break;
		case 2:
				crearReinaColor(Consola.elegirColor());	
				mostrarReina();
			break;
		case 3:
				
				mostrarReina();
			break;
		case 4:
				System.out.println("Gracias por usar la aplicación, hasta la vista.");
				System.exit(0);
			break;

		default:
			break;
		}
		
	}

	private static void crearReinaDefecto() {
		reina=new Reina();
		System.out.println("Hemos creado una Reina por defecto.");
		System.out.println(reina.toString());
		
		
	}
	
	private static Reina crearReinaColor (Color color) {
		reina=new Reina(color);
		System.out.println("Hemos creado una Reina por defecto de color "+reina.getColor());
		System.out.println(reina.toString());
		return reina;
	}
	
	private static void mostrarReina () {
		System.out.println(reina.toString());
		Consola.mostrarMenu();
		ejecutarOpcion(Consola.elegirOpcionMenu());
	}
	
	
}
