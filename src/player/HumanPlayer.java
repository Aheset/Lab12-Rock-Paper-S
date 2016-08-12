package player;

import java.util.Scanner;

public class HumanPlayer extends Player {
	
	Scanner scan1 = new Scanner(System.in);
	String userInput = scan1.nextLine();
	
	@Override
	public String Roshambo() {
	
	return userInput;
		
	
	}

}
