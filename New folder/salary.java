import java.util.*;
interface sal
{
	public void cal_salary(String name,int units);
}
class Manager_sales implements sal
{
	String name;
	int units,yes_count=0,no_count;
	int standard_sal=25000;
	double incr=0.1;
	double salary;
	public void cal_salary(String name,int units){
		this.name=name;
		this.units=units;
		if(units>10000)
		{
			salary=standard_sal+standard_sal*incr;
			yes_count+=1;
		}
		else
		{
			no_count+=1;
		}
	}
	void print_d()
	{
		if(yes_count==1){
		System.out.println("Congrates You have acvived your salse target your increment is "+standard_sal*incr);
		System.out.println("Your total salary is "+salary);
		}
		else{
			System.out.println("the standard salary is "+standard_sal);
		}
	}
}
class Manager_Admin extends Manager_sales implements sal
{
	String name;
	int no_of_people;
	double salary=30000;
	int incentive=5000;
	public void cal_salary(String name,int units)
	{
		this.name=name;
		no_of_people=units;
		int yes_count1=0;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=no_of_people;i++)
		{
			String name1;
			int units1;
			Manager_sales s=new Manager_sales();
			System.out.println("Enter the name of "+i+" Manager_sales");
			name1=sc.nextLine();
			System.out.println("Enter the number of units did "+i+" Manager_sales sale");
			units1=sc.nextInt();
			sc.nextLine();
			s.cal_salary(name1, units1);
			yes_count1=s.yes_count;
		}
		if(yes_count1>=1)
		{
			salary+=incentive;
			System.out.println("The salary of Manager_admin is adding incentive "+salary);
		}
		else
		{
			System.out.println("The salary of Manager_admin is "+salary);
		}
		}
	}
public class salary {
	public static void main(String args[]){
		String name;
		int units;
//		Manager_sales s=new Manager_sales();
		System.out.println("Enter the name of manager");
		Scanner sc =new Scanner(System.in);
		name=sc.nextLine();
		System.out.println("Enter the number of units he sold");
		units=sc.nextInt();
//		s.cal_salary(name, units);
//		s.print_d();
		Manager_Admin m=new Manager_Admin();
		m.cal_salary(name, units);
	}
}
