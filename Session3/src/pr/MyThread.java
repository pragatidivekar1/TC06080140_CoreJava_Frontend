//28-12-2023
package pr;

public class MyThread extends Thread
{

	 public void run()
	 {
		 System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId()+" "+Thread.currentThread().getPriority());
	 }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println();

	}

}
