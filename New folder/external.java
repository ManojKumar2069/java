package see;
import cie.*;
import java.util.*;
public class external extends personal{
	public int[] marks_e;
	public int subjects;
	public void get_external(int sub){
		subjects=sub;
		marks_e=new int[sub];
		for(int i=0;i<sub;i++)
		{
			int m1;
			System.out.println("enetr the marks of "+(i+1)+" external");
			Scanner sc=new Scanner(System.in);
			m1=sc.nextInt();
			marks_e[i]=m1;
		}
	}
	public void get_ex_marks(){
		for(int i=0;i<subjects;i++){
			System.out.println("The marks of "+(i+1)+" is "+marks_e[i]);
		}
	}
}
