package demoPkg;

public class CalCulations 
{

	String name = "Java";
	
	
	public int addition()
	{
		final int a = 20;  //constant
		//a=50;
		
		int b = 30;
		int c = a+b;
		
		//System.out.println(c + 100);
		
		System.out.println("this is sum of 2 numbers: " + c);
		
		return c;
	}
	
	public int sum(int a, int b)
	{
		int c = a+b;
		System.out.println("sum of a&b: " + c);
		return c;
	}
	
	//30+40+50
	
	public CalCulations()  //constructor will not return a value
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println("this sum of a&b using constructor: " + c);
		
	}
	
	public CalCulations(int a, int b)
	{
		int c = a+b;
		System.out.println("this sum of a&b using constructor: " + c);
		
	}
	
	public static void main(String[] args) {
		
		CalCulations cal = new CalCulations();  
		//constructor will be automatically called when you create a object of the class
		
		CalCulations cal1 = new CalCulations(80,100);
		
		int x = cal1.addition();
		
		int d = cal.sum(30, 40);
		cal.sum(d, x);
		
		System.out.println(cal.name);
		
		
		
	}
	
}
