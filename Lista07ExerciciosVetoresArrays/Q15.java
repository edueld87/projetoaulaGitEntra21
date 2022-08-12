package Lista07ExerciciosVetoresArrays;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Questao 15– Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima 
		 * cada elemento do vetor A e a relação de todos os divisores do respectivo elemento.
		 */
		
		Scanner in = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int divisor =0;
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("\nEntre com o valor da posição vetor ["+i+"] | --> ");
			vetorA[i] = in.nextInt();
			
			
		for(divisor = 1; divisor < vetorA.length; divisor++) {
			if((vetorA[i] % divisor) == 0) {
				System.out.print("\nDivisor do vetor A ["+i+"] | --> " +divisor);
		}
		}


}
		in.close();
}
	
}
