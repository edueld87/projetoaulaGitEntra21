package Lista06;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int codigo, senha;
		
		do {
		System.out.println("Informe o código (numero positivo inteiro)");
		codigo = in.nextInt();
		
		System.out.println("Informe a senha (numero positivo inteiro)");
		senha = in.nextInt();
		
		if (codigo == senha) {
			System.out.println("O codigo deverá ser diferente da senha, cadastre novamente");
		}
		
		} while (codigo == senha);
		
			
		if (codigo != senha) {
			System.out.println("O codigo e senha foram cadastrados");
		
			in.close();
		}	
}	
			
}	

	
	
		
	



