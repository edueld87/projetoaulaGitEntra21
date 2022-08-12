package Lista08matriz3d;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);

        String[][][] agenda = new String[8][30][12];

        System.out.println("Informe a hora do compromisso: ");
        int hora = in.nextInt();

        System.out.println("Informe o dia em que deseja marcar o compromisso: ");
        int dia = in.nextInt();

        System.out.println("Informe mês: ");
        int mes = in.nextInt();

        System.out.println("Escreva o compromisso que deseja: ");
        agenda[hora][dia][mes] = in.next();

        for (int i = 0; i < agenda.length; i++) {
            for (int j = 0; j < agenda[i].length; j++) {
                for (int k = 0; k < agenda[i][j].length; k++) {
                    if (agenda[i][j][k] == null) {
                        agenda[i][j][k] = "";
                    }

                    System.out.print(" " + agenda[i][j][k] + "\t");
                }
            }
        }

        in.close();
    }
}
