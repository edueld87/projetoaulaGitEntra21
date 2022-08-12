package Lista07ExerciciosVetoresArrays;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Questão 6-Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva
		 *  a média aritmética simples dos elementos ímpares armazenados neste vetor.
		 */
		
		
		Scanner in = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int soma =0;
		int numlocalizados = 0;
		int media = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor da posição vetor ["+i+"] | --> ");
			vetorA[i] = in.nextInt();
			
			if(vetorA[i] % 2 != 0) {
				soma += vetorA[i];
				numlocalizados++;
				media = soma / numlocalizados;
				
			}
		
	}
		System.out.println("Média aritimética dos elementos ímpares " +media);
		System.out.println("Foram identificados " +numlocalizados+ " números ímpares");
		System.out.println("Soma " +soma);
		in.close();
}
}