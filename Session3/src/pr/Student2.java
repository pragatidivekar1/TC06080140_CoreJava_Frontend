//22-12-2023
package pr;
import java.io.Serializable;

public class Student2 implements Serializable
{
	private int rollNo;
	private String name;
	private transient float fees;
	
	public Student2() {}
	
	public Student2(int rollNo,String name,float fees) 
	{
		super();
		this.rollNo=rollNo;
		this.name=name;
		this.fees=fees;
	}
	@Override
	public String toString() {
		return "Student2 [rollNo=" + rollNo + ", name=" + name + ", fees=" + fees + "]";
	}
public static void main(String[] args )throws CloneNotSupportedException
{
	Student2 s=new Student2(2,"Aishwarya",1200.89f);
	Student2 s1=(Student2)s.clone();
	System.out.println(s1);
}
	

	
}
