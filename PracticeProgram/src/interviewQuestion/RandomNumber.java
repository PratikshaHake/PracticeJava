package interviewQuestion;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		
		Random r=new Random();
		int start=200;
		int end=300;
		int a=r.nextInt(end-start)+start;
		System.out.println(a);
	}

}
