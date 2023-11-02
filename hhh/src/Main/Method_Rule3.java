package Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Method_Rule3 
{
	public static Object rule3(List<String> list1) {
		List<String> used = new ArrayList<>();
		used=list1;
		Scanner sc1=new Scanner(System.in);
		String input1=sc1.nextLine();
		String temp1="";
		Boolean isdisqualified=false;
		int len1=used.size();
		
		for(int i=0; i<len1; i++) {
			temp1=used.get(i);
			if(input1.equals(temp1)) {
				System.out.println("Player is disqualified due to Rule3");
				isdisqualified=true;
			}
		}
		Object[] obj=new Object[2];
		obj[0]=isdisqualified;
		obj[1]=input1;
		return obj;	
	}
}
