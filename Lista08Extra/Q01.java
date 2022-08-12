package Lista08Extra;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
	/*	1 Soma cubo. Gere duas matrizes cuboA e cuboB com Tamanhos [10][3][5].Atribua UMvalor inteiro qualquer na duas matrizes.
		Gere uma terceira matriz cuboCdo mesmo tamanho que cuboA e atribua os valores da soma de cuboA + cuboB. */
		
		
		
		Scanner in = new Scanner(System.in);

		int cuboA[][][] = new int[10][3][5];
		int cuboB[][][] = new int[10][3][5];
		int cuboC[][][] = new int[10][3][5];

		int valorA =2;
		int valorB =1;

		//System.out.println("informe um valor para o cubo A: ");
		//valorA = in.nextInt();

		//System.out.println("informe um valor para o cubo B: ");
		//valorB = in.nextInt();

		//cuboC[10][3][5] = cuboA[10][3][5] + cuboB[10][3][5];

		for (int i = 0; i < cuboA.length; i++) {
			for (int j = 0; j < cuboA[i].length; j++) {
				for (int k = 0; k < cuboA[i][j].length; k++) { 
					cuboA[i][j][k] = valorA;
					//System.out.println(" " + cuboA[i][j][k] + "");
				}

			}
		}
		for (int i = 0; i < cuboB.length; i++) {
			for (int j = 0; j < cuboB[i].length; j++) {
				for (int k = 0; k < cuboB[i][j].length; k++) { 
					cuboB[i][j][k] = valorB;
					//	System.out.println(" " + cuboB[i][j][k] + "");

				}
			}
		}

		for (int i = 0; i < cuboC.length; i++) {
			for (int j = 0; j < cuboC[i].length; j++) {
				for (int k = 0; k < cuboC[i][j].length; k++) { 
					cuboC[i][j][k] = cuboA[i][j][k] + cuboB[i][j][k];
					System.out.println(" " +i+ " " +j+ " " +k);
				}
			}     
		}
		in.close();
	}

}	
	