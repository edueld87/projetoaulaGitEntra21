package ListaExtra;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		float preco1, preco2, preco3;
		
		System.out.println("Informe o preço do produto 1:");
		preco1 = in.nextFloat();
		
		System.out.println("Informe o preço do produto 2:");
		preco2 = in.nextFloat();
		
		System.out.println("Informe o preço do produto 3:");
		preco3 = in.nextFloat();
		
		if (preco1 < preco2 && preco1 < preco3) {
			System.out.println("O menor valor é o do preço 1 " +preco1);
		} else if (preco2 < preco1 && preco2 < preco3) {
			System.out.println("O menor valor é o do preço 2 " +preco2);
		} else if (preco3 < preco1 && preco3 < preco2) {
			System.out.println("O menor valor é o do preço 3 " +preco3);
		} else if (preco1 == preco2 && preco1 == preco3) {
			System.out.println("Os três valores são iguais");
		} else if (preco1 == preco2) {
			System.out.println("Compre o produto 1 ou o produto 2");
		} else if (preco1 == preco3) {
			System.out.println("Compre o produto 1 ou o produto 3");
		} else if (preco2 == preco3) {
			System.out.println("Compre o produto 2 ou o produto 3");
		}
	in.close();
	}

}






/* Faça um programa  que pergunte o preço de três produtos e informe qual produto você deve comprar,
 *  sabendo que a decisão sempre é pelo mais barato. */
