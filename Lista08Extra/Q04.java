package Lista08Extra;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int[][] matrizA = new int[10][5];
		int[] vetorA = new int[10];


		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print("Informe os números inteiros para preencher a matriz: ");
				matrizA[i][j] = in.nextInt();
			}

		}
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print(" "+matrizA[i][j]+ "\t|");

				if (matrizA[i][j] % 7 == 0) {
					vetorA[i] = matrizA[i][j];
				}
			}
			System.out.println();

		}
		for (int i = 0; i < vetorA.length; i++) {	
			System.out.println(" ");
			System.out.print(vetorA[i]+ "\t|");			
		}
		in.close();
	}
}
