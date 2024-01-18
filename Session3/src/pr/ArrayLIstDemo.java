
//21-12-2023

package pr;
import java.util.*;
public class ArrayLIstDemo {

	public static void main(String[] args)
	{
		 /*
		  * int no=10;
		    Integer i=new Integer(no);           //Boxing(Primitive to Wrapper)
		    int a=i.initValue();               //unboxing( Wrapper to Primitive)
		
		 */
		
		
    /*   int b=100;
         Integer m=b;              //Auto-Boxing
         int c=m;                  //Auto-unBoxing
       */
		
		
		/*
		List l=new ArrayList();
		l.add(10);
		l.add("ABC");
		l.add(10);
		l.add('a');
		l.add(null);
		System.out.println(l);
		*/
		
		//Generic
		List<Integer> l=new  ArrayList<Integer>();
		
		l.add(10);
		l.add(10);
		l.add(78);
		l.add(98);
		l.add(null);
		System.out.println(l);
		/*
		l.add(2,56);
		System.out.println(l);
		
		l.remove(1);
		System.out.println(l);
		
		
		System.out.println(l.contains(98));
		
		List l1=Collections.synchronizedList(l);*/
		
		
       
	}

}
