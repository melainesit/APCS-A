//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		do{
			System.out.println("Guessing Game - How many numbers? ");
			int okay = keyboard.nextInt();
			GuessingGame pan = new GuessingGame(okay);
			pan.playGame();
			System.out.println(pan);
			System.out.println("Do you want to play again? ");
			response = keyboard.next().charAt(0);
			
		}while (response !='n');

	}
}