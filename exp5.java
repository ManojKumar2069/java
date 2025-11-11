import java.util.*;
interface calcu{
	void calcula(int a,int b,int c);
	void calcu1();	
	void prindata();
}
public class salary implements calcu
{
	double gross,basic,hra,cca,itax,nets;
		public void calcula(int a,int b,int c)
		{
			basic=a;
			hra=b;
			cca=c;
		}
		public void calcu1()
		{
			gross=basic+hra+cca;
			itax=gross-gross*0.1;
			nets=gross-itax;
		}
		public void prindata()
		{
			System.out.println("The gross salary is:- RS."+gross);
			System.out.println("The tax ammunt is:- RS."+itax);
			System.out.println("The net salary is:- RS."+nets);
		}
		public static void main(String args[])
		{
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a basic salary:- ");
			int a=sc.nextInt();
			System.out.println("enter the heir percentage:- ");
			int b=sc.nextInt();
			System.out.println("enter the cca amount:- ");
			int c=sc.nextInt();
			salary ob=new salary();
			ob.calcula(a,b,c);
			ob.calcu1();
			ob.prindata();
		}
}
	
