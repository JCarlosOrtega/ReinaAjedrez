package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
	
	private static Reina reina;
	
	
	public static void main(String[] args) {
		//Iniciamos la aplicación mostrando los menús para poder realizar 
		//las acciones
			
		Consola.mostrarMenu();
		
		ejecutarOpcion(Consola.elegirOpcionMenu());
		
	}
	
	//Aquí tenemos un método muy importante, el cual nos permite 
	//llamar a todos los métodos necesarios para
	//que la aplicación funcione correctamente
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
				Consola.elegirDireccion();
				Consola.elegirPasos();
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
		
		
		
	}
	
	private static Reina crearReinaColor (Color color) {
		reina=new Reina(color);
		System.out.println("Hemos creado una Reina por defecto de color "+reina.getColor());
		
		return reina;
	}
	
	//En este método he vuelto hacer que muestre la reina y los menús de nuevo
	private static void mostrarReina () {
		
		System.out.println("____________________________");
		System.out.println(reina.toString());
		System.out.println("¿Quieres hacer algo mas?");
		System.out.println("____________________________");
		Consola.mostrarMenu();
		ejecutarOpcion(Consola.elegirOpcionMenu());
	}
	
	
}
