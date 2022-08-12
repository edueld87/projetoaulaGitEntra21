package Lista05;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		char tipocarne, formapag;
		float quantidade, valor; 
		
		System.out.println("Informe qual a carne: (F) File Duplo, (A) Alcatra e (P) Picanha");
		tipocarne = in.next().charAt(0);
		
		System.out.println("Informe a quantidade em KG de carne:");
		quantidade = in.nextFloat();
		
		System.out.println("Informe a forma de pagamento, Opção (1) cartão com 5% de desconto, ou (0) outra forma sem desconto");
		formapag = in.next().charAt(0);
		
		if (tipocarne == 'F' || tipocarne == 'f') {
			System.out.println("Você selecionou File Duplo");
			System.out.println("Foi solicitado " +quantidade+ " KG de carne");
		 if (quantidade < 5) {
				valor = quantidade * 4.90f;
				System.out.println("Você pagará " +valor+ " pela carne");
			 if (formapag == '1') {
				valor = valor - (valor * 0.05f);
				System.out.println("O valor a pagar com desconto será " +valor+ " Reais");
			  } else  {
				  System.out.println("O valor a pagar será o mesmo, sem desconto");
			  }
		 }
			  if (quantidade > 5) {
				valor = quantidade * 5.80f;
				System.out.println("Você pagará " +valor+ " pela carne");
			  if (formapag == '1') {
				valor = valor - (valor * 0.05f);
				System.out.println("O valor a pagar com desconto será " +valor+ " Reais");
			  } else {
				  System.out.println("O valor a pagar será o mesmo, sem desconto");
			  				
			}

			}
			
		}
		
		if (tipocarne == 'A' || tipocarne == 'a') {
			System.out.println("Você selecionou Alcatra");
			System.out.println("Foi solicitado " +quantidade+ " KG de carne");
		 if (quantidade < 5) {
				valor = quantidade * 5.90f;
				System.out.println("Você pagará " +valor+ " pela carne");
			 if (formapag == '1') {
				valor = valor - (valor * 0.05f);
				System.out.println("O valor a pagar com desconto será " +valor+ " Reais");
			  } else  {
				  System.out.println("O valor a pagar será o mesmo, sem desconto");
			  }
		 }
			  if (quantidade > 5) {
				valor = quantidade * 6.80f;
				System.out.println("Você pagará " +valor+ " pela carne");
			  if (formapag == '1') {
				valor = valor - (valor * 0.05f);
				System.out.println("O valor a pagar com desconto será " +valor+ " Reais");
			  } else {
				  System.out.println("O valor a pagar será o mesmo, sem desconto");
			  }
		  }
	}	
			
		
			if (tipocarne == 'P' || tipocarne == 'p') {
				System.out.println("Você selecionou Picanha");
				System.out.println("Foi solicitado " +quantidade+ " KG de carne");
				if (quantidade < 5) {
					valor = quantidade * 6.90f;
					System.out.println("Você pagará " +valor+ " pela carne");
					if (formapag == '1') {
						valor = valor - (valor * 0.05f);
						System.out.println("O valor a pagar com desconto será " +valor+ " Reais");
					} else  {
						System.out.println("O valor a pagar será o mesmo, sem desconto");
					}
				}
				if (quantidade > 5) {
					valor = quantidade * 7.80f;
					System.out.println("Você pagará " +valor+ " pela carne");
					if (formapag == '1') {
						valor = valor - (valor * 0.05f);
						System.out.println("O valor a pagar com desconto será " +valor+ " Reais");
					} else {
						System.out.println("O valor a pagar será o mesmo, sem desconto");
						
						in.close();
					}			
				}	
			}					
		}
	}
	
	
/* Faça um programa que peça ao usuário para escolher o tipo de carne, e digite a quantidade em kg.
 *  O programa deverá:imprimir a quantidade e o tipo de carne  que foi escolhida;
 *  Dependendo do tipo de carne e quantidade;
 *  Definir qual será o valor da carne;
 *  Calcular o valor de carne com quantidade;
 *  Imprimir na mesma linha o calculo feito e o  total;
 *  Informar que se pagamento no cartão digitar a opção 1 e conceder o desconto de 5% no total
 *  imprimir o valor de desconto caso teve
 *  imprimir o total a pagar.
 *  
 *  Qntade    <  5kg | > 5kg  
 *  File Duplo: 4,90 | 5,80
 *  Alcatra:    5,90 | 6,80
 *  Picanha:    6,90 | 7,80
 *  
 */