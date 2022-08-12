package Lista06Extra;

import java.util.Scanner;

public class Q03cinema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int capacidadeMax = 15;
		int idade = 0;
		/*String opOtimo = "*****";
		String opBom = "****";
		String opRegular = "***";
		String opRuim = "**";
		String opPessimo = "*";*/
		int opiniao = 0;
		int qtdOtimos = 0;
		int qtdBom = 0;
		int qtdRegular = 0;
		int qtdRuim = 0;
		int qtdPessimo = 0;
		int qtdBomRegular = 0;
		float percentBomReg = 0;
		float mediaIdadeRuim = 0;
		float percentRespPessimo = 0;
		int maiorIdadePessimo = 0;
		int DifidadeMaiorOtimoRuim = 0;
		int maiorIdadeOtimo = 0;
		int maiorIdadeRuim = 0;
		
			for (int i = 1; i <= capacidadeMax; i++ ) {
				System.out.println("Informe sua idade: VALIDA (SEMPRE MAIOR QUE ZERO)");
				idade = in.nextInt();
				
				 while  (idade <= 0) {
			           System.out.println("IDADE INVALIDA!! INFORME NOVAMENTE SUA IDADE (SEMPRE MAIOR QUE ZERO");
			           idade = in.nextInt();
				 }	
				
				  System.out.println("Selecione sua opinião!");
				  System.out.println("5 - ***** Ótimo!");
		          System.out.println("4 - **** Bom!");
		          System.out.println("3 - *** Regular!");
		          System.out.println("2 - ** Ruim!");
		          System.out.println("1 - * Péssimo!");
		          opiniao = in.nextInt();
		          
		          while  (opiniao < 1 || opiniao > 5) {
			           System.out.println("INFORME UMA OPINAO VALIDA");
			           System.out.println("Selecione sua opinião!");
					   System.out.println("5 - ***** Ótimo!");
				       System.out.println("4 - **** Bom!");
				       System.out.println("3 - *** Regular!");
				       System.out.println("2 - ** Ruim!");
				       System.out.println("1 - * Péssimo!");
			           
			           opiniao = in.nextInt();
				 }	
		          
		          switch (opiniao) {
		          case 5:
		        	  qtdOtimos++;
		        	  if (idade > maiorIdadeOtimo) {
		        		  maiorIdadeOtimo = idade;
		        	  }
		        	  System.out.println(qtdOtimos);
		          break;
		          
		          case 4:
		        	  qtdBom++;
		        	  qtdBomRegular++;
		        	  System.out.println(qtdBom);
		          break;  
		        	 
		          case 3:
		        	  qtdRegular++;
		        	  qtdBomRegular++;
		        	  System.out.println(qtdRegular);
		          break;
		          
		          case 2:
		        	  qtdRuim++;
		        	  mediaIdadeRuim += idade;
		        	  System.out.println(qtdRuim);
		          break;
		          
		          case 1:
		        	  qtdPessimo++;
		        	  System.out.println(qtdPessimo);
		        	  if (idade > maiorIdadePessimo) {
		        		  maiorIdadePessimo = idade;
		        	  }
		          break;
		          default:
		          }
		          
		         }
			System.out.println("Quantidade de respostas Otimo: " +qtdOtimos);
			percentBomReg = qtdBomRegular /(qtdBom - qtdRegular);
			System.out.println("Percentual de bom e regular: " +percentBomReg);
			
			mediaIdadeRuim /= qtdRuim;
			System.out.println("Media idade que respondeu ruim: " +mediaIdadeRuim);
			
			percentRespPessimo = (qtdPessimo / capacidadeMax) *100;
			System.out.println("Percentual de respostas Pessimo: " +percentRespPessimo);
			System.out.println("Maior idade que respondeu péssimo: " +maiorIdadePessimo);
			
			DifidadeMaiorOtimoRuim = maiorIdadeOtimo - maiorIdadePessimo;
			System.out.println("Diferença entre maior idade que respondeu otimo e pessimo: " +DifidadeMaiorOtimoRuim);
			
			
			in.close();
		
	}
	}

