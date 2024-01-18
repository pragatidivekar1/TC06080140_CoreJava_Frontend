//22-12-2023
//persisting state of an object is called serialization
package pr;
import java.io.Serializable;

public class Student1 implements Serializable
{
	private int rollNo;
	private String name;
	private transient float fees;
	
	public Student1() {}
	
	public Student1(int rollNo,String name,float fees) 
	{
		super();
		this.rollNo=rollNo;
		this.name=name;
		this.fees=fees;
	}
	@Override
	public String toString() {
		return "Student1 [rollNo=" + rollNo + ", name=" + name + ", fees=" + fees + "]";
	}

	

	
}
