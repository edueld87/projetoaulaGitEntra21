package ListaExtra;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int p01, p02, p03, p04, p05, pontos;
		
		System.out.println("Abaixo seguem as perguntas, responda (1) para sim ou (0) para n�o:");
		
		System.out.println("Pergunta 1: Telefonou para v�tima?");
		p01 = in.nextInt();
		
		System.out.println("Pergunta 2: Esteve no local do crime?");
		p02 = in.nextInt();
		
		System.out.println("Pergunta 3: Mora perto da v�tima?");
		p03 = in.nextInt();
		
		System.out.println("Pergunta 4: Devia para v�tima?");
		p04 = in.nextInt();
		
		System.out.println("Pergunta 5: J� trabalhou com a v�tima?");
		p05 = in.nextInt();
		
		pontos = p01 + p02 + p03 + p04 + p05;
		
		if (pontos == 2) {
			System.out.println("Suspeito");
		} else if (pontos >= 2 && pontos <= 4) {
			System.out.println("C�mplice");
		} else if (pontos == 5) {
			System.out.println("Assassino");
		} else {
			System.out.println("Inocente");	
		}
		
		/*switch (pontos) {
		case '2':
		System.out.println("Suspeito");
		break;
		
		case '3':
		System.out.println("C�mplice");
		break;
		
		case '4':
		System.out.println("C�mplice");	
		break;
		
		case '5':
		System.out.println("Assassino");
		break;
		
		default:
		System.out.println("Inocente");	
		break;
		}*/
		
		
	in.close();	
	}

}
