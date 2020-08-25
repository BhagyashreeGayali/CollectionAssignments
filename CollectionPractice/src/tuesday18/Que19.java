package tuesday18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


class StudentSet
{
	int stu_id;
	String stu_name;
	String qualification;
	int yearOfPassing;
	boolean placed;
	
	public StudentSet(int stu_id, String stu_name, String qualification, int yearOfPassing, boolean placed)
	{
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.qualification = qualification;
		this.yearOfPassing = yearOfPassing;
		this.placed = placed;
	}
/*
	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + " stu_name=" + stu_name + " qualification=" + qualification
				+ " yearOfPassing=" + yearOfPassing + " placed=" + placed + "]";
	}*/
	
	
}
public class Que19 
{
/*There is a HashSet which has student objects. Create two arraylists from this
hashset. In one arraylist called ‘placedStudents’ insert all students who have
been placed and in another arraylist ‘unplacedStudents’
Student class--Fields
studid, Name, Qualification, yearOfpassing, placed(true/false)*/

	public static void main(String[] args) 
	{
		HashSet student=new HashSet();
		student.add(new StudentSet(1, "Shree", "master in CSE", 2016, true));
		student.add(new StudentSet(2, "Omkar", "Ec", 2014, false));
		student.add(new StudentSet(3, "Umesh", "Ece", 2017, true));
		student.add(new StudentSet(4, "Viki", "CE", 2013, false));
		
		ArrayList<StudentSet> placedStudent=new ArrayList(student);
		
		ArrayList<StudentSet> unPlacedStudent=new ArrayList(student);
		System.out.println("placed Students");
		Iterator<StudentSet> itr=placedStudent.iterator();
		while(itr.hasNext())
		{
			StudentSet data=itr.next();
			if(data.placed==true)
			{
				
				System.out.println(data.stu_id+"  "+data.stu_name+"  "+data.qualification+"  "+data.yearOfPassing+"  "+data.placed);
			}
		}
		System.out.println("----------------------------------");
		System.out.println("unplaced Students");
		Iterator<StudentSet> itr1=unPlacedStudent.iterator();
		while(itr1.hasNext())
		{
			StudentSet data=itr1.next();
			if(data.placed==false)
			{
				
				
				System.out.println(data.stu_id+"  "+data.stu_name+"  "+data.qualification+"  "+data.yearOfPassing+"  "+data.placed);
			}
		}
				
		

	}

}
