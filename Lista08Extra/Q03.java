package Lista08Extra;

import java.util.Random;
import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		Random numeroAleato = new Random();
		int [][] matrizAleato = new int[8][8];
		boolean verificar = false;	

		for(int i = 0; i < matrizAleato.length; i++) {
			for(int j = 0; j < matrizAleato[i].length; j++) {

				matrizAleato[i][j] = numeroAleato.nextInt(30);

				if (matrizAleato[i][j] != matrizAleato[i][j]) {
					verificar = true;
				}	
			}
		}		
		for(int i = 0; i < matrizAleato.length; i++) {
			for(int j = 0; j < matrizAleato[i].length; j++) {
				System.out.print(" "+matrizAleato[i][j]+ "\t|");
			}
			System.out.println();
		}
		if (verificar == true) {
			System.out.println("É uma matriz simétrica");
		} else {
			System.out.println("Não é uma matriz simétrica");
		}
		in.close();
	}
}
