package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class ExercicioSwitchCaseDiaDaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int dia;
			
		System.out.println("Informe o número do dia para saber qual é o dia da semana:");
		dia = in.nextInt();
		
		String Diadesemana;
		
		switch (dia) {
		case 1:
		Diadesemana = "Domingo";
		System.out.println(Diadesemana);
		break;
		
		case 2:
		Diadesemana = "Segunda";	
		System.out.println(Diadesemana);
		break;
		
		case 3:
		Diadesemana = "Terça";
		System.out.println(Diadesemana);
		break;
		
		case 4:
		Diadesemana = "Quarta";	
		System.out.println(Diadesemana);
		break;
		
		case 5:
		Diadesemana = "Quinta";
		System.out.println(Diadesemana);
		break;
		
		case 6:
		Diadesemana = "Sexta";
		System.out.println(Diadesemana);
		break;
		
		case 7:
		Diadesemana = "Sábado";	
		System.out.println(Diadesemana);
		break; 
		
		default:
		Diadesemana = "Não é um dia da semana";
		System.out.println(Diadesemana);
		break; }
		
		in.close();
		
	}

}
