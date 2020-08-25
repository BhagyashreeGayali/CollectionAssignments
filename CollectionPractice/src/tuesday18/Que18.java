package tuesday18;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Que18 
{
/*An arraylist has strings "A+2" , "B+12" , "D+4", "DD+5" and so on. Create a
method which accepts a String eg D in input and will return
associated number value eg in this case 4 by looping the arraylist and
finding matching pattern*/

	public static void main(String[] args) 
	{
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("A+2");
		list1.add("B+12");
		list1.add("D+4");
		list1.add("DD+5");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		String input=sc.next();
		Iterator<String> itr=list1.iterator();
		while(itr.hasNext())
		{
			String data=itr.next();
			int index=data.indexOf("+");
			//System.out.println(index);
			String chkey=data.substring(0, index);
			if(input.equalsIgnoreCase(chkey))
			{
				String chvalue=data.substring(index+1);
				System.out.println(chvalue);
			}
			
			
		}

}
}