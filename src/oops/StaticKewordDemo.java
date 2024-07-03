package oops;

public class StaticKewordDemo 
{

	static int a = 30;
	
	public static void printval()
	{
		
		
		System.out.println("value of a: " + a);
	}
	
	public void meth2()
	{
		System.out.println("this is method2");
	}
	
	public static void main(String[] args) 
	{
	
		StaticKewordDemo skd = new StaticKewordDemo();
		skd.meth2();
		
		StaticKewordDemo.printval();
		
	}
	
}
