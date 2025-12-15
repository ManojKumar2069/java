import java.util.*;
abstract class calcu1
{
	abstract void calculate_area(int a,int b);
	abstract void print_d();
}
class circle extends calcu1
{
	int a;
	int d;
	double res;
	public void calculate_area(int a,int b)
	{
		this.a=a;
		b=d;
		if(a<0){
			System.out.println("Plz enter a positive number");
		}
		else{
			res=Math.PI*a*a;
		}
	}
	public void print_d()
	{
		System.out.println("The area of circle is "+res);
	}
}
class rectangle extends calcu1{
	int a,b;
	double res;
	public void calculate_area(int a,int b)
	{
		this.a=a;
		this.b=b;
		if(a<0||b<0){
			System.out.println("Plz enter a positive number");
		}
		else
		{
			res=a*b;
		}
	}
	public void print_d(){
		System.out.println("The are of rectangle is "+res);
	}
}
class square extends calcu1
{
	int a;
	int b;
	double res;
	public void calculate_area(int a,int b){
		this.a=a;
		this.b=b;
		if(a<0){
			System.out.println("Plz enter a positive number");
		}
		else
		{
			res=a*a;
		}
	}
	public void print_d()
	{
		System.out.println("The area of square is "+res);
	}
}
public class test_1 {
	public static void main(String args[])
	{
		String cmd;
		Scanner sc=new Scanner(System.in);
		int i=1;
		do{
		System.out.println("Enter the shape yo wnat to calculate area ");
		cmd=sc.nextLine();
		if(cmd.equalsIgnoreCase("Circle"))
		{
			System.out.println("Enter the radus of citcle");
			int b=0;
			int r=sc.nextInt();
			circle c=new circle();
			c.calculate_area(r, b);
			c.print_d();
		}
		else if(cmd.equalsIgnoreCase("Rectangle"))
		{
			System.out.println("Enter the lenght of reactangle ");
			int l=sc.nextInt();
			System.out.println("Enter the breath of recatngle");
			int b=sc.nextInt();
			rectangle r=new rectangle();
			r.calculate_area(l, b);
			r.print_d();
		}
		else if(cmd.equalsIgnoreCase("Square"))
		{
			System.out.println("Enter the lenght of square");
			int a=sc.nextInt();
			int b=0;
			square s=new square();
			s.calculate_area(a, b);
			s.print_d();
		}
		else
		{
			System.out.println("We cant claculate the are for "+cmd);
		}
		}
		while(i==1);
	}
}
