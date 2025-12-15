//Create an abstract class Account with an abstract method calculateInterest() implemented by:
//
//SavingsAccount
//
//CurrentAccount
//
//Conditions:
//
//Savings account gives 4% interest if balance ≥ ₹50,000
//
//Current account gives 2% interest only if average balance ≥ ₹1,00,000
//
//Use dynamic method dispatch to calculate interest
import java.util.*;
abstract class calcu_i
{
	abstract void calculate_Interest(double balance);
	abstract void print_d();
}
class Savings extends calcu_i
{
	String name;
	long accno;
	double balance,interst=0.04;
	Savings(String n,long a)
	{
		name=n;
		accno=a;
	}
	 public void calculate_Interest(double balance)
	{
		this.balance=balance;
		if(balance>=50000)
		{
			System.out.println("WOW you have "+balance+" in your account ");
			balance+=balance*interst;
			System.out.println("Your current balance after intrest "+balance);
		}
		else
		{
			System.out.println("your current balance is "+balance);
		}
	}
	public void print_d(){
		 System.out.println("The name of account holder "+name);
		 System.out.println("The acccount number "+name+" is "+accno);
	}
}
class current extends calcu_i
{
	String name,accno;
	double interset=0.02;
	double b_1;
	double[] balance;
	double real_b;
	current(String n,String a,double b_1){
		name=n;
		accno=a;
		this.b_1=b_1;
	}
	public void calculate_Interest(double m)
	{
		 int month = (int) m;
	     balance = new double[month]; // IMPORTANT FIX
		for(int i=0;i<m;i++){
			System.out.println("enter the balance of "+i+" Month");
			double b1;
			Scanner sc=new Scanner(System.in);
			b1=sc.nextDouble();
			balance[i]=b1;
			real_b+=balance[i];
		}
		real_b=real_b/m;
		if(real_b>=100000)
		{
			b_1=b_1+b_1*interset;
			System.out.println("You have a avrage balance of "+real_b+" so you get an interst of "+interset);
			System.out.println("Your curent balance is "+b_1);
		}
		else
		{
			System.out.println("balance is"+b_1);
		}
		
	}
	public void print_d()
	{
		System.out.println("The name of customer is "+name);
		System.out.println("The account number of "+name+" is "+accno);
	}
}
public class prog_3 {
	public static void main(String args[])
	{
		calcu_i c;
		c=new Savings("mks",123456);
		c.calculate_Interest(1500000);
		c.print_d();
		Scanner sc=new Scanner(System.in);
		c=new current("mks","bmk123",150000);
		System.out.println("Enter how many moths");
		int month=sc.nextInt();
		c.calculate_Interest(month);
		c.print_d();
	}
}
