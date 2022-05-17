import java.util.*;

class sortstring
{ static int i,j;
static Scanner sc=new Scanner(System.in);
static String[] cities=new String[5];
static String temp=new String();
public static void main(String args[])
{
System.out.println("Enter the names of cities");
for(i=0;i<5;++i)
	cities[i]=sc.next();
for(i=0;i<5;i++)
{
for(j=i+1;j<5;++j)
	{
		if(cities[i].compareTo(cities[j])>0)
			{temp=cities[i];
			cities[i]=cities[j];
			cities[j]=temp;}
	}
}
System.out.println("The cities in order are: ");
for(i=0;i<5;++i)
	{
		System.out.println(cities[i]);
	}
}
}
