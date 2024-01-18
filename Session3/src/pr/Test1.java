//28-12-2023
package pr;

public class Test1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*System.out.println(Thread.currentThread().getName());//main
		System.out.println(Thread.currentThread().getThreadGroup().getName());//main
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());//system

		ThreadGroup g1=new ThreadGroup("First Group ");
		System.out.println(g1.getParent().getName());//main
		
		ThreadGroup g2=new ThreadGroup("Second Group ");
		System.out.println(g2.getParent().getName());//FirstGroup
		*/
		ThreadGroup g1=new ThreadGroup("tg ");
		Thread t1=new Thread(g1,"First Group ");
		Thread t2=new Thread(g1,"Second Group ");
		Thread t3=new Thread(g1,"Third Group ");
		System.out.println();
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
	}

}
