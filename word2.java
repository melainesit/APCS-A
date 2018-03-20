import static java.lang.System.*;

import java.util.ArrayList;

public class word2 implements Comparable<Word>
{
	private String word;
	private ArrayList<String> list;
	
	public word2(String s)
	{
		setWord(s);
		list = new ArrayList<String>();
	}
	
	private void setWord(String s){
		word = s;
	}
	
	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vc = 0;
		
		for (int i=0; i<word.length(); i++){
			if (vowels.indexOf(word.substring(i,i+1)) >=0){
				vc++;
			}
		}
		return vc;
	}
	public String getWord(){
		return word;
	}
	
	public int compareTo(word2 rhs)
	{
		int num = 0;
		String apl = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i<list.size(); i++){
			word2 gain = new word2(list.get(i));
			if (rhs.numVowels()> gain.numVowels()){
				num++;
			}
			else if (rhs.numVowels()== gain.numVowels()){
				if (apl.indexOf(rhs.getWord().substring(0,1))> apl.indexOf(list.get(i).substring(0,1))){
					num++;
				}
			}
		}
	
		list.add( num , rhs.getWord());
		return -1;
	}
	public String toString()
	{
		String output = "";
		for (int i = 0;i<list.size();i++){
			output = output + "\n" + list.get(i);
		}
		return output;
	}
		
		public int compareTo(Word o){
			return 0;
		}
	
	}