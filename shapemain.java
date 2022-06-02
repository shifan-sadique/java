import java.util.*;

interface shape
{
	double pi=3.14;
	void area();
	void perimeter();
}

class circle implements shape
{Scanner sc=new Scanner(System.in);
double r,a,p;

	public circle()
	{
		System.out.println("Enter the radius");
		this.r=sc.nextInt();
	}
	public void area()
	{	
		this.a=pi*this.r*this.pi;
		System.out.println("The area is "+this.a);
	}
	public void perimeter()
	{
		this.p=2*pi*this.r;
		System.out.println("The perimeter of circle is "+this.p);
	}
}

class rectangle implements shape
{Scanner sc=new Scanner(System.in);
double l,b,a,p;

	public rectangle()
	{
		System.out.println("Enter the length");
		this.l=sc.nextInt();
		System.out.println("Enter the bredth");
		this.b=sc.nextInt();
	}
	public void area()
	{	
		this.a=this.l*this.b;
		System.out.println("The area of rectangle is "+this.a);
	}
	public void perimeter()
	{
		this.p=2*(this.l+this.b);
		System.out.println("The perimeter of rectangle is "+this.p);
	}
}

class shapemain
{static int ch,cont;
static Scanner sc=new Scanner(System.in);
static rectangle r=new rectangle();
static circle c=new circle();
	public static void main(String [] args)
	{	
		do
		{
			System.out.println("Enter the choice");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:r.area();
					break;
				case 2:r.perimeter();
					break;
				case 3:c.area();
					break;
				case 4:c.perimeter();
					break;
				
			}
			System.out.println("Press 0 to Continue");
			cont=sc.nextInt();
			
		}while(cont==0);
	}
}
