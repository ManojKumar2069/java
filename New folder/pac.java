import new_pack.*;
import java.util.*;
class calcu_500 implements calse{
	String name;
	int age;
	double amount,months,intrest_e=0.15,intrest_y=0.20,loan_a;
	public void clacu(String n,int a,double amo,double mon){
		name=n;
		age=a;
		amount=amo;
		months=mon;
		if(amount<=0||age<=0){
			System.out.println("Invalid input");
		}
		else if(age>80){
			loan_a=amount*intrest_e*months;
			System.out.println("Since you are a sciener citizen your interst percentage is "+(intrest_e*100));
			System.out.println("The Total amount you took loan is "+amount);
			System.out.println("The Interst loan amount is "+loan_a);
			System.out.println("The total amount is "+(amount+loan_a));
		}
		else{
			loan_a=amount*intrest_y*months;
			System.out.println("Since you are a normal citizen you get an interst of "+(intrest_y*100));
			System.out.println("The total amount you took loan is "+amount);
			System.out.println("The Intrest amount is "+loan_a);
			System.out.println("Total ammount payable is "+(amount+loan_a));
		}
	}
}
public class pac{
	public static void main(String args[]){
		String name;
		int age;
		double amount,months;
		calcu_500 c=new calcu_500();
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("Enter the name of cusomer ");
		name=sc.nextLine();
		System.out.println("Enter the age of customer ");
		age=sc.nextInt();
		System.out.println("Enter the amount you want loan ");
		amount=sc.nextDouble();
		System.out.println("Enter the duration of loan ");
		months=sc.nextDouble();
		c.clacu(name, age, amount, months);
		sc.nextLine();
		}
	}
}
