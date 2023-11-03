package Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Method_Rule3 
{
	public static Object rule3(List<String> list1) {
		List<String> used = new ArrayList<>();
		used=list1;
		Scanner sc1=new Scanner(System.in);
		Long start_time =System.nanoTime();
		String input1=sc1.nextLine();
		Long end_time =System.nanoTime() - start_time;
		
		long seconds = TimeUnit.NANOSECONDS.toSeconds(end_time);
		String temp1="";
		int timeout = 30;
		Boolean isdisqualified=false;
		int len1=used.size();
		if(seconds > timeout )
		{
			System.out.println("Player is disqualified due to Timelimit");
			isdisqualified=true;
		}
		else {
		for(int i=0; i<len1; i++) {
			temp1=used.get(i);
			if(input1.equals(temp1)) {
				System.out.println("Player is disqualified due to Rule3");
				isdisqualified=true;
			}
		}
		}
		Object[] obj=new Object[2];
		obj[0]=isdisqualified;
		obj[1]=input1;
		return obj;	
	
	}
}
