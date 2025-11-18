import java.util.*;
abstract class Father{
    int age;
    abstract void get_father_age(int age);
    //void print_age(){ 
        //System.out.println("The age of son is "+age);
    //}
    void wrong_age_f(int age){
	this.age=age;
	if(age<0){
		throw new ArithmeticException("Your son cannot be " +age+ " years old MC");
	}
	else
	{
		System.out.println("Your Father age is "+age);
	}
    }
	
}
class son extends Father{
    int age;
    void get_father_age(int age){
        super.age=age;
    }
    void get_son_age(int age){
	this.age=age;
    }
    //void print_age(){
	//System.out.println("Sons age is "+super.age);
	//}
	void check_age(int a,int b){
		this.age=a;
		super.age=b;
	if(a>=b){
		throw new ArithmeticException("The son cannot be older than his father");
	}
	else{
		System.out.println("Father age is "+super.age);
                System.out.println("Sons age is "+age);
	}
}
    void wrong_age_s(int age){
	this.age=age;
	if(age<0){
		throw new ArithmeticException("Your son cannot be " +age+ " years old MC");
	}
	else
	{
		System.out.println("Your Sons age is "+age);
	}
    }
}
class Main {
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
            son obj1=new son();
		System.out.println("Enter Sons age ");
		int a_s=sc.nextInt();
		System.out.println("Enter Fathers age ");
		int a_f=sc.nextInt();
            obj1.get_father_age(a_f);
	    obj1.wrong_age_f(a_f);
		obj1.wrong_age_s(a_s);
		obj1.get_son_age(a_s);
		obj1.check_age(a_s,a_f);
    }
}
