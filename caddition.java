import java.util.*;

class complex
{
	int real,img;
	Scanner sc=new Scanner(System.in);
	void init()
		{	System.out.println("Enter the real part");
			this.real=sc.nextInt();
			System.out.println("Enter the img part");
			this.img=sc.nextInt();
		}

	complex add(complex c1,complex c2)
	{	
			
			this.real=c1.real+c2.real;
			this.img=c1.img+c2.img;
			return this;
	}
	void display()
	{
		System.out.println(this.real+"+"+this.img+"i");
	}
}

class caddition
{
	public static void main(String args[])
	{
		complex c1=new complex();
		c1.init();
		complex c2=new complex();
		c2.init();
		System.out.println("The complex numbers after addition is: ");
		complex c3=new complex();
		c3=c3.add(c1,c2);
		c3.display();
	}
}


