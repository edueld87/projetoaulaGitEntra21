package Lista06Extra;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* Questao 06: Elabore um programa que receba do usu�rio um n�mero maior que zero e menor que 100.
		 * Enquanto o n�mero n�o estiver dentro da condi��o, repetir a pergunta. Quando o n�mero for digitado
		 * dentro do intervalo solicitado, se for par, dever� transforma-lo em impar.
		 * Colocar uma condi��o que ele informe todos os n�meros impares em sequencia crescente, at� atingir o n�mero 100.
		 * Printar na tela a sequencia de n�meros.
		 */
		
		
		Scanner in = new Scanner(System.in);
		
		int x = -1;
		while (x <= 0 || x >= 100) {
			System.out.print("Digite um n�mero maior que zero e menor que 100: ");
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
