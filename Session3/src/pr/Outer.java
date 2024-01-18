 // 27-10-2023
package pr;

public class Outer
{
  private int no=100;
  protected class Inner
  {
	  int no=1000;
	  public void getNo()
	  {
		  int no=10;
		
		  System.out.println("Inner class no= " + this.no);
          System.out.println("Local no= " + no);
          System.out.println("Outer class no= " + Outer.this.no);
		  
	  }
  }
  public void get()
  {
	Inner i=new Inner();
	i.getNo();
  }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      Outer o=new Outer();
      o.get();
     
	}

}
