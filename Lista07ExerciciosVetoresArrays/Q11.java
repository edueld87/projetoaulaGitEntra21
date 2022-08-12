package Lista07ExerciciosVetoresArrays;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Quest�o 11-N�meros pal�ndromos s�o aqueles que escritos da direita para a esquerda t�m o mesmo valor
		 *  quando escritos da esquerda para a direita. Exemplo: 545; 789987; 97379; 123454321; etc. 
		 *  Escreva um programa que verifique se um dado vetor A de 10 elementos inteiros � um pal�ndromo, 
		 *  ou seja, se o primeiro elemento do vetor e igual ao �ltimo, se o segundo elemento do vetor � igual ao pen�ltimo
		 *  e assim por diante at� verificar todos os elementos ou chegar a conclus�o que o vetor n�o � um pal�ndromo.
		 */
		
		
		Scanner in = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int palindromo =0;
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor da posi��o vetor ["+i+"] | --> ");
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
			System.out.print("Foi / foram identificados " +palindromo+ " n�meros palindromos");
		}	
		if (palindromo == 0) {
			System.out.print("N�o foram identificados n�meros palindromos");	
			
		}
		in.close();
		}
	}
		
