package Lista06Extra;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Questao 1-Escreva um programaque verifique a validade de uma senha fornecida pelo usuário.
		 *  A senha válida é o número 1234. Se a senha informada pelo usuário for inválida, 
		 *  a mensagem ACESSO NEGADO deve ser impressa e repetida a solicitação de uma nova senha até que ela seja válida.
		 *   Caso contrário, deve ser impressa a mensagem ACESSO PERMITIDO junto com um número que 
		 *   representa quantas vezes a senha foi informada.
		 */
		
		Scanner in = new Scanner(System.in);
		
		int senha = 1234;
		int cod;
		
		do {
		System.out.print("Informe a senha: (quatro números): ");
		cod = in.nextInt();
		
		if(cod != senha) {
			System.out.print("ACESSO NEGADO\n ");
		}
		
		} while (cod != senha); 
			
		if(cod == senha) {
			System.out.print("ACESSO PERMITIDO");
		}
		in.close();

	}
	}

