package Lista06Extra;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Questao 1-Escreva um programaque verifique a validade de uma senha fornecida pelo usu�rio.
		 *  A senha v�lida � o n�mero 1234. Se a senha informada pelo usu�rio for inv�lida, 
		 *  a mensagem ACESSO NEGADO deve ser impressa e repetida a solicita��o de uma nova senha at� que ela seja v�lida.
		 *   Caso contr�rio, deve ser impressa a mensagem ACESSO PERMITIDO junto com um n�mero que 
		 *   representa quantas vezes a senha foi informada.
		 */
		
		Scanner in = new Scanner(System.in);
		
		int senha = 1234;
		int cod;
		
		do {
		System.out.print("Informe a senha: (quatro n�meros): ");
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

