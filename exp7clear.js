import java.util.*;
class WrongAgeException extends Exception{
	WrongAgeException(String msg){
		super(msg);
	}
}

class Father {
	int age;
	Father(int age) throws WrongAgeException{
		this.age=age;
		if(age<0){
			throw new WrongAgeException("Father age cannot be negative");
		}
	}
}
class Son extends Father{
	int s_age;
	Son(int f_age,int s_age)throws WrongAgeException{
		super(f_age);
		this.s_age=s_age;
		if(s_age<0){
			throw new WrongAgeException("Sons age cannot be negative");
		}
		else if(s_age>=f_age){
			throw new WrongAgeException("Fathers age "+f_age+" Cannot be greater than sons age" +s_age);
		}
		else{
			System.out.println("Fathers age is "+f_age);
			System.out.println("Sons age is "+s_age);
		}
	}
}

class Main1
{
	public static void main(String args[]){
		try{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter sons age ");
		int a=sc.nextInt();
		System.out.println("Enter Fathers age ");
		int b=sc.nextInt();
		Son obj1=new Son(b,a);
		}
		catch(WrongAgeException e){
			System.out.println(e.getMessage());
		}
	}
}

