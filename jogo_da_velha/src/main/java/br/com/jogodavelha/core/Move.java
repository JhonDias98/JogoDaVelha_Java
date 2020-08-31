package br.com.jogodavelha.core;

public class Move {
	private int i;
	private int j;
	
	public Move(String moveStr) {
		String[] tokens = moveStr.split(",");
		this.i = Integer.parseInt(tokens[0]);
		this.j = Integer.parseInt(tokens[1]);
		
		//TODO Validar se a estrutura do MoveStr está correta
	}
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
}