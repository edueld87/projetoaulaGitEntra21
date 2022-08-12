package Lista05;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int codigo;
		String produto = "";
		
		System.out.println("Informe o código para saber a classificação do produto:");
		codigo = in.nextInt();
		
		switch (codigo) {
		case 1:
		produto = "1";
		System.out.println("Alimento não-perecivel");
		break;
		
		case 2:
		produto = "2";
		System.out.println("Alimento perecivel");
		break;
		
		case 3:
		produto = "3";
		System.out.println("Alimento perecivel");
		break;
		
		case 4:
		produto = "4";
		System.out.println("Alimento perecivel");
		break;
		
		case 5:
		produto = "5";
		System.out.println("Vestuario");
		break;
		
		case 6:
		produto = "6";
		System.out.println("Vestuario");
		break;
		
		case 7:
		produto = "7";
		System.out.println("Higiene pessoal");
		break;
		
		case 8:
		produto = "8";
		System.out.println("Limpeza e utensilios domésticos");
		break;
		
		case 9:
		produto = "9";
		System.out.println("Limpeza e utensilios domésticos");
		break;
		
		case 10:
		produto = "10";
		System.out.println("Limpeza e utensilios domésticos");
		break;
		
		case 11:
		produto = "11";
		System.out.println("Limpeza e utensilios domésticos");
		break;
		
		case 12:
		produto = "12";
		System.out.println("Limpeza e utensilios domésticos");
		break;
		
		case 13:
		produto = "13";
		System.out.println("Limpeza e utensilios domésticos");
		break;
		
		case 14:
		produto = "14";
		System.out.println("Limpeza e utensilios domésticos");
		break;
		
		case 15:
		produto = "15";
		System.out.println("Limpeza e utensilios domésticos");
		break;
		
		default:
		produto = "0";
		System.out.println("inválido");
		break; 
		}
			in.close();
		}
	
	}


/*Questão_4: Escreva um PROGRAMA que leia o código de
um determinado produto e mostre a sua classificação. Utilize
a seguinte tabela como referências:*/


