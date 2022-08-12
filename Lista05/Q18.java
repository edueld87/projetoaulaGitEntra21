package Lista05;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		char letra;
		
		System.out.println("Informe a Letra, para verificar se é Vogal ou Consoante");
		letra = in.next().charAt(0);
		
		if (letra == 'A' || letra == 'a' || letra == 'E' || letra == 'e' || letra == 'I' || letra == 'i' || letra == 'O' || letra == 'o' || letra == 'U' || letra == 'u' || letra == 'Y' || letra == 'y') {
			System.out.println("É uma vogal");
			
		} else {
			System.out.println("É uma Consoante");
			
			in.close();
		}
			
	}

}
