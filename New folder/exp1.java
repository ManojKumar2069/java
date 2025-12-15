import java.util.*;
class calcu{
	void qudra(int a,int b,int c)
	{
		double descr=b*b-4*a*c;
		if(descr<0){
			System.out.println("The roots are not real ");
			double res=(-b+Math.sqrt(descr)/2*a);
			double res1=(-b-Math.sqrt(descr)/2*a);
			System.out.println("The results are "+res+res1);
		}
		else{
			System.out.println("The result of quadratic equaltions are");
			double res=(-b+Math.sqrt(descr)/2*a);
			double res1=(-b-Math.sqrt(descr)/2*a);
			System.out.println(res+" "+res1);
		}
	}
}
public class exp1 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A ");
		int a=sc.nextInt();
		System.out.println("Enter the value of B ");
		int b=sc.nextInt();
		System.out.println("Enter the value of c ");
		int c=sc.nextInt();
		calcu ob1=new calcu();
		ob1.qudra(a, b, c);
	}
}
