//  27-10-2023
package pr;

public class Outer1
{
	/*private int i=10;

	public void get()
	{
	  class Inner1
	  {
		  int no=111;
		  public void get()
		  {
			  System.out.println("No ="+no); 
	           

	     }
	  }
	  Inner1 i=new Inner1();
	  i.get();
	}*/
	private int i=100;
	private static int a=1;
	static class Inner
	{
		int no=111;
		public void get()
		{
			System.out.println("No = "+no);
			//System.out.println("i = "+i);
			System.out.println("a = "+a);
		}
	}

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 /*Outer1 o=new Outer1();
	      o.get();*/
		
		
		
		//Inner i=new Outer().new Inner();
		Outer1.Inner i=new Outer1.Inner();
		i.get();
		
	}
	
}
