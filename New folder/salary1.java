import java.util.*;
interface sal1
{
	public void calculate_sal(String name,int units);
}
class Manager_sales1 implements sal1
{
	String name;
	int units;
	double std_salary=50000;
	double salary;
	double incre=0.1;
	int yes_count=0,no_count=0;
	public void calculate_sal(String name,int units){
		this.name=name;
		this.units=units;
		if(units>10000)
		{
			salary=std_salary+std_salary*incre;
			yes_count+=1;
		}
		else{
			no_count+=1;
		}
	}
	public void print_d()
	{
		if(yes_count>=1)
		{
			System.out.println("Wow you have soled more that your goal you get increment of  "+std_salary*incre);
			System.out.println("Your total salary is "+salary);
		}
		else{
			System.out.println("You did not achive the goal but ok "+std_salary);
		}
	}
}
class Manager_Admin1 extends Manager_sales1 implements sal1
{
	String name;
	int no_of_emp,yes_count1;
	int std_salary=50000;
	int incentive=5000;
	Scanner sc=new Scanner(System.in);
	public void calculate_sal(String name,int no_of_emp)
	{
		this.name=name;
		this.no_of_emp=no_of_emp;
		for(int i=1;i<=no_of_emp;i++)
		{
			System.out.println("The name of "+i+" Employee is");
			String name1=sc.nextLine();
			System.out.println("The no of units soled by "+name1+" ");
			int units1=sc.nextInt();
			sc.nextLine();
			Manager_sales m=new Manager_sales();
			m.cal_salary(name1, units1);
			yes_count1=m.yes_count;
		}
		if(yes_count1>=1){
			std_salary+=incentive;
			System.out.println("Congerts you have achived incentive of amount  "+incentive);
			System.out.println("The total salary of manager_admin is "+std_salary);
		}
		else{
			System.out.println("Non of the manager under you did not achive the goal ");
			System.out.println("Total salary is "+std_salary);
		}
	}
}
public class salary1 {
	public static void main(String args[])
	{
		Manager_Admin1 ma=new Manager_Admin1();
		Manager_sales1 ms=new Manager_sales1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of Manager_Admin ");
		String name=sc.nextLine();
		System.out.println("Enter the number of Manager he contorles ");
		int no_of_emp=sc.nextInt();
		ma.calculate_sal(name, no_of_emp);
		sc.nextLine();
		System.out.println("**************************************************");
		System.out.println("Enter the name of manager ");
		String name1=sc.nextLine();
		System.out.println("Enter the units the manager soled");
		int unit=sc.nextInt();
		ms.calculate_sal(name1, unit);
		ms.print_d();
	}
}
