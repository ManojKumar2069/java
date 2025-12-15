	//An abstract class Employee with abstract method calculatePay()
	//An interface IncentiveEligible
	//Classes:
	//Developer
	//TeamLead
	//ProjectManager
	//Conditions:
	//Developer gets 8% incentive if bugs resolved > 100
	//TeamLead gets ₹7000 incentive if at least one Developer qualifies
	//ProjectManager gets ₹15,000 incentive if at least one TeamLead qualifies
	//Implement multi-level inheritance + interface
	abstract class Employee
	{
		abstract void calculatepay();
	}
	interface IncentiveEligible
	{
		public boolean checkIncentive();
	}
	class Developer extends Employee implements IncentiveEligible
	{
		String name,emp_id;
		int bug_r;
		double incentive=0.08;
		double salary=15000;
		boolean incen_el=false;
		public void get_Developer(String n,String e,int b)
		{
			name=n;
			emp_id=e;
			bug_r=b;
		}
		public boolean checkIncentive()
		{
			if(bug_r>100)
			{
				incen_el=true;
			}
			return 	incen_el;
		}
		void calculatepay()
		{
			if(incen_el==true)
			{
				System.out.println("You have resolved "+bug_r);
				System.out.println("You get an incentive of 8% and the amount is "+salary*incentive);
				salary+=salary*incentive;
				System.out.println("Your salary is "+salary);
			}
			else{
				System.out.println("Your salary is "+salary);
			}
		}
	}
	class TeamLead extends Employee implements IncentiveEligible
	{
	
		String t_name,t_emp_id;
		int incen=7000,salary_t=50000;
		boolean t_incen_el=false;
		Developer developer;
		public void get_team(String n,String e,Developer d)
		{
			t_name=n;
			t_emp_id=e;
			developer=d;
		}
		public boolean checkIncentive(){
			if(developer.checkIncentive())
			{
				t_incen_el=true;
			}
			return t_incen_el;
		}
		public void calculatepay()
		{
			if(t_incen_el==true)
			{
				salary_t+=incen;
				System.out.println("one of the employee has achived his incentive \n so you get an incentive of "+incen);
				System.out.println("new salary is "+salary_t);
			}
			else{
				System.out.println("salary of team lead "+salary_t);
			}
		}
	}
	class Project_m extends Employee implements IncentiveEligible
	{
		String name,emp_id;
		int incen_p=15000;
		int salary_p=80000;
		boolean p_incentive_el=false;
		TeamLead t;
		public void get_p(String n,String e,TeamLead t){
			name=n;
			emp_id=e;
			this.t=t;
		}
		public boolean checkIncentive()
		{
			if(t.checkIncentive())
			{
				p_incentive_el=true;
			}
			return p_incentive_el;
		}
		public void calculatepay()
		{
			if(p_incentive_el==true)
			{
				salary_p+=incen_p;
				System.out.println("You team leader has achived his goal \n so you get an incentive of rs "+incen_p);
				System.out.println("New salary "+salary_p);
			}
			else{
				System.out.println("salary of proect manager"+salary_p);
			}
		}
	}
	public class prog_ {
		public static void main(String args[])
		{
			Developer d=new Developer();
			TeamLead t=new TeamLead();
			Project_m p=new Project_m();
			d.get_Developer("mks", "mks123", 1000);
			d.checkIncentive();
			d.calculatepay();
			t.get_team("mks", "mks123",d);
			t.checkIncentive();
			t.calculatepay();
			p.get_p("mks", "mk23", t);
			p.checkIncentive();
			p.calculatepay();
			
		}
	}
