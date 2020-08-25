package tuesday18;

/*WAP wherein Set<Student>containing { introllno , String name , intmarks } are changed to
Map where key will be marks and value will be List of RollNos where all those students who have same marks are together.*/

import java.util.*;
public class Que6
	{
		int rollno;
		String name;
		int marks;

		public Que6(int rollno, String name, int marks)

		{
				this.rollno = rollno;
				this.name = name;
				this.marks = marks;
		}


		public static void main(String[] args)
		{
			Que6 s1 = new Que6 (1, "abc", 50);
			Que6 s2 = new Que6 (2, "def", 50);
			Que6 s3 = new Que6 (3, "ghi", 40);
			Que6 s4 = new Que6 (4, "jkl", 40);
			Que6 s5 = new Que6 (5, "mno", 90);
			Que6 s6 = new Que6 (6, "pqr", 90);
			Que6 s7 = new Que6 (7, "stu", 90);

			Set <Que6> s = new HashSet <Que6> ();
			s.add(s1);
			s.add(s2);
			s.add(s3);
			s.add(s4);	 
			s.add(s5);
			s.add(s6);
			s.add(s7);


			Map <Integer, List> hm = new HashMap <Integer, List> ();
// hm.put(50, null);
// hm.put(60, null);
// hm.put(90, null);

			Iterator<Que6> itr = s.iterator();
			while(itr.hasNext())
			{
				Que6 x = itr.next();

				if(hm.containsKey(x.marks))
				{
						List<Integer> t=hm.get(x.marks);
						t.add(x.rollno);
						hm.put(x.marks, t);

				}
				else
					{
						ArrayList<Integer> al=new ArrayList<>();
						al.add(x.rollno);
						hm.put(x.marks, al);

					}


			}
			System.out.println(hm);
		}

}