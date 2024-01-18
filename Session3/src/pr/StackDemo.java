//22-12-2023
//Stack
package pr;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Stack s=new Stack();
		
		s.push(10);
		s.push(20);
		s.push('A');
		s.push('B');
		
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.peek());
		System.out.println(s.search('A'));//if value not found it return -1
		System.out.println(s.search(20));
		s.pop();
		System.out.println(s);

	}

}
