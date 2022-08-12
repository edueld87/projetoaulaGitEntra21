package Lista08matriz3d;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String[][] agenda = new String[24][30];

		System.out.println("Informe o dia do mês para angendar o compromisso");
		int hora = in.nextInt();

		System.out.println("Informe a hora do compromisso");
		int dia = in.nextInt();

		for(int i = 0; i < agenda.length; i++) {
			for(int j = 0; j < agenda[i].length; j++) {


				if(hora == i && dia == j) {
					System.out.println("Escreva o compromisso que deseja: ");
					agenda[i][j] = in.next();
				}

				if(agenda[i][j] == null) {
					agenda[i][j] = "";
				}

			}

		}

		for(int i = 0; i < agenda.length; i++) {
			for(int j = 0; j < agenda[i].length; j++) {
				System.out.print(" " +agenda[i][j]+ "\t");

			}
			System.out.println();

		}
		in.close();
	}

}
