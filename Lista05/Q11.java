package Lista05;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		float operador1, operador2, resultado;
		char operacao;
		
		System.out.println("Informe o valor do operador 1");
		operador1 = in.nextInt();
		
		System.out.println("Informe o valor do operador 2");
		operador2 = in.nextInt();
		
		System.out.println("Informe a opera��o ser realizada, +, -, * ou /");
		operacao = in.next().charAt(0);
		
		if (operacao == '+') {
			resultado = operador1 + operador2;
			System.out.println("O resultado �: " +resultado);	
		} else if (operacao == '-') {
			resultado = operador1 - operador2;
			System.out.println("O resultado �: " +resultado);
		} else if (operacao == '*') {	
			resultado = operador1 * operador2;
			System.out.println("O resultado �: " +resultado);
		} else if (operacao == '/') {	
			resultado = operador1 / operador2;
			System.out.println("O resultado �: " +resultado);
		}
		in.close();
		}
}



/*Fa�a  um programa que  simule  uma  calculadora  com as quatro opera��es b�sicas (+, -, *, /).
 *  O algoritmo deve solicitar ao usu�rio a entrada de dois operandos e da opera��o a ser executada,
 *   na forma de um menu. Dependendo da op��o escolhida, deve ser executada a opera��o solicitada e
 *    escrito seu resultado. Utilize uma vari�vel  caractere  para  armazenar  a  opera��o  a  
 *    serexecutada  a partir do operador.
 */