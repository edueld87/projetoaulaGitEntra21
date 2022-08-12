package Lista06Extra;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Questão2-Escreva um programa que determine se dois valores inteiros e positivos A e B 
		 * são primos entre si (dois números inteiros são ditos primos entre si caso não exista 
		 * divisor comum aos dois números, com exceção do valor 1).
		 */
		
		Scanner in = new Scanner(System.in);
		
		int a, b;
		int maior;
		int primos =0;
		
		System.out.print("informe o valor de A: ");
		a = in.nextInt();
		
		System.out.print("Informe o valor de B: ");
		b = in.nextInt();
		
		if(a>b) {
			maior = a;
		} else {
			maior = b;
		}
		for(int i = 2; i <= maior; i++) {
			if(b % i ==0 && a % i ==0) {
				primos++;
			}
		}

		if(primos == 0) {
			System.out.print("São primos entre SI");
		} else {
			System.out.print("Não são primos entre SI");
		}
		in.close();
	}

}
