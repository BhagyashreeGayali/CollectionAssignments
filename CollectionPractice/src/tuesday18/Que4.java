package tuesday18;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Que4 
{
//public static Object javastudent;

/*A hashmap contains information about students and his marks. Student object is key and marks is 
 * value. Write a method to create 2 hashset which will have passed students of java course and 
 * passed students of angular course.Passing marks for java is 50 and passing marks for angular 
 * is 60. Student class is as follows. Student { intsid , String name, String course }
 */

	public static void main(String[] args) 
	{
		HashMap<Student, Integer> student = new HashMap<Student, Integer>();
		HashSet<String> javaStudent=new HashSet<String>();
		HashSet<String> angularStudent=new HashSet<String>();
		
		student.put(new Student(1, "abc", "java"),60);
		student.put(new Student(2, "pqr", "java"), 30);
		student.put(new Student(3, "xyz", "angular"), 65);
		student.put(new Student(1, "abc", "angular"), 40);
		student.put(new Student(1, "def", "java"), 65);
		for(Map.Entry<Student, Integer> data:student.entrySet())
		{
			String stuname=data.getKey().course;
			int stumarks=data.getValue();
			if(stuname.equals("java") && stumarks>=50)
			{
				javaStudent.add(data.getKey().name);
				//System.out.println(javaStudent);
			
			}
			else if(stuname.equals("angular") && stumarks>=60)
			{
				angularStudent.add(data.getKey().name);
			}
			
		}
		System.out.println("Name of java student="+javaStudent);
		System.out.println("Name of the angular student="+angularStudent);

}
}
class Student 
{
	HashSet<String> javastudent;
	int stu_id;
	String name;
	String course;
	public Student()
	{
		
	}
	
	public Student(int id,String s_name,String c_name) 
	{
		this.stu_id=id;
		this.name=s_name;
		this.course=c_name;
	}

	@Override
	public String toString()
	{
		return "Student [stu_id=" + stu_id + ", name=" + name + ", course=" + course + "]";
	}
}