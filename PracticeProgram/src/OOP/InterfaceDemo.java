package OOP;

public interface InterfaceDemo {
	//default void xyz();
	public static void show()
	{
		System.out.println("show");
	}
	
	default void abc()
	{
		System.out.println("abc");
		System.out.println("Inside abc method");
	}

}
