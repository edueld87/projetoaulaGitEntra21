package Vetor;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// criar dois vetores inteiros com tamanho 10 imprmir o menor valor e maior valor, fazer a soma no final
		
		Scanner in = new Scanner(System.in);
		
		int[] vetorA = new int [3];
		int[] vetorB = new int [3];
		int somaA =0;
		int somaB =0;
		int maiorA = Integer.MIN_VALUE;
		int menorA = Integer.MAX_VALUE;
		int maiorB = Integer.MIN_VALUE;
		int menorB = Integer.MAX_VALUE;
		
		
		for(int i =0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição vetorA " +i);
			vetorA[i] = in.nextInt();
					
		}

		for(int i =0; i < vetorB.length; i++) {
			System.out.println("Entre com o valor da posição vetorB " +i);
			vetorB[i] = in.nextInt();
		}
		
		System.out.println("VetorA");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
				somaA += vetorA[i];
				if (vetorA[i] > maiorA) {
					maiorA = vetorA[i];
								
				}
				if (vetorA[i] < menorA) {
					menorA = vetorA[i];
				}
			
	}
		System.out.println("\nVetorB");
		for(int i = 0; i < vetorB.length; i++) {
		System.out.print(vetorB[i] + " ");
				somaB += vetorB[i];
				
		
				if (vetorB[i] > maiorB) {
					maiorB = vetorB[i];
								
				}
				if (vetorB[i] < menorB) {
					menorB = vetorB[i];
	}
				if (somaA > somaB) {
				System.out.println("A maior soma é do VetorA");	
			}	else {
					System.out.println("A maior soma é do VetorB");	
			}
		}		
					System.out.println("\nSoma vetor A \n" +somaA);
					System.out.println("\nSoma vetor B \n" +somaB);	
			
					System.out.println("Maior valor digitado no array A \n" +maiorA);	
					System.out.println("Menor valor digitado no array A \n" +menorA);
					
					System.out.println("Maior valor digitado no array B \n" +maiorB);	
					System.out.println("Menor valor digitado no array B \n" +menorB);
					
					in.close();
				}
			}


