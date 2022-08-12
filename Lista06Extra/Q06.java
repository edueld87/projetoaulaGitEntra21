package Lista06Extra;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* Questao 06: Elabore um programa que receba do usuário um número maior que zero e menor que 100.
		 * Enquanto o número não estiver dentro da condição, repetir a pergunta. Quando o número for digitado
		 * dentro do intervalo solicitado, se for par, deverá transforma-lo em impar.
		 * Colocar uma condição que ele informe todos os números impares em sequencia crescente, até atingir o número 100.
		 * Printar na tela a sequencia de números.
		 */
		
		
		Scanner in = new Scanner(System.in);
		
		int x = -1;
		while (x <= 0 || x >= 100) {
			System.out.print("Digite um nœmero maior que zero e menor que 100: ");
			x= in.nextInt();
		}

		if(x % 2 == 0){
			x= x + 1;
		}
		while(x < 100) {
			System.out.print(x+ ", ");
			x= x+ 2;
		}
		in.close();
	}

}
