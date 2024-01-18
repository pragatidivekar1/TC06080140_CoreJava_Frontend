//  27-10-2023
package pr;
//Anonymous inner class
public class Test2 extends A
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PopCorn p=new PopCorn()
				{
			public void taste()
			{
				System.out.println("Cheesy");
				}
	};
	p.taste();
				

	}

}
