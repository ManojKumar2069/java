import java.util.*;
class working{
	String name;
	int age;
	double salary;
	final int pre_h=1000;
	double hrs_w;
	public void calcu_work(String n,int a,double h){
		name=n;
		age=a;
		hrs_w=h;
		salary=hrs_w*pre_h;
	}
	public void print_d(){
		System.out.println("The name of employee "+name);
		System.out.println("The age of employee "+age);
		System.out.println("The salary of employee "+salary);
	}
}
class non_working extends working{
	String role;
	final int per_h_c=100;
	double hrs_w;
	final int per_h_wat=150;
	boolean flg=false;
	public void calcu_work(String n,int a,double h,String r){
		name=n;
		age=a;
		hrs_w=h;
		role=r;
		if(role.equalsIgnoreCase("Cleanner")){
			salary=per_h_c*hrs_w;
			flg=true;
		}
		else if(role.equalsIgnoreCase("Watchman")){
			salary=per_h_wat*hrs_w;
			flg=true;
		}
		else{
			System.out.println("We dont have such role in our organization");
		}
	}
	public void print_d(){
		if(flg==true){
			super.print_d();
			System.out.println("His role is "+role);
		}
		else{
			System.out.println("Wrong details");
		}
	}
}
public class exted_clas {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		working w1=new working();
		non_working w2=new non_working();
		int ch;
		String name,role;
		int age;
		double hrs;
		System.out.println("1.Working staff \n2.Non-Working staff");
		ch=sc.nextInt();
		sc.nextLine();
		switch(ch){
		case 1:
			System.out.println("Enter the name of employee ");
			name=sc.nextLine();
			System.out.println("Enter the age of employee ");
			age =sc.nextInt();
			System.out.println("How many hr_s he worked ");
			hrs=sc.nextDouble();
			w1.calcu_work(name, age, hrs);
			w1.print_d();
			break;
		case 2:
			System.out.println("Enter the name of employee ");
			name=sc.nextLine();
			System.out.println("Enter the age of employee ");
			age =sc.nextInt();
			System.out.println("How many hr_s he worked ");
			hrs=sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter the role you work ");
			role=sc.nextLine();
			w2.calcu_work(name, age, hrs,role);
			w2.print_d();
			break;
		default:
			System.out.println("no Such role");
		}
	}
}
