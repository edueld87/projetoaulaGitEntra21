package Lista05;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		char genero;
		float altura, peso;
		
		System.out.println("Informe sua Altura");
		altura = in.nextFloat();
		
		System.out.println("Informe o seu genero, F para feminino ou M para masculino");
		genero = in.next().charAt(0);
		
		if (genero == 'M' || genero == 'm') {
			peso = (72.7f * altura) - 58;
			System.out.println("O seu peso ideal é: " +peso);
		} else if  (genero == 'F' || genero == 'f') { 
			peso = (62.1f * altura) - 44.7f;
			System.out.println("O seu peso ideal é: " +peso);
		} else {
			System.out.println("Opção inválida");
		}
			in.close();	
		}
}

		
		/*Questão_3: Tendo como dados de entrada a altura e o sexo
		de uma pessoa, construa um PROGRAMA que calcule seu 
		peso ideal, utilizando as seguintes fórmulas:
		Para homens: (72.7*alt) - 58;
		Para mulheres: (62.1*alt) - 44.7;*/
		
		
	


