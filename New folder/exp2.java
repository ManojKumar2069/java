import java.util.*;
class Student
{
	String name,usn;
	int[] marks;
	int[] credit;
	int n;
	Scanner sc=new Scanner(System.in);
	public void get_details()
	{
		System.out.println("Enter the name of studnet ");
		name=sc.nextLine();
		System.out.println("Enter the usn of "+name);
		usn=sc.nextLine();
		System.out.println("How many subjects ");
		n=sc.nextInt();
		marks=new int[n];
		credit=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the marks of "+(i+1)+" subject ");
			marks[i]=sc.nextInt();
			System.out.println("Enter the credit of "+(i+1)+" Subject");
			credit[i]=sc.nextInt();
		}
	}
	public void calcu()
	{
		double total_marks = 0;double total_grade=0,sum1=0;
		for(int i=0;i<n;i++)
		{
			total_marks+=marks[i];
			total_grade+=credit[i];
			double sum=marks[i]*credit[i];
			sum1+=sum;
		}
		System.out.println("The total marks is "+total_marks);
		System.out.println("The total grade is "+total_grade);
		double cgpa=sum1/(total_grade*10);
		System.out.println("The sum1 "+sum1);
		System.out.println("The total cgpa is "+cgpa);
	}
	public void display()
	{
		System.out.println("Name of student "+name);
		System.out.println("The usn of studnet "+usn);
		for(int i=0;i<n;i++)
		{
			System.out.println("Marks of student "+marks[i]);
			System.out.println("Credit of student "+credit[i]);
		}
	}
}
public class exp2
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.get_details();
		s.display();
		s.calcu();
	}
}