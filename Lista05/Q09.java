package Lista05;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		char fruta;
		float preco, precocx;
		
		System.out.println("Informe qual fruta: (L) laranja, (I) limão e (M) morango:");
		fruta = in.next().charAt(0);
		
		System.out.println("Informe o valor unitário da fruta");
		preco = in.nextFloat();
		
		if (fruta == 'L' || fruta == 'l') {
			precocx = preco * 60f;
			System.out.println("O preço da caixa de Laranja é: " +precocx+ " Reais");
		} else if (fruta == 'I' || fruta == 'i') {
			precocx = preco * 80f;
			System.out.println("O preço da caixa de Limão é: " +precocx+ " Reais");
		} else if (fruta == 'M' || fruta == 'm') {
			precocx = preco * 20f;
			System.out.println("O preço da caixa de Morangos será: " +precocx+ " Reais");
		}
in.close();
	}

}
