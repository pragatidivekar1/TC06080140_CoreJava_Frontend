
//20-12-2023

package pr;
import java.io.*;

public class Demo2 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		FileOutputStream fos=null;
		try
		{
			System.out.println("In try");
			fos=new FileOutputStream("d://abc.txt",true);
			//fos.write(97);
			String str="JSPM College";
			byte b[]=str.getBytes();
			fos.write(b);
			//System.out.println("Sucess");
			
		}
		catch(Exception e)
		{
			System.out.println("In catch");
			System.out.println(e);
		}
		finally
		{
			System.out.println("In Finally");
			fos.close();
		}

	}

}
