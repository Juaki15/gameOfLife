package dominio;
import java.lang.Math;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Tablero{
	private static int DIMENSION  = 30;
	private int[][] estadoActual = new int [DIMENSION][DIMENSION];
	private int[][] estadoSiguiente = new int [DIMENSION][DIMENSION]; 
	
	public void generarEstadoActual(){
    		for (int i = 0 ; i < estadoActual.length; i++) {
			for (int j = 0; j < estadoActual[i].length; j++) {
				int matriz = estadoActual[i][j] = ((int) Math.random()*1);
				//System.out.println(matriz);
			}	
		}
		System.out.println(estadoActual);
	}
}
