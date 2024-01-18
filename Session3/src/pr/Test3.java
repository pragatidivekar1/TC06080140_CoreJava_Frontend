//22-12-2023
//Serializable
package pr;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test3 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("d://mhe.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Student1 s=new Student1(1,"Rahul",1000.89f);
		 
		oos.writeObject(s);
		System.out.println("Sucess");
		oos.close();
		fos.close();

	}

}
