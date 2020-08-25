package tuesday18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Que10 
{
/*An map contains student object as a key and list of courses he has enrolled in. 
e.g. map<student , list(course)>  
Create another map in which course id is a key and list of student objects of that cource.*/


public static void main(String[] args) 
	{
	ArrayList< Course> course=new ArrayList<Course>();
	course.add(new Course(1, "java"));
	course.add(new Course(2, "html"));
	ArrayList< Course> course1=new ArrayList<Course>();
	course1.add(new Course(1, "java"));
	course1.add(new Course(3, "sql"));
	
	HashMap<SecondStudent, List<Course>> oldmap=new HashMap();
	oldmap.put(new SecondStudent(1, "Shree"),course );
	oldmap.put(new SecondStudent(2, "Omkar"),course1 );
	oldmap.put(new SecondStudent(2, "Umesh"),course1 );
	oldmap.put(new SecondStudent(2, "Vishu"),course );
	//System.out.println(oldmap);
	HashMap<Integer,List<String>> newmap=new HashMap();
	
	for(Map.Entry<SecondStudent, List<Course>> itr:oldmap.entrySet())
	{
		String n=null;
		
		List<Course> list=itr.getValue();
		//System.out.println(list);
		//System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			List< String> f_list=new ArrayList();
			if(newmap.containsKey(list.get(i).c_id))
			{
			 f_list=newmap.get(list.get(i).c_id);
			}
			f_list.add(itr.getKey().stu_name);
			newmap.put(list.get(i).c_id,f_list);
					
					
		}
		//System.out.println(newmap);
		
	}
	System.out.println(newmap);
	
	
	
		

	}

}
class SecondStudent
{
	int id;
	String stu_name;
	
	public SecondStudent(int s_id,String name) 
	{
		this.id=s_id;
		this.stu_name=name;
	}

	@Override
	public String toString() 
	{
		return "SecondStudent [id=" + id + ", stu_name=" + stu_name + "]";
	}
	
	
}
class Course
{
	int c_id;
	String c_name;
	public Course(int id,String name) 
	{
		this.c_id=id;
		this.c_name=name;
	}
	@Override
	public String toString() 
	{
		return "Course [c_id=" + c_id + ", c_name=" + c_name + "]";
	}
	
}
