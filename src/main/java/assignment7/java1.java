package assignment7;

public class java1 {
	public String reverse(String name)
	{
		System.out.println("Method Reversr Activated");
		String Name=new StringBuilder(name).reverse().toString();
		return "Revers String="+Name;		
	}
}
