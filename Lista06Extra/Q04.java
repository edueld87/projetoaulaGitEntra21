package Lista06Extra;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Quest�o 4-Uma loja est� levantando o valor total de todas as mercadorias em estoque.
		 *  Escreva um programa que permita a entrada das seguintes informa��es: 
		 *  a) o n�mero total de mercadorias no estoque;
		 *   b) ovalor de cada mercadoria.
		 *    Ao final imprimir o valor total em estoque e a m�dia de valor das mercadorias.
		 */
		
		
		Scanner in = new Scanner(System.in);
		
		int n = 0;		
		int totalmerc =0;
		int media;
		int soma =0;
		
		
		System.out.print("informar a quantidade de pe�as em estoque: ");
		n = in.nextInt();
		
		int[] valestoque = new int[n+1];
		
		for(int i = 1; i < valestoque.length; i++) {
			System.out.print("Informe o valor da mercadoria  ["+i+"]: " );
			valestoque[i] = in.nextInt();
			totalmerc += valestoque[i];
			soma++;
		}
	
		media = totalmerc / soma; 
		System.out.print("Total de pe�as em estoque: " +soma);
		System.out.print("\nM�dia valor das mercadorias: " +media);
		
		in.close();

	}

}
