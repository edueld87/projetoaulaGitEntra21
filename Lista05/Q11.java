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
		
		System.out.println("Informe a operação ser realizada, +, -, * ou /");
		operacao = in.next().charAt(0);
		
		if (operacao == '+') {
			resultado = operador1 + operador2;
			System.out.println("O resultado é: " +resultado);	
		} else if (operacao == '-') {
			resultado = operador1 - operador2;
			System.out.println("O resultado é: " +resultado);
		} else if (operacao == '*') {	
			resultado = operador1 * operador2;
			System.out.println("O resultado é: " +resultado);
		} else if (operacao == '/') {	
			resultado = operador1 / operador2;
			System.out.println("O resultado é: " +resultado);
		}
		in.close();
		}
}



/*Faça  um programa que  simule  uma  calculadora  com as quatro operações básicas (+, -, *, /).
 *  O algoritmo deve solicitar ao usuário a entrada de dois operandos e da operação a ser executada,
 *   na forma de um menu. Dependendo da opção escolhida, deve ser executada a operação solicitada e
 *    escrito seu resultado. Utilize uma variável  caractere  para  armazenar  a  operação  a  
 *    serexecutada  a partir do operador.
 */