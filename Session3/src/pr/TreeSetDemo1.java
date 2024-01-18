//26-12-2023
package pr;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet();
		
		/*
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("M");
		System.out.println(t);
		//t.add(10);        //ClassCastException
		//t.add(null);      //NullPointerException
		 
		 */
		
		
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("A"));
		
		System.out.println(t);

	}

}
