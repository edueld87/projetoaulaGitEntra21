package ListaExtra;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		float indicepoluicao; 
		
		System.out.println("Informe qual o indice de poluição identitificado:");
		indicepoluicao = in.nextFloat();
		
		if (indicepoluicao > 0 && indicepoluicao <= 0.25) {
			System.out.println("O indice de poluição é aceitavel");
		}
		if (indicepoluicao > 0.30 && indicepoluicao <= 0.39) {
			System.out.println("Intimar indústrias do primeiro grupo para suspender suas atividades");
	    }
		if (indicepoluicao > 0.40 && indicepoluicao <= 0.49) {
			System.out.println("Intimar indústrias do primeiro e segundo grupo, para suspenderem suas atividades");		
		}
		if (indicepoluicao > 0.50) {
			System.out.println("Intimar todos os grupos a paralisarem suas atividades");	
		}
		in.close();
}
}

/* A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são altamente poluentes do meio ambiente.
 *  O índice de poluição aceitável varia de 0 (zero) até 0,25. Se o índice sobe para 0,3 as indústrias do 1o grupo são intimadas asuspenderem
 *   suas atividades, se o índice crescer para 0,4 as industrias do 1o e 2o grupo sãointimadas a suspenderem suas atividades, 
 *   se o índice atingir 0,5 todos os grupos devem serem notificados a paralisarem suas atividades. Faça um algoritmo que leia 
 *   o índice de poluição medidoe emita a notificação adequada aos diferentes grupos de empresas. */
 