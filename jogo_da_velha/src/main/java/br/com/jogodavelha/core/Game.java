package br.com.jogodavelha.core;

import br.com.jogodavelha.Constants;
import br.com.jogodavelha.ui.UI;

public class Game {
	
	private Board board = new Board();
	private Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];
	private int currentPlayerIndex = 0;
	
	public void play() {
		UI.printGameTitle();
		
		for(int i = 0; i < players.length; i++) {
			players[i] = createPlayer(i);
		}
	}
	
	private Player createPlayer(int index) {
		String name = UI.readInput("Jogador " + (index + 1) + " =>");
		char symbol = Constants.SYMBOL_PLAYERS[index];
		Player player = new Player(name, board, symbol);
		
		UI.printText("O jogador " + name+ " vai usar o símbolo " + symbol);
		
		return player;
	}
	
	private Player nextPlayer() {
		//Forma mais detalhada de fazer
		/*
		currentPlayerIndex++;
		if(currentPlayerIndex >= players.length) {
			currentPlayerIndex = 0;
		}
		*/
		
		//Forma menos detalhada de fazer
		currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
		return players[currentPlayerIndex];
	}
}
