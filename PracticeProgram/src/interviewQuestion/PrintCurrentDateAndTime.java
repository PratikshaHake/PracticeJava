package interviewQuestion;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintCurrentDateAndTime {
	public static void main(String arg[])
	{
		System.out.println(new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss").format(new Date()));
	}

}
