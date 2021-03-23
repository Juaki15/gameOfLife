package aplicacion;
import dominio.Tablero;

public class Principal {
	public static void main (String args[]){
		Tablero tablero = new Tablero();
		tablero.generarEstadoActual();
	}
}
