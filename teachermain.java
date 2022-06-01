import java.util.*;


class person
{
	 String name=new String();
	 String gender=new String();
	 String address=new String();
	 int age;
	 Scanner sc=new Scanner(System.in);
	 public person()
	 {
	 	System.out.println("Enter the name");
	 	this.name=sc.next();
	 	System.out.println("Enter the gender");
	 	this.gender=sc.next();
	 	System.out.println("Enter the address");
	 	this.address=sc.next();
	 	System.out.println("Enter the age");
	 	this.age=sc.nextInt();	 	
	 }
}

class employee extends person
{
	int empid;
	String company=new String();
	String qualification=new String();
	int salary;
	Scanner sc=new Scanner(System.in);
	public employee()
	{
		System.out.println("Enter the empid");
		this.empid=sc.nextInt();
		System.out.println("Enter the company");
		this.company=sc.next();
		System.out.println("Enter the Qualification");
		this.qualification=sc.next();
		System.out.println("Enter the Salary");
		this.salary=sc.nextInt();
	}
}

class teacher extends employee
{
	String subject=new String();
	String department=new String();
	String tid=new String();
	Scanner sc=new Scanner(System.in);
	public teacher()
	{
		System.out.println("Enter the Subject");
		this.subject=sc.next();	
		System.out.println("Enter the department");
		this.department=sc.next();
		System.out.println("Enter the teacher id");
		this.tid=sc.next();
	}
	public void printer()
	{
		System.out.println("the name is "+this.name);
		System.out.println("the gender is "+this.gender);
		System.out.println("the address is "+this.address);
		System.out.println("the age is "+this.age);
		System.out.println("the empid is "+this.empid);
		System.out.println("the company is "+this.company);
		System.out.println("the qualification is "+this.qualification);
		System.out.println("the salary is "+this.salary);
		System.out.println("the Subject is "+this.subject);
		System.out.println("the dept is "+this.department);
		System.out.println("the teacher id is "+this.tid);
	}

}

class teachermain
{
	public static void main(String args[])
	{
		teacher[] t=new teacher[3];
		for(int i=0;i<3;++i)
		{	
			t[i]=new teacher();
			t[i].printer();
		}	
	}
} 
