package pr;

import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TreeSet<String> t=new TreeSet<String>(new MyComparator());
		t.add("pahul");
		t.add("ahul");
		System.out.println(t);
		
		

	}

}
