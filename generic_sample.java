class Employee <T,R>
{
	T emp_name;
	R emp_no;
	Employee(T e,R e_no)
	{
		emp_name=e;
		emp_no=e_no;
	}
	void print_details()
	{
		System.out.println("The name of employee "+emp_name);
		System.out.println("The emp_no of employee "+emp_name+"is: "+emp_no);
	}
}
class Student <A,E>
{
	A student_name;
	E student_usn;
	Student(A s_n,E s_u)
	{
		student_name=s_n;
		student_usn=s_u;
	}
	void print_details()
	{
		System.out.println("The name of student is "+student_name);
		System.out.println("The student USN is: "+student_usn);
	}
}
class Main
{
	public static void main(String args[])
	{
		Employee<String,Integer> obj1=new Employee<String,Integer>("Manoj",1523);
		obj1.print_details();
		Student<String,Integer> obj2=new Student<String,Integer>("mks",31);
		obj2.print_details();
	}
} 
