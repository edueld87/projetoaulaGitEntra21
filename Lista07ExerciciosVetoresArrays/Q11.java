package Lista07ExerciciosVetoresArrays;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Questão 11-Números palíndromos são aqueles que escritos da direita para a esquerda têm o mesmo valor
		 *  quando escritos da esquerda para a direita. Exemplo: 545; 789987; 97379; 123454321; etc. 
		 *  Escreva um programa que verifique se um dado vetor A de 10 elementos inteiros é um palíndromo, 
		 *  ou seja, se o primeiro elemento do vetor e igual ao último, se o segundo elemento do vetor é igual ao penúltimo
		 *  e assim por diante até verificar todos os elementos ou chegar a conclusão que o vetor não é um palíndromo.
		 */
		
		
		Scanner in = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int palindromo =0;
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor da posição vetor ["+i+"] | --> ");
			vetorA[i] = in.nextInt();
			
		}
		
		if(vetorA[0] == vetorA[9]) {
			palindromo++;
		}
		if (vetorA[1] == vetorA[8]) {
			palindromo++;
		}	
		if (vetorA[2] == vetorA[7]) {
			palindromo++;
		}	
		if (vetorA[3] == vetorA[6]) {
			palindromo++;
		}
		if (vetorA[4] == vetorA[5]) {
			palindromo++;
		}
		
		if(palindromo >= 1) {
			System.out.print("Foi / foram identificados " +palindromo+ " números palindromos");
		}	
		if (palindromo == 0) {
			System.out.print("Não foram identificados números palindromos");	
			
		}
		in.close();
		}
	}
		
