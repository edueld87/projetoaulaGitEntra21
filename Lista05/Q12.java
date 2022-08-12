package Lista05;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String nome;
		float n1, n2, n3, mediaaproveita, medianotas;
		
		System.out.println("Informe o nome do Aluno:");
		nome = in.nextLine();
		
		System.out.println("informe a Nota 1:");
		n1 = in.nextFloat();
		
		System.out.println("informe a Nota 2:");
		n2 = in.nextFloat();
		
		System.out.println("informe a Nota 3:");
		n3 = in.nextFloat();
		
		medianotas = (n1 + n2 + n3)/3;
		mediaaproveita = (n1 + (n2 * 2) + (n3 * 3) + medianotas)/7;
		
		System.out.println("O valor da média de aprovaitamento: " +mediaaproveita+ " do aluno " +nome);
		System.out.println("Valor da média: " +medianotas+ " do aluno " +nome);
		
		if (mediaaproveita >= 9) {
		System.out.println("O aluno " +nome+ " Atngiu o conceito A");
		} else if (mediaaproveita >= 7.5 && mediaaproveita < 9) {
			System.out.println("O aluno " +nome+ " Atingiu o conceito B");
		} else if (mediaaproveita >= 6 && mediaaproveita < 7.5) {
			System.out.println("O aluno " +nome+ " Atingiu o conceito C");
		} else if (mediaaproveita < 6 ) {	
			System.out.println("O aluno " +nome+ " Atingiu o conceito D");
	}
in.close();
}

}

/* >= 9 = A
>= 7.5 e < 9 = B
>= 6 e < 7.5 = C
< 6 = D
*/