package pr;

import java.util.HashSet;
//26-12-2023
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedHashSet h=new LinkedHashSet();  //LinkedList+HashTable
		h.add(10);
		h.add("A");
		h.add(2);
		h.add(10.2f);
		h.add(null);
		System.out.println(h.add(2));
		System.out.println(h);

	}

}
