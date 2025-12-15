package cie;
import java.util.*;
public class internal extends personal {
	public String name,usn;
	public int sem,subjects;
	public int[] marks_i;
	public void get_in(int sub){
		this.subjects=sub;
		marks_i=new int[sub];
		for(int i=0;i<sub;i++){
			Scanner sc=new Scanner(System.in);
			int m1;
			System.out.println("Enter the marks of "+(i+1)+" Subject");
			m1=sc.nextInt();
			marks_i[i]=m1;
		}
	}
	public void get_marks(){
		for(int i=0;i<subjects;i++)
		{
			System.out.println("The internal mark of subject "+(i+1)+" is "+marks_i[i]);
		}
	}
}
