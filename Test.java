class Example_Of_Static
{
	int x; // Instant member variable
	static int y; // Static member variable


	public void fun1() // Instant member function
	{
	
	}

	public static void fun2() // Static member fun
	{
	System.out.println("Hi");
	}
	
}

public class Test
{
	public static void main(String[] args)
	{
	Example_Of_Static Ex1 = new Example_Of_Static();
	Example_Of_Static.fun2();
	}
	
}

