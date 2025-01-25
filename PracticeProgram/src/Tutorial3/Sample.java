package Tutorial3;

public class Sample extends Demo{
	
	public Sample()
	{
		System.out.println("Default ");
	}
	
	public Sample(int a)
	{
		this();
		System.out.println("parameterised");
	}
	public static void main(String[] args) {
		Sample obj=new Sample(10);
	}

}
