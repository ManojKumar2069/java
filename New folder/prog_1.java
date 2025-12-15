import java.util.*;
abstract class shape
{
	abstract public void calcu_a(int a);
	abstract public void print_d();
}
class square1 extends shape{
	int a;
	double res;
	public void calcu_a(int a){
		this.a=a;
		if(a<=0){
			System.out.println("The length cannot be negative "+a);
		}
		else{
			res=a*a;
		}
	}
	public void print_d()
	{
		System.out.println("The area of SQUARE is "+res);
	}
}
class circle1 extends shape{
	int a;
	double res;
	public void calcu_a(int a){
		this.a=a;
		if(a<=0){
			System.out.println("The raduis cannot be negative "+a);
		}
		else{
			res=Math.PI*a*a;
		}
	}
	public void print_d(){
		System.out.println("The are of circle is "+res);
	}
}
public class prog_1 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String cmd;
		int a;
		System.out.println("Enter the shape you want to calculate area");
		cmd=sc.nextLine();
		shape c;
		if(cmd.equalsIgnoreCase("Circle")){
			c=new circle1();
			System.out.println("Eneter the raduis of circle");
			a=sc.nextInt();
			c.calcu_a(a);
			c.print_d();
		}
		else if(cmd.equalsIgnoreCase("square")){
			c=new square1();
			System.out.println("Enter the lenght of square ");
			a=sc.nextInt();
			c.calcu_a(a);
			c.print_d();
		}
		else{
			System.out.println("We cant calculate the area for the shape "+cmd);
		}
	}
}
