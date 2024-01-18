//22-12-2023
//DeSerializable
package pr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test4 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		// TODO Auto-generated method stub
		ObjectInputStream ois=new ObjectInputStream (new FileInputStream("d://mhe.txt"));
		Student1 s=(Student1)ois.readObject();
		System.out.println(s);
		

	}
}
