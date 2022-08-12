package Lista06;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String nome = "";
		int idade, salario;
		char genero;
		char estado;
		
		System.out.println("Informe o seu nome: ");
		nome = in.next();
		
		do {
		System.out.println("Informe a sua idade: ");
		idade = in.nextInt();
		}
		while (idade < 0 || idade > 100);
		
		do {
		System.out.println("Informe o seu salario: ");
		salario = in.nextInt();
		}
		while (salario < 0);
		
		do {
		System.out.println("Informe o seu sexo (f) feminino ou (m) masculino: ");
		genero = in.next().charAt(0);
		}
		while (genero != 'f' && genero != 'm');
		
		do {
		System.out.println("Informe o seu estado civil: (s) solteiro (c) casado (v) viuvo (d) divorciado:");
		estado = in.next().charAt(0);
		}
		while (estado != 's' && estado != 'c' && estado != 'v' && estado != 'd');
		
		System.out.println("Seu nome: " +nome);
		System.out.println("Sua idade: " +idade);
		System.out.println("Seu salario: " +salario);
		System.out.println("Seu genero: " +genero);
		System.out.println("Seu estado civil: " +estado);
		
		in.close();
		}	
				
		
}	
		
		
		
		
	
	
		
		


