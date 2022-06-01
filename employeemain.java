import java.util.*;
class employee
{
 int eNo,eSalary;
 String eName=new String();
 Scanner sc=new Scanner(System.in);

    employee()
    {
      System.out.println("Enter the no");  
      this.eNo=sc.nextInt();
      System.out.println("enter the name");
      this.eName=sc.nextLine();
      System.out.println("enter the salary");
      this.eSalary=sc.nextInt();
    }

    void display()
    {
        System.out.println("The emp no is "+this.eNo);
        System.out.println("The emp name is "+this.eName);
        System.out.println("The Salary is "+this.eSalary);
    }
}

class employeemain
{ 
    public static void main(String[]args)
    {   Scanner sc=new Scanner(System.in);
        // employee[] e;
        int n;
        System.out.println("enter the number of employees");
        n=sc.nextInt();
        employee e[]=new employee[n];

        for(int i=1;i<=n;++i)
        {	
        	e[i]=new employee();	
            	e[i].display();
        }

    }
}
