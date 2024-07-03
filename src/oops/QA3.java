package oops;

public class QA3 extends QA1
{

	
	public void mul(int a, int b)
	{
		int c = a*b;
		System.out.println("multiplication of a&b: " + c);
	}
	
	public static void main(String[] args) 
	{

		QA3 q3 = new QA3();
		q3.sum(30, 40);
		//q3.sub(30, 40);
		q3.mul(30, 40);

	}
}
