import java.util.*;
interface interst{
	public void calcu_i(String name,int age,double balance);
}
class person implements interst{
	String name;
	int age;
	double balance,o_i=0.09,y_i=0.08,int_a;
	public void calcu_i(String n,int a,double b){
		name=n;
		age=a;
		balance=b;
		if(age>60){
			int_a=balance*o_i;
			System.out.println("Since your age is "+age+"\nYou are elible to get "+(o_i*100)+"% Interst");
			System.out.println("Your balance is "+balance);
			System.out.println("Your interst amount is "+(int_a));
			balance+=int_a;
			System.out.println("You new balance is "+balance);
		}
		else{
			int_a=balance*y_i;
			System.out.println("Scence your age is "+age+"\nYou are eligibale to get "+(y_i*100)+"% Interst");
			System.out.println("Your balance is "+balance);
			System.out.println("Your Interst amount is "+int_a);
			balance+=int_a;
			System.out.println("Your new balance is "+balance);
		}
	}
}
public class cal_i {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String name;
		int age;
		double balance;
		System.out.println("Enetr the name of customer ");
		name=sc.nextLine();
		System.out.println("Enter the age of "+name);
		age=sc.nextInt();
		System.out.println("Enter the balnce of "+name);
		balance=sc.nextDouble();
		person p=new person();
		p.calcu_i(name, age, balance);
	}
}
