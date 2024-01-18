//26-12-2023
package pr;

import java.util.Comparator;

//public class MyComparator implements Comparator<Integer>
public class MyComparator implements Comparator<String>
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

/*
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}*/

	@Override
	public int compare(String i1, String i2) 
	{
		// TODO Auto-generated method stub
		/*if(i1<i2)
		    return +1;
		else if(i1>i2)
			return -1;
		else
		return 0;*/
		i1.compareTo(i2);
		return 0;
		
	}

}
