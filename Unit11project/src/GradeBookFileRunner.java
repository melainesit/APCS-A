//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("gradebook.dat"));
		String name = file.nextLine();
		int classSize = file.nextInt();
		file.nextLine();
		Class pan = new Class(name,classSize);
		for (int i= 0; i<classSize;i++){
			pan.addStudent(i,new Student(file.nextLine(),file.nextLine()));
		}
		out.println(pan);
		out.println("");
		out.println("Failure List = " + pan.getFailureList(70));
		out.println("Highest Average = " + pan.getStudentWithHighestAverage());
		out.println("Lowest Average = " + pan.getStudentWithLowestAverage());
		out.println(String.format("Class Average = %.2f", pan.getClassAverage()));



	}		
}