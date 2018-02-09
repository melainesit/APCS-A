package unit3package;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		//add test cases
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter x1:");
		int x1 = keyboard.nextInt();
		System.out.println("Enter y1:");
		int y1 = keyboard.nextInt();
		System.out.println("Enter x2:");
		int x2 = keyboard.nextInt();
		System.out.println("Enter y1:");
		int y2 = keyboard.nextInt();

		Distance yeller = new Distance(x1,y1,x2,y2);
		yeller.setCoordinates(x1,y1,x2,y2);
		yeller.calcDistance();
		yeller.print();
		
		
		
		
			
	}
}