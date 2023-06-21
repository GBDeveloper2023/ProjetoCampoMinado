package br.com.brainStorm.cm;

import br.com.brainStorm.cm.modelo.Tabuleiro;
import br.com.brainStorm.cm.visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);

	}

}
