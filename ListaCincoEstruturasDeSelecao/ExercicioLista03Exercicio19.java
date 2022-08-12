package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class ExercicioLista03Exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int horap, horapp, minutop, minutopp;
		
		System.out.println("Informe a Hora:");
		horap = in.nextInt();
		
		System.out.println("Informe os minutos:");
		minutop = in.nextInt();
		
		horap = horap * 60;
		minutopp = horap + minutop;
		
		System.out.println("A Hora informada representa: " +minutopp+ " minutos");
		
		horap = horap * 60;
		minutop = minutop * 60;
		horapp = horap + minutop;
		
		System.out.println("A hora informada representa " +horapp+ " Segundos");
		
		in.close();
		
		
	}

}
