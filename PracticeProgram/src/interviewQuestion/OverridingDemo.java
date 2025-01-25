package interviewQuestion;

abstract class Demo1
{
    protected abstract void display();
	
}

class Sample extends Demo1
{
	public void display()
	{
		System.out.println("Display inside sample");
		
	}
}

public class OverridingDemo {
	public static void main(String arg[])
	{
		Demo1 obj=new Sample();
		obj.display();
	}

}
