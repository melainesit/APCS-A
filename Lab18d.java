
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab18d.dat"));
		String s = "";
		String h = "";

		
		int size = file.nextInt();
		Word hi = new Word(s);
		file.nextLine();
		for(int i = 0; i < size; i++){
			h = file.nextLine();
			Word hello = new Word(h);
			hi.compareTo(hello);
		}


		System.out.println(hi);

	}
}
