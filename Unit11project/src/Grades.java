//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private double[] grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		Scanner chop = new Scanner(gradeList);
		int number = chop.nextInt();
		grades = new double[number];
		String glist = "";
		glist = gradeList.substring(gradeList.indexOf("-" + 1, gradeList.length()));
		Scanner real = new Scanner(glist);
		for (int i=0;i<grades.length;i++){
			grades[i] = real.nextDouble();
		}
	}
	
	public void setGrade(int spot, double grade)
	{
		grade = grades[spot];

		
	}
	
	public double getSum()
	{
		double sum=0.0;
		for (int i=0; i<grades.length;i++){
			sum=+ grades[i];
		}

		return sum;
	}
	
	public double getLowGrade()
	{
		double low = grades[0];
		
		for (int i= 1; i<grades.length;i++){
			if (grades[i] <low){
				low = grades[i];
			}
		}

		return low;
	}
	
	public double getHighGrade()
	{
		double high  = grades[0];
		
		for (int i= 1; i<grades.length;i++){
			if (grades[i] >high){
				high = grades[i];
			}
		}

		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		String output="";
		for(int i=0;i<grades.length;i++){
			output = output +grades[i] + " ";
		}

		return output;
	}	
}