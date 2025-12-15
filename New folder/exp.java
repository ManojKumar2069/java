import java.util.*;
class wrong_age_exception extends Exception{
	wrong_age_exception(String msg){
		super(msg);
	}
}
//Write a program that demonstrates handling of exceptions
//in inheritance tree. Create a base class called “Father” and
//derived class called “Son” which extends the base class. In
//Father class, implement a constructor which takes the age
//and throws the exception WrongAge( ) when the input
//age<0. In Son class, implement a constructor that uses both
//father and son’s age and throws an exception if son’s age is
//>=father’s age.
class father {
	int age;
	father(int a) throws wrong_age_exception{
		age=a;
		if(a<=0){
			throw new wrong_age_exception("Father age cannot be "+a);
		}
	}
}
class son extends father{
	int s_age;
	son(int f_a,int s_a)throws wrong_age_exception{
		super(f_a);
		if(s_a<=0){
			throw new wrong_age_exception("Sons age cannot be "+s_a);
		}
		else if(f_a<s_a){
			throw new wrong_age_exception("Sons age "+s_a+" cannot be geater than fathers age "+f_a);
		}
		else{
			System.out.println("Father age is "+f_a);
			System.out.println("Sons age is "+s_a);
		}
	}
}
public class exp {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int s,f;
		System.out.println("Enter fathers age ");
		f=sc.nextInt();
		System.out.println("Enter sons age ");
		s=sc.nextInt();
		try{
			new son(f,s);
		}
		catch(wrong_age_exception e){
			System.out.println(e.getMessage());
		}
	}
}
