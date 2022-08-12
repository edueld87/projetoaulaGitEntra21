package Lista06;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int carteira, nmulta, vlmulta, aux2 = 0, maior = 0, n1, soma = 0;
		
		do {
		int aux = 0;
		System.out.println("Informe o número da carteira de motorista");
		carteira = in.nextInt();
		
		System.out.println("Informe o número de multas");
		nmulta = in.nextInt();
		
		for (int i = 0; i < nmulta; i++) {
			
			System.out.println("Digite o valor das multas");
			vlmulta = in.nextInt();
			
			soma = soma + aux;
			aux = aux + vlmulta;
			
		}
		    aux2 = aux2 + aux;	
			if (nmulta > maior) {
				maior = carteira;
		}
			System.out.println("A soma das multas do motorista " +carteira+ " || " +aux);
			System.out.println(" Digite 1 para cadastrar e 0 para sair");
			n1 = in.nextInt();
		}    while (n1 == 1);
				System.out.println(" Carteira com maior número de multas foi o motorista " +maior);
				System.out.println("A arrecadação das multas foi: " +aux2);
				
				in.close();
		
					}
		}
	


