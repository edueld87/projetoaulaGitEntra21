package ListaExtra;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		float indicepoluicao; 
		
		System.out.println("Informe qual o indice de polui��o identitificado:");
		indicepoluicao = in.nextFloat();
		
		if (indicepoluicao > 0 && indicepoluicao <= 0.25) {
			System.out.println("O indice de polui��o � aceitavel");
		}
		if (indicepoluicao > 0.30 && indicepoluicao <= 0.39) {
			System.out.println("Intimar ind�strias do primeiro grupo para suspender suas atividades");
	    }
		if (indicepoluicao > 0.40 && indicepoluicao <= 0.49) {
			System.out.println("Intimar ind�strias do primeiro e segundo grupo, para suspenderem suas atividades");		
		}
		if (indicepoluicao > 0.50) {
			System.out.println("Intimar todos os grupos a paralisarem suas atividades");	
		}
		in.close();
}
}

/* A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de ind�strias que s�o altamente poluentes do meio ambiente.
 *  O �ndice de polui��o aceit�vel varia de 0 (zero) at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 1o grupo s�o intimadas asuspenderem
 *   suas atividades, se o �ndice crescer para 0,4 as industrias do 1o e 2o grupo s�ointimadas a suspenderem suas atividades, 
 *   se o �ndice atingir 0,5 todos os grupos devem serem notificados a paralisarem suas atividades. Fa�a um algoritmo que leia 
 *   o �ndice de polui��o medidoe emita a notifica��o adequada aos diferentes grupos de empresas. */
 