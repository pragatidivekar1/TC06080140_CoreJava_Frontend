//26-10-23
//Garbage Collector
package pr;

public class GCDemo 
{
	public  void finalize() throws Throwable
	{
		super.finalize();
		System.out.println("Object Garbage  Collected ");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		GCDemo  g1 =new GCDemo();
		GCDemo  g2 =new  GCDemo();
		GCDemo  g3 =new  GCDemo();
		
		g1=null;
		g2=null;
		g3=null;
		
		
		System.gc();

	}

}
//mark,sweep or constract