//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		upperBound = stop;

	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		int tries = 0;
		Scanner input = new Scanner(System.in);
		int guess= 0;
		boolean win = false;
		double number = Math.random()* (upperBound - 1)+1;
		System.out.println("Guess a number between 0 and " + upperBound + ": ");
		
		do{
			
			guess = input.nextInt();
			tries++;
			
			if (guess == number){
				win = true;
			}
	
			else if ( guess< 0 || guess > upperBound ){
			System.out.println("Number out of range!");
			System.out.println("Guess a number between 0 and " + upperBound + ": ");
		}
			else if ( guess < number){
			System.out.println("Guess a number between 0 and " + upperBound + ": ");
		}
			else if (guess> number){
			System.out.println("Guess a number between 0 and " + upperBound + ": ");
		}
		}while(win!=true);
		System.out.println("it took " + tries + " guesses to guess" + number);
		
		double per = ((1/(double)tries)*100);
		System.out.println("You answered right " + per + "% of the time");
		
		}
	public String toString()
	{
		String output = "";
		return output;
	}
}
	
		
			

