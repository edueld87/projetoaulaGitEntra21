package Lista07ExerciciosVetoresArrays;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Questão 7-Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina
		 *  o percentual de elementos pares e ímpares, respectivamente, armazenados neste vetor.
		 */
				
		Scanner in = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int somaPar = 0;
		int somaImp = 0;
		int percentPar;
		int percentImp;
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor da posição vetor ["+i+"] | --> ");
			vetorA[i] = in.nextInt();
		
			if(vetorA[i] % 2 == 0) {
				somaPar++;
			//	percentPar = (somaPar / 10) * 100;
			}

			if(vetorA[i] % 2 != 0) {
				somaImp++;
			}
			
	}
				percentPar = (somaPar * 100) / 10;
				percentImp = (somaImp * 100) / 10;
				System.out.println("Percentual pares " +percentPar+ "% ");
				System.out.println("Percentual ímpares " +percentImp+ "% ");
				
				System.out.println("Soma pares " +somaPar);
				System.out.println("Soma impares " +somaImp);
				
				in.close();
}
}