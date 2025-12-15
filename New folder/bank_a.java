import java.util.*;
interface bank<n,a extends Number,a_t,b extends Number>{
	public void calculate_i(n na,a a_n,a_t a_ty,b ba);
}
class bank_a1<n,a extends Number,a_t,b extends Number> implements bank<n,a,a_t,b>{
	n name;
	a acc_no;
	a_t acc_type;
	b balance;
	double s_i=0.1;
	double c_i=0.05,c_f=0.1;
	public void calculate_i(n n,a ac_n,a_t a_ty,b ba){
		name=n;
		acc_no=ac_n;
		acc_type=a_ty;
		balance=ba;
		String ac=acc_type.toString();
		int c_min_b=10000;
		double b1=balance.doubleValue();
		if(ac.equalsIgnoreCase("Savings")){
			System.out.println("The name of customer is "+name);
			System.out.println("The Account_Type of customer is "+ac);
			System.out.println("The Account number of customer is "+acc_no);
			System.out.println("The balance of customer is "+balance);
			double i_a=b1*s_i;
			b1+=i_a;
			System.out.println("You get an intest of "+i_a+"\nNew Balance is "+b1);
		}
		else if(ac.equalsIgnoreCase("Current")){
			if(b1>c_min_b){
				System.out.println("Your current balance is greater than min limit \n " +
						"so you get an interst of "+(c_i*100));
				double i_a=b1*c_i;
				System.out.println("Your interst ammount is "+i_a);
				b1+=i_a;
				System.out.println("Your new balance is "+b1);
			}
			else{
				System.out.println("You are balance "+b1+" is less than min balance "+c_min_b);
				double f_a=b1*c_f;
				System.out.println("your fine ammount is "+f_a);
				b1-=f_a;
				System.out.println("Your new balance is "+b1);
			}
		}
		else{
			System.out.println("We dont have account type "+ac+" in our bank");
		}
	}
}
public class bank_a {
	public static void main(String args[]){
		bank_a1<String,Integer,String,Double> o=new bank_a1<String,Integer,String,Double>();
		Scanner sc=new Scanner(System.in);
		String name;
		String a_t;
		int a_c;
		double b;
		while(true){
		System.out.println("Enter the name of customer");
		name=sc.nextLine();
		System.out.println("Enter the account number of "+name);
		a_c=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the account Type ");
		a_t=sc.nextLine();
		System.out.println("Enter the balance ");
		b=sc.nextDouble();
		o.calculate_i(name, a_c, a_t, b);
		sc.nextLine();
	}
	}
}
