class Thread2 extends Thread{
	public void run()
	{
		try{
			System.out.println("Thread 2 Starting");
			Thread.sleep(500);
			System.out.println("Thread 2 Ending");
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
	}
}
class Thread1 extends Thread{
	public void run(){
		try{
			System.out.println("Thread 1 Strating ");
			Thread2 t2=new Thread2();
			t2.start();
			t2.join();
			Thread.sleep(50);
			System.out.println("Thread 1 ending ");
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
	}
}
public class thread_p_1 {
	public static void main(String args[]){
		Thread1 t1=new Thread1();
		t1.start();
	}
}
