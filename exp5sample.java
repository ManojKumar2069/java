import java.util.*;
interface calcu{
	void calcula(double a,double b,double c);
	void calcu1();	
	void prindata();
}
class gross implements calcu
{
	double gross,basic,hra,cca,itax,nets;
		public void calcula(double a,double b,double c){
			basic=b;
			hra=b;
			cca=c;
		}
		public void calcu1(){
			gross=basic+basic+basic*0.25+cca;
		}
		public void prindata(){
			System.out.println("The gross salary= "+gross);
		}
}
class itax implements calcu
{
	double gross,basic,hra,cca,itax,nets;
		public void calcula(double a,double b,double c){
			basic=b;
			hra=b;
			cca=c;
		}
		public void calcu1(){
			itax=gross-gross*0.1;
		}
		public void prindata(){
			System.out.println("The gross salary= "+itax);
		}
}
class nets implements calcu
{
	double gross,basic,hra,cca,itax,nets;
		public void calcula(double a,double b,double c){
			basic=b;
			hra=b;
			cca=c;
		}
		public void calcu1(){
			itax=gross-itax;
		}
		public void prindata(){
			System.out.println("The gross salary= "+itax);
		}
}
public class Main{

		public static void main(String args[])
		{			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a basic salary:- ");
			int a=sc.nextInt();
			System.out.println("enter the heir percentage:- ");
			int b=sc.nextInt();
			System.out.println("enter the cca amount:- ");
			int c=sc.nextInt();
			calcu ca;
			ca=new gross();
			ca.calcula(a,b,c);
			ca.calcu1();
			ca.prindata();
			ca=new itax();
			ca.calcula(a,b,c);
			ca.calcu1();
			ca.prindata();			
			ca=new nets();
			ca.calcula(a,b,c);
			ca.calcu1();
			ca.prindata();
		}
}
	
