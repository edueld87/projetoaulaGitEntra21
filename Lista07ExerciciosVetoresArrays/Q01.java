package Lista07ExerciciosVetoresArrays;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);

		/* Questão 1-Criar um vetor A com 15 elementos inteiros. 
		 * Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deveráser o 
		 * quadrado do respectivo elemento de A, ou seja:B[i] = A[i] * A[i].
		 */
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		
		for(int i =0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " +i);
			vetorA[i] = in.nextInt();
			vetorB[i] = vetorA[i] * vetorA[i];
			
	}

		System.out.println("Vetor A " );
		for(int i =0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println("\nVetor B " );
		for(int i =0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		
		}	
		
			
			in.close();
}
}
