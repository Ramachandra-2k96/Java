package com.sangamone;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.sangamone.calci;

public class test_calci {

	public static void main(String[] args) throws FileNotFoundException {
		calci cli = new calci();
		File f1 =new File("Testcase1.txt");
		Scanner sc= new Scanner(f1);
		List<Integer>l1 =new ArrayList<>();
		List<Integer>l2 =new ArrayList<>();
		List<Integer>result =new ArrayList<>();
		String [] num;
		int j=1;
		while(sc.hasNextLine())
		{
			num =sc.nextLine().replace("\n","").split(",");
			l1.add(Integer.parseInt(num[0]));
			l2.add(Integer.parseInt(num[1]));
			result.add(Integer.parseInt(num[2]));
			j++;
		}
		for(int i=0;i<l1.size();i++)
		{
			int res = cli.add(l1.get(i),l2.get(i));
			if (res == result.get(i))
			{
				j--;
			}
		}
		if(j==1)
		{
			System.out.println("Addition complete and verified");
		}
		
		f1 =new File("Testcase2.txt");
		sc= new Scanner(f1);
		while(sc.hasNextLine())
		{
			num =sc.nextLine().replace("\n","").split(",");
			l1.add(Integer.parseInt(num[0]));
			l2.add(Integer.parseInt(num[1]));
			result.add(Integer.parseInt(num[2]));
			j++;
		}
		for(int i=0;i<l1.size();i++)
		{
			int res = cli.sub(l1.get(i),l2.get(i));
			if (res == result.get(i))
			{
				j--;
			}
		}
		if(j==1)
		{
			System.out.println("Subtraction complete and verified");
		}
		
		f1 =new File("Testcase3.txt");
		sc= new Scanner(f1);
		while(sc.hasNextLine())
		{
			num =sc.nextLine().replace("\n","").split(",");
			l1.add(Integer.parseInt(num[0]));
			l2.add(Integer.parseInt(num[1]));
			result.add(Integer.parseInt(num[2]));
			j++;
		}
		for(int i=0;i<l1.size();i++)
		{
			int res = cli.mul(l1.get(i),l2.get(i));
			if (res == result.get(i))
			{
				j--;
			}
		}
		if(j==1)
		{
			System.out.println("Multiplication complete and verified");
		}
		
		f1 =new File("Testcase4.txt");
		sc= new Scanner(f1);
		while(sc.hasNextLine())
		{
			num =sc.nextLine().replace("\n","").split(",");
			l1.add(Integer.parseInt(num[0]));
			l2.add(Integer.parseInt(num[1]));
			result.add(Integer.parseInt(num[2]));
			j++;
		}
		for(int i=0;i<l1.size();i++)
		{
			int res = cli.div(l1.get(i),l2.get(i));
			if (res == result.get(i))
			{
				j--;
			}
		}
		if(j==1)
		{
			System.out.println("Division complete and verified");
		}
		
	}

}
