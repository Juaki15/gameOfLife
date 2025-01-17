package aplicacion;
import dominio.Tablero;

import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;

/**
 * Clase que sirve para iniciar y empezar a simular el juego de la vida
 * @author Joaquin Moreno Guzman
 * @version 24-03-2021
 */
public class Principal {
	public static void main (String args[]){
		try{
			Tablero tablero = new Tablero();
			System.out.println("SIMULACION CON TABLERO LEÍDO");
			tablero.leerEstadoActual();
			System.out.println(tablero);
			for (int i = 0; i <= 5 ; i++){
				TimeUnit.SECONDS.sleep(1);
				tablero.transitarAlEstadoSiguiente();
				System.out.println(tablero);
			}
			System.out.println("SIMULACION CON TABLERO GENERADO POR MONTECARLO");
			tablero.generarEstadoActual();
			System.out.println(tablero);
			for (int i = 0; i<=15; i++){
				TimeUnit.SECONDS.sleep(1);
				tablero.transitarAlEstadoSiguiente();
				System.out.println(tablero);
			}
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}
}
