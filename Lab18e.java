import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab18e
{
	public static void main( String args[]) throws IOException
		{
		
		Scanner file = new Scanner( new File("lab18e.dat"));
		String s = "";
		String h= "";
		
		int size = file.nextInt();
		word2 news = new word2(s);
		file.nextLine();
		for (int i=0; i<size; i++){
			h = file.nextLine();
			word2 again = new word2(h);
			news.compareTo(again);
		}
		System.out.println(news);
		}
	}
