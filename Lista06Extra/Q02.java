package Lista06Extra;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Quest�o2-Escreva um programa que determine se dois valores inteiros e positivos A e B 
		 * s�o primos entre si (dois n�meros inteiros s�o ditos primos entre si caso n�o exista 
		 * divisor comum aos dois n�meros, com exce��o do valor 1).
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
			System.out.print("S�o primos entre SI");
		} else {
			System.out.print("N�o s�o primos entre SI");
		}
		in.close();
	}

}
