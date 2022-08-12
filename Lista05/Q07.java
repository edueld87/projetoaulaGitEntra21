package Lista05;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		double valor, valordesc, valorsemdesc;
		char formapag;
		
		System.out.println("informe o valor da compra:");
		valor = in.nextInt();
		
		System.out.println("informe a forma de pagamento, cheque ou dinheiro?");
		formapag = in.next().charAt(0);
		
		if (formapag == 'c' || formapag == 'C') {
		System.out.println("O valor será de: " +valor+ " a pagar");
		} else if (valor >= 100 && formapag == 'd'|| formapag == 'D') {
		valordesc = valor - (valor * 0.1);
		System.out.println("O valor a pagar com desconto será de: " +valordesc);
		} else if (valor <= 100 && formapag == 'd'|| formapag == 'D') {
		valorsemdesc = valor;
		System.out.println("Não gerou desconto, valor a pagar será de: " +valorsemdesc+ " Reais");
		} 
		
		in.close();
	}

}
