package tuesday18;

import java.util.Iterator;
import java.util.LinkedList;

public class Que14 
{
/*Given two LinkedList, we need to combine two LinkedList  in such a way that the combined aList 
 * has alternate elements of both. If one list has extra element, then these elements are
 *  appended at the end of the combined list.

Input : List1 = {1, 2, 3, 4, 5, 6}
Input : List2 = {11, 22, 33, 44}
Output : List3 = {1, 11, 2, 22, 3, 33, 4, 44, 5, 6}*/

	public static void main(String[] args) 
	{
		
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		System.out.println(list1);
		LinkedList<Integer> list2=new LinkedList<Integer>();
		list2.add(11);
		list2.add(22);
		list2.add(33);
		list2.add(44);
		System.out.println(list2);
		LinkedList<Integer> list3=new LinkedList<Integer>();
		int i=0;
		int j=0;
		int n1=0;
		Iterator<Integer> itA = list1.iterator();
		Iterator<Integer> itB = list2.iterator();

		while(itA.hasNext() || itB.hasNext())
		{
				if(itA.hasNext())
				{
		         list3.add(itA.next());
				}
		      if(itB.hasNext())
		      {
		        list3.add(itB.next());
		      }
		 }
		System.out.println(list3); 
		}
		
		
		
}
