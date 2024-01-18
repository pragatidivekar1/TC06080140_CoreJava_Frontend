//25-10-2023
package pr;

public class B extends A
{
	B get()
	{
		return this;
	}
	void msg()
	{
		System.out.println("Hello World !!! ");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new B().get().msg();

	}

}
