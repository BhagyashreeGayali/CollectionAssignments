/*
Given a linked list of integers , find out number of missing elements in linked list. E.g. list

contains { 2 , 3, 7} missing elements are 4, 5, 6. If list contains { 3 , 13 , 7 , 2 } . missing
elements are 4,5,6,8,9,10,11,12 and so on. Write a logic which will work for any list.*/
package tuesday18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Que3 {

	public static void main(String[] args) {
		LinkedList<Integer> ls=new LinkedList<>();
		ls.add(2);
		ls.add(6);
		ls.add(10);
		
		Collections.sort(ls);
		System.out.println(ls);
		
		int n=ls.getLast();
		for(int i=ls.getFirst()+1;i<n;i++)
		{
			if(!ls.contains(ls)){
				ls.add(i);
			}
		}
		Collections.sort(ls);
		System.out.println(ls);
	}

}
