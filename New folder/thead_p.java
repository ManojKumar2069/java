//Write a program which creates two threads, one thread
//displaying “BMS College of Engineering” once every ten
//seconds and another displaying “CSE” once every two
//seconds.
class dept extends Thread{
	public void run(){
		while(true){
		try{
			System.out.println("CSE");
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		}
	}
}
class clg extends Thread
{
	public void run(){
		while(true){
		try{
			System.out.println("BMS COLLAGE OF ENGG.....");
			dept d=new dept();
			d.start();
			Thread.sleep(10000);
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		}
	}
}
public class thead_p {
	public static void main(String args[]){
		clg c=new clg();
		c.start();
	}
}
