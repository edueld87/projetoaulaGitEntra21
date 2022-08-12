package Lista06Extra;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Questão 5-O mesmo exercício anterior, mas agora não será informado o número de mercadorias em estoque.
		 * Então o funcionamento deverá ser da seguinte forma: 
		 * ler o valor da mercadoria e perguntar ‘MAISMERCADORIAS (S/N)?’. 
		 * Ao final, imprimir o valor total em estoque e a média de valor dasmercadorias em estoque.
		 */
		
				
		Scanner in = new Scanner(System.in);
		
		int soma =0;
		char resp;
		int mercadoria =0;
		int media =0;
		int itens =0;
		
		do {
		System.out.print("Informar o valor da mercadoria: ");
		mercadoria = in.nextInt();
		soma += mercadoria;
		itens++;
		System.out.print("Deseja cadastrar mais mercadorias? (S/N): ");
		resp = in.next().charAt(0);
		
		} while (resp == 'S' || resp == 's');
		
			
				media = soma / itens;
				System.out.print("Total de peças em estoque: " +itens);	
				System.out.print("\nTotal em estoque R$ " +soma);
				System.out.print("\nValor médio em estoque: " +media);
				
				in.close();

	}

}
