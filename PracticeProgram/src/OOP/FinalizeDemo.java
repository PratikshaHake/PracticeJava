package OOP;

public class FinalizeDemo {
	
 
	public void abc()
	{
		System.out.println("abc method");
	}
	
	public void finalize()
	{
		System.out.println("finalize method");
	}
	
	public static void main(String[] args) {
		FinalizeDemo obj=new FinalizeDemo();
		obj=null;
		System.gc();
	}

}
