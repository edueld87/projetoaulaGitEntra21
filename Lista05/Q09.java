package Lista05;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		char fruta;
		float preco, precocx;
		
		System.out.println("Informe qual fruta: (L) laranja, (I) lim�o e (M) morango:");
		fruta = in.next().charAt(0);
		
		System.out.println("Informe o valor unit�rio da fruta");
		preco = in.nextFloat();
		
		if (fruta == 'L' || fruta == 'l') {
			precocx = preco * 60f;
			System.out.println("O pre�o da caixa de Laranja �: " +precocx+ " Reais");
		} else if (fruta == 'I' || fruta == 'i') {
			precocx = preco * 80f;
			System.out.println("O pre�o da caixa de Lim�o �: " +precocx+ " Reais");
		} else if (fruta == 'M' || fruta == 'm') {
			precocx = preco * 20f;
			System.out.println("O pre�o da caixa de Morangos ser�: " +precocx+ " Reais");
		}
in.close();
	}

}
