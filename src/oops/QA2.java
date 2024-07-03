package oops;

public class QA2 extends QA1
{

	int x = 2000;
	public void callsum()
	{
		int x = 1000;
		System.out.println(x);  //1000
		
		//System.out.println(super.x);  //100
		
		super.sum(30, 40);
	}
	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of a&b: " + c);
	}
	
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("substraction of a&b: " + c);
	}
	
	public static void main(String[] args) 
	{

		QA2 q2 = new QA2();
		q2.sub(30, 40);
		q2.sum(50, 60);
		
	
		q2.callsum();

	}



	public void qa1im() {
		System.out.println("this is QA1I Method");
		
	}

}
