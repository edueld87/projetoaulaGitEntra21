package Vetor;

import java.util.Scanner;

public class ExemploVetor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os mesmos elementos
		// do vetor A, ou seja B[i] = A[i];
		
		Scanner in = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for(int i =0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " +i);
			vetorA[i] = in.nextInt();
			vetorB[i] = vetorA[i];
		}
		System.out.println("Vetor A " );
		for(int i =0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println("Vetor B " );
		for(int i =0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");

	}
		in.close();
	}
}
