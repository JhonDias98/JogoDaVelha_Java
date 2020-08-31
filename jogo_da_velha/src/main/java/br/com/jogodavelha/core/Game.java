package br.com.jogodavelha.core;

import br.com.jogodavelha.Constants;
import br.com.jogodavelha.ui.UI;

public class Game {
	
	private Board board = new Board();
	private Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];
	
	public void play() {
		UI.printGameTitle();
		
		board.clear();
		board.print();
		
		//UI.readInput("Nome do Jogador");
	}
}
