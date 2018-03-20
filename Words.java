//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;
	import static java.lang.System.*;
	import static java.util.Arrays.*;
	import java.util.ArrayList;

public class Word implements Comparable<Word>
{
	private String word;
	private ArrayList<String> datlist;

	public Word( String s )
	{

		setWord(s);
		datlist = new ArrayList<String>();

	}
	
	public void setWord(String s){
		
		word = s;
		
	}
	
	public String getWord(){
		return word;
	}

	public int compareTo( Word rhs )
	{
		int num = 0;
		String order = "abcdefghijklmnopqrstuvwxyz";
		if (datlist.size() == 0)
			datlist.add(word);
		for (int i = 0; i < datlist.size(); i++){
			if (rhs.getWord().length() > datlist.get(i).length()){
				num ++;
			}
			else if (rhs.getWord().length() == datlist.get(i).length()){
				if (datlist.indexOf(rhs.getWord().substring(0,1)) > datlist.indexOf(datlist.get(i).substring(0,1))){
					num ++;
				}
			}
		}
		
		
		datlist.add(num, rhs.getWord());
		
		return num;
	}

	public String toString()
	{
		String output = "";
		for (int i = 0; i < datlist.size(); i++){
			output = output + "\n" + datlist.get(i);
		}
		return output;
	}
}
