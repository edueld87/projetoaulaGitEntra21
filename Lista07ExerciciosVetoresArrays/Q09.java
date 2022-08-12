package Lista07ExerciciosVetoresArrays;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Questão 9-Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. 
		 * Escreva um programa que determine e escreva a quantidade de pessoas que possuem idade superior a 35 anos.
		 */
		
		Scanner in = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int idadeSup35 =0;
		
		
		
		for(int i = 0; i < vetorA.length; i++) {
		System.out.print("Entre com o valor da posição vetor ["+i+"] | --> ");
		vetorA[i] = in.nextInt();
		
		if(vetorA[i] > 35) {
			idadeSup35++;
		}

	}
		System.out.println("Foram informados " +idadeSup35+ " Pessoas com idade superior a 35 anos");
		in.close();

}
}