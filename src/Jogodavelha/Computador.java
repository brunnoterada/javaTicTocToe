package Jogodavelha;

import java.util.Random;

public class Computador {
	
	
	
	// movimento do computador dificuldade 1
	public static void turnoComputador1(char[][] board) {
		
		// nessa dificuldade ele marca randomicamente as casas 
		Random rand = new Random();
		int computadorMovimento;
		while (true) {
			computadorMovimento = rand.nextInt(9) + 1;//aqui marca sempre com +1 pois ele pode começar em 0 e no switch case eu deixei para começar em 1
			//valida se a cara que caiu é valida
			if (Tabuleiro.movimentoValido(board, Integer.toString(computadorMovimento))) {
				break;
			}
		}
		
		System.out.println("Computador marcou " + computadorMovimento);
		// marca o movimento do computador
		Tabuleiro.marcaMovimento(board, Integer.toString(computadorMovimento), 'O');
	}
	
	// movimento do computador dificuldade 2
	public static void turnoComputador2(char[][] board) {
		// nessa dificuldade ele marca iniciando do 1 para o 9 
		int computadorMovimento = 0;// começa em 0
		while (true) {
			computadorMovimento += 1 ;// valida se o 0 já está marcado se ja estiver ele roda o while e adiciona 1 
			if (Tabuleiro.movimentoValido(board, Integer.toString(computadorMovimento))) {
				
				break;
			}
		}
		System.out.println("Computador marcou " + computadorMovimento);
		// marca o movimento do computador
		Tabuleiro.marcaMovimento(board, Integer.toString(computadorMovimento), 'O');
	}
	
	// movimento do computador dificuldade 3
	public static void turnoComputador3(char[][] board) {
		// nessa dificuldade ele marca iniciando do 9 para o 1
		int computadorMovimento = 9;//começa em 9
		while (true) {
			computadorMovimento -= 1 ;// valida se o 9 já está marcado se ja estiver ele roda o while e diminui 1 
			if (Tabuleiro.movimentoValido(board, Integer.toString(computadorMovimento))) {
				break;
			}
		}
		System.out.println("Computador marcou " + computadorMovimento);
		// marca o movimento do computador
		Tabuleiro.marcaMovimento(board, Integer.toString(computadorMovimento), 'O');
	}
}
