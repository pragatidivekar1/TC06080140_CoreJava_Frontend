//21-12-2023
//ListIterator
package pr;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkedList<String> l=new LinkedList<String> ();
		l.add("Mayuri");
		l.add("Priyanaka");
		l.add("Aishwarya");
		l.add("kiran");
		l.add("Pratik");
		System.out.println(l);
		ListIterator<String> itr= l.listIterator();
		/*while(itr.hasNext())
		{
			String str=itr.next();
			if(str.equals("Mayuri"))
			{
				itr.set("Priyanaka");
			}
			if(str.equals("Aishwarya"))
			{
				itr.set("kiran");
			}
		}*/
		while(itr.hasPrevious())
		{
			String str=itr.previous();
			
			System.out.println(str);
		}
		

	}

}
