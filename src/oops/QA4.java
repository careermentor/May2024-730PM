package oops;

public class QA4 extends QA2 implements QA3I
{


	
	public void div(float a, float b)
	{
		float c = a/b;
		System.out.println("division of a&b: " + c);
	}
	
	public static void main(String[] args) 
	{

		QA4 q4 = new QA4();
		q4.sum(30, 40);
		q4.sub(30, 40);
		//q4.mul(30, 40);
		q4.div(5, 2);  //2.5
		q4.qa3im();

	}


	public void qa3im() {
		
		System.out.println("this is QA3I method");
		
	}

}
