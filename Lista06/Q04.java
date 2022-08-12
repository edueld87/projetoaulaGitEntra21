package Lista06;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int sexo;
		int y = 6;
		int x = 0;
		double contadorhomem = 0, alturahomem =0;
		double contadormulher = 0, alturamulher = 0;
		double altura;
		double maioraltura = 0, menoraltura = 1000;
		double mediamulheres, mediahomens, percenthomem;
		double populacao = 0, mediapop, alturapop = 0;
				
		for (int i = x; i < y; i++) {
			System.out.println("Informe o sexo feminino (1) masculino (0)");
			sexo = in.nextInt();			
			System.out.println("Informe a altura");
			altura = in.nextDouble();
		
			if (sexo == 0) {
				contadorhomem = contadorhomem + 1;
				alturahomem = alturahomem + altura;
				alturapop = alturapop + altura;
			} else if (sexo == 1) {
				contadormulher = contadormulher +1;
				alturamulher = alturamulher + altura;
				alturapop = alturapop + altura;
					    }
			if (altura > maioraltura) {
				maioraltura = altura;
			}
			if (altura < menoraltura) {
				menoraltura = altura;
			}
		}
			populacao = contadorhomem + contadormulher;
			mediamulheres = alturamulher / contadormulher;
			mediahomens = alturahomem / contadorhomem;
			mediapop = alturapop / populacao;
			percenthomem = (contadorhomem / populacao) *100;
		
			System.out.println("media mulher: " +mediamulheres);
			System.out.println("media homem: " +mediahomens);	
			
			System.out.println("menor altura encontrada " +menoraltura);
			System.out.println("maior altura encontrada " +maioraltura);
			System.out.println("media populacao: " +mediapop);
			System.out.println("Percentual de homens: " +percenthomem);
			System.out.println("Populacao da pesquisa: " +populacao);
			
			in.close();
		}
		
		}	
		

/* Foi feita uma pesquisa entre os habitantes de uma região e coletados os dados de altura e sexo (0=masc, 1=fem) 
  das pessoas. Faça um programa que leia 5 dados diferentes e informe:
 a maior e a menor altura encontradas;
 a média de altura das mulheres;
 a média de altura da população;
 o percentual de homens na população.*/