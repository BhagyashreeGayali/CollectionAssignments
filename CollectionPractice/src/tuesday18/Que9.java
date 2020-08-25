package tuesday18;

import java.util.ArrayList;

public class Que9
{
/*Write a Program in Java, You have an Employee class 
class Employee{ 
String name; 
int eid, 
int mgrid; 
} 
Every manager is also employee. So create an arraylist of 5 Emp and print all Employee along 
with their Manager name.*/

	public static void main(String[] args) 
	{
		ArrayList<Employeee> emplist=new ArrayList<Employeee>();
		emplist.add(new Employeee("ABC", 1, 2));
		emplist.add(new Employeee("STU", 2, 3));
		emplist.add(new Employeee("PQR", 3, 4));
		emplist.add(new Employeee("XYZ", 4, 5));
		System.out.println("Employee ||  Manager");
		System.out.println(".......................");
		for(int i=0;i<emplist.size();i++)
		{
			
			for(int j=i+1;j<emplist.size();j++)
			{
				if(emplist.get(i).manager_id==emplist.get(j).emp_id)
				{
					System.out.println(emplist.get(i).emp_name+"     "+emplist.get(j).emp_name);
				}
				else if(emplist.get(i).emp_id==emplist.get(j).manager_id)
				{
					
					System.out.println(emplist.get(j).emp_name+"    "+emplist.get(i).emp_name);
				}
			}
		}
		
		
		
	}

}
class Employeee
{
	String emp_name;
	int emp_id;
	int manager_id;
	public Employeee(String name,int eid,int mid ) 
	{
		this.emp_name=name;
		this.emp_id=eid;
		this.manager_id=mid;
		
	}
	@Override
	public String toString() {
		return "Employee [emp_name=" + emp_name + ", emp_id=" + emp_id + ", manager_id=" + manager_id + "]";
	}
	
}