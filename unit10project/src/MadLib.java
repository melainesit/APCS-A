//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
import java.util.Random;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	String story = "";	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();


	}

	public MadLib(String fileName)
	{
		//load stuff
		try{
			Scanner file = new Scanner(new File(fileName));
			loadNouns();
			loadVerbs();
			loadAdjectives();
	
			
			while (file.hasNext()){
				String tem = file.next();

				if(tem.equals("#")){
					out.print(getRandomNoun() + " ");
				}
				else if(tem.equals("&")){
					out.print(getRandomAdjective() + " ");
				}
				else if(tem.equals("@")){
					out.print(getRandomVerb() + " ");
				}
				else{
					out.print(tem + " ");

			}
		
		}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner file = new Scanner(new File("H:\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\nouns.dat"));
			while (file.hasNextLine()){
				nouns.add(file.nextLine());
			}
			file.close();

		
		}
		catch(Exception e)
		{
			System.out.println("Houston we have a problem!");
		}
		
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File("H:\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\verbs.dat"));
			while (file.hasNextLine()){
				nouns.add(file.nextLine());
			}
			file.close();
	
		}
		catch(Exception e)
		{

		}
		
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File("H:\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\adjectives.dat"));
			while (file.hasNextLine()){
				nouns.add(file.nextLine());
			}
			file.close();
	
		}
		catch(Exception e)
		{


		}
	}

	public String getRandomVerb()
	{
		int one = (int)(Math.random()) * (verbs.size()-1);
		return verbs.get(one);
	}
	
	public String getRandomNoun()
	{
		int two = (int)(Math.random()) * (nouns.size()-1);
		return nouns.get(two);

	}
	
	public String getRandomAdjective()
	{
		int thr = (int)(Math.random()) * (adjectives.size()-1);
		return adjectives.get(thr);

	}		

	public String toString()
	{
		String output = "";
		return output;
	}
}