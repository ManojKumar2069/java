import java.util.*;
class wrong_age_exp extends Exception{
	wrong_age_exp(String msg){
		super(msg);
	}
}
interface calcu_inters{
	public void inst_acl(int a,double b)throws wrong_age_exp;
}
class person_1 implements calcu_inters{
	int a;
	double balance,c_i=0.08,y_i=0.05,i_a;
	public void inst_acl(int a,double b)throws wrong_age_exp{
	this.a=a;
	balance=b;
	if(a<0){
		throw new wrong_age_exp("Invalid age ");
	}
	else if(a>150){
		throw new wrong_age_exp("No one can be that much years old "+a);
	}
	else if(a>80){
		System.out.println("Your age is "+a);
		System.out.println("Your interst is "+(c_i*100)+" %");
		i_a=balance*c_i;
		System.out.println("The interst amount is "+i_a);
		System.out.println("balance is "+balance);
		balance+=i_a;
		System.out.println("New balance is "+balance);
	}
	else{
		System.out.println("Your age is "+a);
		System.out.println("Your interst is "+(y_i*100)+" %");
		i_a=balance*y_i;
		System.out.println("The interst amount is "+i_a);
		System.out.println("balance is "+balance);
		balance+=i_a;
		System.out.println("The new balance is "+balance);
	}
	}
}
public class exp_h {
	public static void main(String args[]){
		person_1 o=new person_1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer age");
		int a=sc.nextInt();
		System.out.println("Enter balance of customer ");
		double b=sc.nextDouble();
		try{
		o.inst_acl(a, b);
		}
		catch(wrong_age_exp e){
			System.out.println(e.getMessage());
		}
	}
}
