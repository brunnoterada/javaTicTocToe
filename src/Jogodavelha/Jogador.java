package Jogodavelha;

import java.util.Scanner;

public class Jogador {
	

	public static void turnoJogador(char[][] board, Scanner scanner) {
		String userInput;
		// loop para a jogada do jogador
		while (true) {
			System.out.println("Em qual casa voc� deseja marcar?(1-9)");
			userInput = scanner.nextLine();
			
			// if que valida se a jogada do jogador � uma jogada valida, caso for valida ele marca no tabuleiro 
			if (Tabuleiro.movimentoValido(board, userInput)){
				break;
			} else {
				System.out.println(userInput + "esse n�o � um movimento valido.");
			}
		}
		Tabuleiro.marcaMovimento(board, userInput, 'X');// depois que ele sai do loop essa fun��o faz com que ele marque no tabuleiro
	}
	

}
