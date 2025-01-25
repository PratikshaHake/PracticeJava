package interviewQuestion;

public interface InterfaceDemo {
	//void display();
	
	public static void show()
	{
		System.out.println("show");
	}
	
	default void abc()
	{
		System.out.println("abc");
	}
}

