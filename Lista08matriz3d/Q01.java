package Lista08matriz3d;

import java.util.Random;

public class Q01 {

	public static void main(String[] args) {


		Random numeroAleato = new Random();
		int [][] matrizAleato = new int[4][4];

		for(int i = 0; i < matrizAleato.length; i++) {
			for(int j = 0; j < matrizAleato[i].length; j++) {


				matrizAleato[i][j] = numeroAleato.nextInt(100);

			}	
		}
		for(int i = 0; i < matrizAleato.length; i++) {
			for(int j = 0; j < matrizAleato[i].length; j++) {
				System.out.print("\n" +matrizAleato[i][j]+ "\t");
			}	

			System.out.println();

		}
	}
}


/* 1.Gere e imprima uma matriz M 4x4 com valores aleat�rios entre 0-9. 
 * Ap�s isso determine o maior n�mero da matriz e a sua posi��o(linha, coluna).
 */