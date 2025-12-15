//Define an interface calculateSalary() implemented by:
//SalesExecutive
//RegionalManager
//Conditions:
//
//SalesExecutive gets 12% commission if sales > ₹5,00,000
//
//RegionalManager gets ₹10,000 incentive if at least two SalesExecutives under him achieve the above target
//
//Demonstrate aggregation (HAS-A relationship)
import java.util.*;
interface calcu_100{
	public void calculate_salary();
	public void print_d();
}
class SalesEx implements calcu_100
{
	String name,empid;
	double com=0.12;
	double salary=15000;
	int sold_u;
	double price_per_u=1500;
	int yes=0,no=0;
	double sales_a;
	boolean achied=false;
	SalesEx(String n,String e,int s)
	{
		name=n;
		empid=e;
		sold_u=s;
	}
	public void calculate_salary()
	{
		sales_a=sold_u*price_per_u;
		if(sales_a>100000)
		{
			yes+=1;
			achied=true;
		}
		else
		{
			no++;
		}
	}
	public void print_d()
	{
		System.out.println("The name of employee "+name);
		System.out.println("The Emp_id of employee "+name+" is "+empid);
		if(yes==1)
		{
			System.out.println("Wow your sales amount is "+sales_a);
			System.out.println("you get a commision of Rs "+salary*com);
			salary=salary+salary*com;
			System.out.println("New salary is "+salary);
		}
		else{
			System.out.println("Salary is "+salary);
		}
	}
}
//RegionalManager gets ₹10,000 incentive if at least two SalesExecutives under him achieve the above target
//
//Demonstrate aggregation (HAS-A relationship)
class Reginal_m implements calcu_100{
	String name,empid;
	double salary=52000;
	int incentive=10000;
	int yes=0;
	int no_of_emp=0;
	Reginal_m(String n,String i,int n_e)
	{
		name=n;
		empid=i;
		no_of_emp=n_e;
	}
	public void calculate_salary()
	{
		for(int i=0;i<no_of_emp;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("You have "+no_of_emp+" under your control ");
			String n1,e1;
			int no_u;
			System.out.println("Enter name of "+(i+1)+" Employee ");
			n1=sc.nextLine();
			System.out.println("Enter emp_id of "+(i+1)+" Employee ");
			e1=sc.nextLine();
			System.out.println("Enter no of sales of "+e1+" Employee ");
			no_u=sc.nextInt();
			SalesEx ob=new SalesEx(n1,e1,no_u);
			ob.calculate_salary();
			if(ob.achied)
			{
				yes++;
			}
		}
		if(yes>=1){
			salary=salary+incentive;
			System.out.println("no of emp under you achived the target "+yes);
			System.out.println("You get an incentive of "+incentive);
			System.out.println("New salary is "+salary);
		}
		else{
			System.out.println("no of emp under you achived the target "+yes);
			System.out.println("salary is "+salary);
		}
	}
	public void print_d()
	{
		System.out.println("Name of emp "+name);
		System.out.println("Emp id of emp is "+empid);
	} 
}
public class prog_4 {
	public static void main(String args[])
	{
		calcu_100 c;
		c=new SalesEx("mks","mks123",80);
		c.calculate_salary();
		c.print_d();
		System.out.println("------------------------------------------------------------");
		c=new Reginal_m("manoj","manoj123",3);
		c.print_d();
		c.calculate_salary();
	}
}
