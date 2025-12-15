import cie.*;
import see.*;
import java.util.*;
public class pack {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of stuent");
		String name=sc.nextLine();
		System.out.println("Enter the usn of "+name+" student");
		String usn=sc.nextLine();
		System.out.println("enter the current semster of "+name);
		int sem=sc.nextInt();
		System.out.println("Enter the no of subjects in "+sem);
		int sub=sc.nextInt();
		personal p=new personal();
		internal i=new internal();
		external e=new external();
		p.get_d(name,usn,sem,sub);
		i.get_in(sub);
		e.get_external(sub);
		i.get_marks();
		e.get_ex_marks();
		
	}
}
