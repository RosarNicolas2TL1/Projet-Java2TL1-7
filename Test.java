package testMVC;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Jeu jeu = new Jeu();
		JeuController controle = new JeuController(jeu);
		JeuVueConsole vue = new JeuVueConsole(jeu, controle);
		controle.addView(vue);
		vue.main();
	}

}
