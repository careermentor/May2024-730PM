package oops;

public class CallAbstractClass extends AbsClassDemo
{

	
	public void meth2() 
	{
	
		System.out.println("this is my credential");
		
	}

	
	
	public static void main(String[] args) {
	
		CallAbstractClass abc = new CallAbstractClass();
		abc.meth1();
		abc.meth2();
		
	}
	
	
	
}
