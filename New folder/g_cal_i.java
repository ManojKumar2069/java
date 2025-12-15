import java.util.*;
interface mass<t extends Number,r extends Number,n>{
	public void in_c(n na,t a,r b);
}
class per<t extends Number,r extends Number,n>implements mass<t,r,n>{
	t a;
	r balance;
	n name;
	double o_i=0.09,y_i=0.08;
	public void in_c(n n,t a,r b){
		this.a=a;
		name=n;
		balance=b;
		int age=a.intValue();
		double b1=balance.doubleValue();
		if(age>60){
			double i=b1*o_i;
			System.out.println("the name of customer "+name);
			System.out.println("The age of customer is "+age);
			System.out.println("The currrent balance is "+b1);
			System.out.println("The interst amount is "+i);
			b1+=i;
			System.out.println("New Balance is "+b1);
		}
		else{
			double i=b1*y_i;
			System.out.println("the name of customer "+name);
			System.out.println("The age of customer is "+age);
			System.out.println("The currrent balance is "+b1);
			System.out.println("The interst amount is "+i);
			b1+=i;
			System.out.println("New Balance is "+b1);
		}
	}
}
public class g_cal_i {
	public static void main(String args[]){
		per<Integer,Double,String>o=new per<Integer,Double,String>();
		int a1;
		double b1;
		String n1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of customer ");
		n1=sc.nextLine();
		System.out.println("Enter the age of customer ");
		a1=sc.nextInt();
		System.out.println("Enter the balance  of customer ");
		b1=sc.nextDouble();
		o.in_c(n1,a1,b1);
	}
}
