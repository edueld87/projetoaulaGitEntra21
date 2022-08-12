package Lista08matriz3d;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		
		// jogo da velha
		Scanner in = new Scanner(System.in);

		char[][] tabuleiro = new char[3][3];

		System.out.println("Começou o Jogo!! ");
		System.out.println("Player 1: X ");
		System.out.println("Player 2: O ");

		boolean ganhou = false;
		char sinal;
		int linha = 0;
		int coluna = 0;


		int jogada = 1;

		while (!ganhou) {

			if (jogada % 2 == 1 ) {
				System.out.println("\nPlayer 1: Sua vez de jogar ");
				sinal = 'X';
			} else {
				System.out.println("\nPlayer 2: Sua vez de jogar ");
				sinal = 'O';
			}

			boolean linhavalida = false;
			while (!linhavalida) {
				System.out.println("Informe a linha | 1 | ");
				System.out.println("Informe a linha | 2 | ");
				System.out.println("Informe a linha | 3 | ");
				linha = in.nextInt();
				if (linha >= 1 && linha <= 3) {
					linhavalida = true;
				} else {
					System.out.println("Informação inválida, informar uma opção válida!!");
				}
			}

			boolean colunavalida = false;
			while (!colunavalida) {
				System.out.println("Informe a coluna | 1 | 2 | 3 | ");
				coluna = in.nextInt();
				if (coluna >= 1 && coluna <= 3) {
					colunavalida = true;
				} else {
					System.out.println("Informação inválida, informar uma opção válida!!");

				}
			}

			linha--;
			coluna--; // decremento para usar as linhas e colunas conforme orientação do JAVA

			if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
				System.out.println("\nPosição já informado, por gentileza escolha outra posição!!");
			} else {
				tabuleiro[linha][coluna] = sinal;
				jogada++;
			}


			// gerando o tabuleiro
			for (int i =0; i < tabuleiro.length; i++) {
				for (int j =0; j < tabuleiro[i].length; j++) {
					System.out.print(tabuleiro[i][j] + " | ");
				}
				System.out.println(); // para pular a linha
			}
			// como fazer para saber o ganhador??

			if ((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X' ) || // ln 1
					(tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X' ) || // ln 2
					(tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X' ) || // ln 3
					(tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X' ) || // cl 1
					(tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X' ) || // cl 2
					(tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X' ) || // cl 3
					(tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X' ) || // diagonal
					(tabuleiro[2][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[0][2] == 'X' )) { //diagonal
				ganhou = true;
				System.out.println("Parabéns Player 1 ganhou");

			} else if ((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O' ) || // ln 1
					(tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O' ) || // ln 2
					(tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O' ) || // ln 3
					(tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O' ) || // cl 1
					(tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O' ) || // cl 2
					(tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O' ) || // cl 3
					(tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O' ) || // diagonal
					(tabuleiro[2][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[0][2] == 'O' )) { //diagonal
				ganhou = true;
				System.out.println("Parabéns Player 2 ganhou");

			} else if ( jogada > 9) {
				ganhou = true;
				System.out.println("Houve Impate!");

			}

		}
		in.close();
	}

}


