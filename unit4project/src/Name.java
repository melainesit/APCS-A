

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{


	}

	public Name(String s)
	{
		name = s;

	}

   public void setName(String s)
   {
		name = s;

   }

	public String getFirst()
	{
		int cut = name.indexOf(" ");
		String first = name.substring(0, cut);
		return first;
	}

	public String getLast()
	{
		int cut = name.indexOf(" ");
		int rid = cut+1;
		String last = name.substring(rid );
		return last;
	}

 	public String toString()
 	{
 		return name + "\n";
	}
}