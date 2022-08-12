package Lista07ExerciciosVetoresArrays;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Questão 8-Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva:
		 *  a) a soma de elementos armazenados neste vetor que são inferiores a 15; 
		 *  b) a quantidade de elementos armazenados no vetor que são iguais a 15; e 
		 *  c) a média dos elementos armazenados no vetor que são superiores a 15.
		 */
		
		
		Scanner in = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int somaMenor15 =0;
		int qtdIgual15 =0;
		int qtdAcima15 =0, somaAcima15 =0;
		float mediaMaior15 =0;
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor da posição vetor ["+i+"] | --> ");
			vetorA[i] = in.nextInt();
			
			if(vetorA[i] < 15) {
				somaMenor15 += vetorA[i];
			}
			if(vetorA[i] == 15) {
				qtdIgual15++;
			}
			
			if(vetorA[i] > 15) {
				qtdAcima15++;
				somaAcima15 += vetorA[i];
					}
			}

		mediaMaior15 = somaAcima15 / qtdAcima15;
		System.out.println("\nSoma dos valores inferiores a 15: " +somaMenor15);
		System.out.println("\nQuantidade de elementos iguais a 15: " +qtdIgual15);
		System.out.println("\nMédia dos elementos acima de 15: " +mediaMaior15);
		in.close();
}
}