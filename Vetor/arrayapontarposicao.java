package Vetor;

import java.util.Scanner;

public class arrayapontarposicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		
		int[] vetorA = new int [4];
		int maiorA = Integer.MIN_VALUE;
		int menorA = Integer.MAX_VALUE;
		
		
		for(int i =0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição vetorA " +i);
			vetorA[i] = in.nextInt();
			
		}
		
		System.out.println("VetorA ");
		for(int i =0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		
		if (vetorA[i] > maiorA) {
			maiorA = vetorA[i];
			
		}
		
		if (vetorA[i] < menorA) {
			menorA = vetorA[i];
			}
		}
		
		System.out.println("Menor A " +menorA);
		System.out.println("Maior A " +maiorA);
		
		in.close();
		}
}


