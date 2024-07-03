package demoPkg;

public class FirstClass 
{
	
	int a = 10;
	float b = 10.5f;
	char c = 'X';
	String d = "java";
	boolean e = true;
	
	
	public void printValues()
	{
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}
	
	
	
	public static void main(String[] args) 
	{
		FirstClass abc = new FirstClass();
		abc.printValues();
		

	}
	
	
	

}