package tuesday18;

import java.util.*;
import java.util.LinkedHashSet;

public class Que13 
{
/*Create two Set of students objects where insertion order in maintained. Now accept Studentid 
 * from user and check whether in both sets have student with given id at same position	
 */

	public static void main(String[] args) 
	{
		Set<StudentDemo> student1=new LinkedHashSet();
		student1.add(new StudentDemo(3, "Shree"));
		student1.add(new StudentDemo(2, "Bhagyshree"));
		student1.add(new StudentDemo(1, "Omkar"));
		student1.add(new StudentDemo(4, "Vishu"));

		Set<StudentDemo> student2=new LinkedHashSet();
		student2.add(new StudentDemo(3, "Shree"));
		student2.add(new StudentDemo(2, "Omkar"));
		student2.add(new StudentDemo(1, "Shree"));
		student2.add(new StudentDemo(2, "Bhagyashree"));
		System.out.println(student1);
		System.out.println(student2);
		

		Scanner keyBord=new Scanner(System.in);
		System.out.println("Enter the student id=");
		int id=keyBord.nextInt();
		int index=0;
		int count=0;
		Iterator<StudentDemo> stu1=student1.iterator();
		while(stu1.hasNext())
		{
			StudentDemo data1=(StudentDemo)stu1.next();
			index++;
			if(data1.stu_id==id)
			{
				Iterator<StudentDemo> stu2=student2.iterator();
				
				while(stu2.hasNext())
				{
					
					StudentDemo data2=(StudentDemo)stu2.next();
					count++;
					if(index==count)
					{
					if(data2.stu_id==data1.stu_id) 
					{
						System.out.println("Id found at position at index No="+index);
					
					}
					else 
					{
						System.out.println("oops Id not found....");
						
					}
				}
					
					
			}
		}
			
	}

}
}
class StudentDemo
{
	int stu_id;
	String name;
	
	public StudentDemo(int id,String sname) 
	{
		this.stu_id=id;
		this.name=sname;
	}
	
	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", name=" + name + "]";
	}
	
	
}
