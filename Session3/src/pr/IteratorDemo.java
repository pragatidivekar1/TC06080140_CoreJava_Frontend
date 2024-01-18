//21-12-2023
//Iterator
package pr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      List<Integer> l=new  ArrayList<Integer>();
		
		l.add(10);
		l.add(10);
		l.add(78);
		l.add(98);
		l.add(56);
		l.add(11);
		System.out.println(l);
		
		Iterator<Integer>i=l.iterator();
		while(i.hasNext())
		{
			int n=i.next();
			if(n%2==0)
			{
				System.out.println(n);
			}
			else
			{
				i.remove(); //but cannot prform i.add();i.set(),i.replace()
				
				
			}
		}
	}

}
