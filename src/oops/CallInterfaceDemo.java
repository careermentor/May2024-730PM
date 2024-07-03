package oops;

public class CallInterfaceDemo implements InterfaceDemo
{

	
	public void meth3() {
	
		System.out.println("this is method3");
	}

	
	public void meth4() {
	
		System.out.println("this is method3");
	}

	
	public static void main(String[] args) {
		CallInterfaceDemo cfd = new CallInterfaceDemo();
		cfd.meth3();
		cfd.meth4();
	}
	
}
