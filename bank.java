import java.util.*;
class c_account
{
	static String customer_name;
	static int account_num,ammount,account_type;
	static double balance=150;
	void getcus(String c,int t,int acc)
	{
		customer_name=c;
		account_type=t;
		account_num=acc;
	}
	void deposit(int a){
		ammount=a;
		balance=ammount+balance;
		System.out.println("The avalable balance is"+balance);
	}
	void witdrawal(int a){
		ammount=a;
		if(balance>ammount){
			balance=balance-ammount;
			System.out.println("The ammount withdrawn is"+ammount+"the avaliable balance is"+balance);
		}
		else{
			System.out.println("NO FUNDS");
		}
	}
	void display_bal(){
		System.out.println("The available balance is:- "+balance);
	}
	void intres_cal(){
		double rate=4.5;
		int time=1;
		double sub=1+rate/12*Math.pow(12,time);
		balance=(balance*sub)-balance;
		System.out.println("The updated balance is"+balance);
	}

}
public class s_account extends c_account
{
	public static void main(String args[]){
	int choise;
	String cus;
	int acconum,accot;
	c_account obj1=new c_account();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter customer name");
	cus=sc.nextLine();
	System.out.println("Enter customer account_type");
	System.out.println("1.Savings");
	System.out.println("2.Current");
	accot=sc.nextInt();
	System.out.println("Enter customer account number");
	acconum=sc.nextInt();
	obj1.getcus(cus,accot,acconum);	
	if(accot==1){
		System.out.println("Enter Your choise");
		System.out.println("1.deposit");
		System.out.println("2.withdrawal");
		System.out.println("3.display balance");
		System.out.println("4.intrest cal");
		choise=sc.nextInt();
		switch(choise){
			case 1:
				System.out.println("Enter the deposit amount");
				int dep;
				dep=sc.nextInt();
				obj1.deposit(dep);
				break;
			case 2:
				System.out.println("Enter the Withdrawal amount");
				dep=sc.nextInt();
				obj1.witdrawal(dep);
				break;
			case 3:
				System.out.println("Displaying balance");
				obj1.display_bal();
				break;
			case 4:
				System.out.println("Intrest ammount");
				obj1.intres_cal();
				break;
			default:
				System.out.println("MC select a proper choise");
			}
	}
	else{
		System.out.println("You have a current account");
	}
}
}
