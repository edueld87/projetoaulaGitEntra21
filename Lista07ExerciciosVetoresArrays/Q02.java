package Lista07ExerciciosVetoresArrays;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		/* Questão 2-Criar um vetor A com 10 elementos inteiros. Construir um vetor B demesmo tipo e tamanho, 
		 * sendo que cada elemento do vetor B deverá ser o respectivo elemento de A multiplicado por sua posição (ou índice),
		 *  ou seja:B[i] = A[i] * i.
		 *  Construir um vetor C demesmo tipo e tamanho que A, sendo que cada elemento do vetor C deveráser o resto da divisão
		 *   do respectivo elemento de A por 2 (dois), ouseja: C[i] := A[i] % 2.
		 */

		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " +i);
			vetorA[i] = in.nextInt();
			vetorB[i] = vetorA[i] * i;
			vetorC[i] = vetorA[i] % 2;
			
		}
			
			System.out.println("Vetor A " );
			for(int i =0; i < vetorA.length; i++) {
				System.out.print(vetorA[i] + " ");
			}
			System.out.println("\nVetor B " );
			for(int i =0; i < vetorB.length; i++) {
				System.out.print(vetorB[i] + " ");
			
			}	
			System.out.println("\nVetor C " );
			for(int i =0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");	
				
				in.close();
			
			
		}
	}

}
