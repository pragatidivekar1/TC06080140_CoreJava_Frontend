//22-12-2023
package pr;

import java.util.LinkedList;
import java.io.Serializable;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add(10);
		l.add("Name");
		l.add(78);
		l.add(98);
		l.add(null);
		System.out.println(l);
		
		
		l.set(0, "Rahul");
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);
		
		l.addFirst(30);
		System.out.println(l);
		
		l.add(1,60);
		System.out.println(l);
		
		l.remove(0);
		System.out.println(l);

		
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);

	}

}
