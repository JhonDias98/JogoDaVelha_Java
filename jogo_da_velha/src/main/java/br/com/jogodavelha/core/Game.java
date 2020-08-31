package br.com.jogodavelha.core;

import br.com.jogodavelha.Constants;
import br.com.jogodavelha.ui.UI;

public class Game {
	
	Board board = new Board();
	Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];
	
	public void play() {
		UI.printGameTitle();
		
		board.clear();
		board.print();
		
		//UI.readInput("Nome do Jogador");
	}
}
