//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{

		Scanner file = new Scanner(new File("C:\\Users\\sitm3033\\Downloads\\Unit12-2016 (1)\\Unit12-2016\\Unit12-Assignments\\lab18d"));

		int size = file.nextInt();
		file.nextLine();
		Word[] datlist = new Word[size];
		for (int i = 0; i<size;i++){
			Word yest = new Word(file.nextLine());
			datlist[i] = yest;
		}
		
		Word ano = new Word(datlist[0].toString());
		for (int i=0;i<size;i++){
			for (int z =0; z<size;z++){
				if (datlist[z].compareTo(datlist[z+1])==1){
					ano = datlist[z+1];
					datlist[z+1] = datlist[z];
					datlist[z]=ano;
				}
			}
		}
		for (int i = 0;i<datlist.length;i++){
			System.out.println(datlist[i]);
		}
			
				
		}


	}
