package Jogodavelha;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bem vindo ao jogo da velhinha");
		System.out.println("Qual a dificuldade que deseja jogar 1,2 ou 3?");
		int escolha = scanner.nextInt();// escolha da dificuldade 
		scanner.nextLine();// limpa buffer 
		switch (escolha){// switch para verificar qual a dificuldade o jogador quer jogar
		
		// primeira logica é utilizando random
			case 1:
			
				Tabuleiro.printTab();
				
				// logica que faz o jogo funcionar  ela se encerra quando jogo acaba
				while (true) {
					// logica que faz o turno do jogador rodar
					Jogador.turnoJogador(Tabuleiro.board, scanner);
					if (Tabuleiro.jogoAcabou(Tabuleiro.board)){
						break;
					}
					Tabuleiro.printTab();
					//logica que faz o turno do computador funcionar
					Computador.turnoComputador1(Tabuleiro.board);
					if (Tabuleiro.jogoAcabou(Tabuleiro.board)){
						break;
					}
					Tabuleiro.printTab();
				}
				scanner.close();
				break;
				// segunda dificuldade, nessa dificuldade o computador vai sempre marcar a casa vazia do 1 a 9
			case 2:
				Tabuleiro.printTab();
				
				while (true) {
					Jogador.turnoJogador(Tabuleiro.board, scanner);
					if (Tabuleiro.jogoAcabou(Tabuleiro.board)){
						break;
					}
					Tabuleiro.printTab();
					
					Computador.turnoComputador2(Tabuleiro.board);
					if (Tabuleiro.jogoAcabou(Tabuleiro.board)){
						break;
					}
					Tabuleiro.printTab();
				}
				scanner.close();
				break;
				// terceira dificuldade, nessa dificuldade o computador vai sempre marcar a casa vazia do 9 a 1
			case 3:
				
				
				Tabuleiro.printTab();
				
				while (true) {
					Jogador.turnoJogador(Tabuleiro.board, scanner);
					if (Tabuleiro.jogoAcabou(Tabuleiro.board)){
						break;
					}
					Tabuleiro.printTab();
					
					Computador.turnoComputador3(Tabuleiro.board);
					if (Tabuleiro.jogoAcabou(Tabuleiro.board)){
						break;
					}
					Tabuleiro.printTab();
				}
				scanner.close();
				break;
		
		}
		
	
		
	}

}
