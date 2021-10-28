package Jogodavelha;

public class Tabuleiro {
	
	//tabuleiro
	static char[][] board = {{' ', ' ', ' '},
	 	      {' ', ' ', ' '}, 
	 	      {' ', ' ', ' '}};
	
	
	//função que printa como está o tabuleiro
	public static void printTab() {
		System.out.println(board[0][0] + "|" +  board[0][1] + "|" +  board[0][2] );
		System.out.println("-+-+-");
		System.out.println(board[1][0] + "|" +  board[1][1] + "|" +  board[1][2] );
		System.out.println("-+-+-");
		System.out.println(board[2][0] + "|" +  board[2][1] + "|" +  board[2][2] );
	}
	
	// jogo que valida o status do jogo
	
	public static boolean jogoAcabou(char[][] board) {
			
		// condição que valida se o jogador ganhou 
			if (condicaoDeVitoria(board, 'X')) {	
				printTab();
				System.out.println("Jogador Ganhou!");
				return true;
			}
			// condição que valida se o computador ganhou 
			if (condicaoDeVitoria(board, 'O')) {	
				printTab();
				System.out.println("Computador ganhou!");
				return true;
			}
			// condição que valida se ainda ha jogadas se não ele retonar false e para de rodar o jogo
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					if (board[i][j] == ' ') {
						return false;
					}
				}
			}
			printTab();
			System.out.println("Empatou!");
			return true;
		}
	// if com as posibilidades de vitoria, se cair alguma dessas posibilidade o jogo encerra
	public  static boolean condicaoDeVitoria(char[][] board, char symbol) {
		if ((board[0][0] == symbol && board [0][1] == symbol && board [0][2] == symbol) ||
			(board[1][0] == symbol && board [1][1] == symbol && board [1][2] == symbol) ||
			(board[2][0] == symbol && board [2][1] == symbol && board [2][2] == symbol) ||
			
			(board[0][0] == symbol && board [1][0] == symbol && board [2][0] == symbol) ||
			(board[0][1] == symbol && board [1][1] == symbol && board [2][1] == symbol) ||
			(board[0][2] == symbol && board [1][2] == symbol && board [2][2] == symbol) ||
			
			(board[0][0] == symbol && board [1][1] == symbol && board [2][2] == symbol) ||
			(board[0][2] == symbol && board [1][1] == symbol && board [2][0] == symbol) ) {
			return true;
		}
		return false;
	}
	// verifica se o movimento é valido 
	public static boolean movimentoValido (char[][] board, String position) {
		switch(position) {
			case "1":
				return (board[0][0] == ' ');
			case "2":
				return (board[0][1] == ' ');
			case "3":
				return (board[0][2] == ' ');
			case "4":
				return (board[1][0] == ' ');
			case "5":
				return (board[1][1] == ' ');
			case "6":
				return (board[1][2] == ' ');
			case "7":
				return (board[2][0] == ' ');
			case "8":
				return (board[2][1] == ' ');
			case "9":
				return (board[2][2] == ' ');
			default:
				return false;
		}
	}
	// switch marca o movimento na posição selecionada
	 public static void marcaMovimento(char[][] board, String position, char symbol) {
			switch(position) {
				case "1":
					board[0][0] = symbol;
					break;
				case "2":
					board[0][1] = symbol;
					break;
				case "3":
					board[0][2] = symbol;
					break;
				case "4":
					board[1][0] = symbol;
					break;
				case "5":
					board[1][1] = symbol;
					break;
				case "6":
					board[1][2] = symbol;
					break;
				case "7":
					board[2][0] = symbol;
					break;
				case "8":
					board[2][1] = symbol;
					break;
				case "9":
					board[2][2] = symbol;
					break;
				default:
					System.out.println("=D");
			}
		}
}
