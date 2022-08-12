package Lista08matriz3d;

import java.util.Random;

public class Q03 {

	public static void main(String[] args) {
		
		Random numeroAleato = new Random();
		int [][] matrizAleato = new int[10][10];
		int maior = 0;
		int menor = 0;

		for(int i = 0; i < matrizAleato.length; i++) {
			for(int j = 0; j < matrizAleato[i].length; j++) {
				

				matrizAleato[i][j] = numeroAleato.nextInt(10);
				if(matrizAleato[4][j] > maior) {
					maior = matrizAleato[4][j];
					}
				if(matrizAleato[i][6] < menor) {
					menor = matrizAleato[i][6];
				}
			}	
		}
		for(int i = 0; i < matrizAleato.length; i++) {
			for(int j = 0; j < matrizAleato[i].length; j++) {
				System.out.print(" " +matrizAleato[i][j]+ "\t");
				
	}
			System.out.println();
			
		}
		System.out.println("\n Maior da linha 5: " +maior);
		System.out.println(" Menor da coluna 7: " +menor);
	}
}
