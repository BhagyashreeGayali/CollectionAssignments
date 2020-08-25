package tuesday18;

/*An arraylist has strings "A+2" , "B+12" , "D+4", "DD+5" and so on. Create a
map which has alphabets as keys and integers as values. If alphabet is
repeated add integer to old value*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Que17 {
	public static void main(String[] args) 
	{
		int i;
		String first_part;
		String second_part;
		ArrayList<String> al=new ArrayList<String>();
		HashMap<String, String> hmap=new HashMap();
		
		al.add("A+2");
		al.add("B+12");
		al.add("D+4");
		al.add("DD+5");
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext())
		{
			String data=itr.next();
			 i=data.indexOf("+");
			 first_part=data.substring(0, i);
			 second_part=data.substring(i+1);
			 hmap.put(first_part, second_part);
			 
			 
		}
		System.out.println(hmap);
		

	}
}
