//26-10-23
//Enum
package pr;

public class EnumDemo
{
	/*public enum Seasons{SUMMER,WINTER,AUTUMN,RAINY};

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Seasons s=Seasons.SUMMER;
		System.out.println(s);
		
		for (Seasons s1:Seasons.values())
		{
			System.out.println(s1+" "+s1.ordinal());
		}

	}*/
	
	public enum Coffee{ SMALL(45),MEDIUM(60),LARGE(90);
	int price;
	Coffee(int price)
	{
		this.price=price;
		
	}
	public int getPrice()
	{
		return price;
	}
	
	};
	public static void main(String[] args)
	{
		Coffee c=Coffee.MEDIUM;
		System.out.println(c+" Rs. "+c.getPrice());
	}
	

}
