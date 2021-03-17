package dominio;
import java.lang.Math;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Tablero{
	private static int DIMENSION  = 30;
	private int estadoActual[][] = new int [DIMENSION][DIMENSION];
	private int estadoSiguiente[][] = new int [DIMENSION][DIMENSION]; 

	public void generarEstadoActual(){
		int elementoArray = 0;
		File fichero = new File("matriz.txt");
		Scanner s = new Scanner(fichero);
		FileWriter fw = new FileWriter("matriz.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		try{
			for (int i = 0; i < estadoActual.length; i++){
				for (int j = 0; j < estadoActual.length; j++){
					estadoActual[i][j] = ((int) Math.random() * 1);
					bw.write(estadoActual[i][j]);
					bw.flush();
				}
			bw.newLine();	
			}	
		}catch(IOException | InterruptedException e) {
			System.out.println("Error");
		}	
		
	}
	
	//public void transitarAlEstadosiguiente	
}
