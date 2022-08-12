package Lista07ExerciciosVetoresArrays;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Questao 16-Criar um programa que leia um vetor A[20]. A seguir, compacte este vetor A, retirando todos os valores 
		 * nulos ou negativos e mostre então o vetor compactado.
		 */
		
		Scanner in = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("\nInforme os valores:");
			vetorA[i] = in.nextInt();
			
			if(vetorA[i] > 0) {
				vetorB[i] = vetorA[i];
			}
			
			
		}
		for(int i = 0; i < vetorB.length; i++) {
		System.out.print("\nvetor B:" +vetorB[i]);
	}
		in.close();
			}

	}
