//22-12-2023
//Enumeration:-Modify List
package pr;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();
		System.out.println("Capacity "+v.capacity());
		for(int i=1;i<=11;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		System.out.println(v.size());
		System.out.println("Capacity "+v.capacity());
		
		//Enumeration
		Enumeration<Integer> e=v.elements();
		
		while(e.hasMoreElements())
		{
			int i=e.nextElement();
			if(i%2==0)
			{
				System.out.println(i);	
			}
			/*else
			{
			   e.remove();
				v.remove(i); //we cannot use this
			}*/
		}
		
		System.out.println(v);

		


	}

}
