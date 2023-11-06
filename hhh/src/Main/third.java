package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class third {
	public static int j=0,scount=0,lcount=0;
	public static void Servivors(int scount,List<String> name,List<Integer> age,List<String> gender,List<Boolean> has_survived)
	{
		System.out.println(" There are total "+scount+" survivers");
		System.out.println(" The survivers are :\n");
		System.out.println(" Childrens age<10 :\n");
		for(int i=0;i<name.size();i++)
		{
			if(has_survived.get(i)&& age.get(i)<10)
			{
				System.out.println(name.get(i) +"\t"+ String.valueOf(age.get(i))+"\t"+gender.get(i));
			}
		}
		System.out.println("\n Womens :\n");
		for(int i=0;i<name.size();i++)
		{
			if(has_survived.get(i)&&gender.get(i).equals("female")&&age.get(i)>=10)
			{
				System.out.println(name.get(i) +"\t"+ String.valueOf(age.get(i))+"\t"+gender.get(i));
			}
		}
		System.out.println("\n Mens :\n");
		for(int i=0;i<name.size();i++)
		{
			if(has_survived.get(i)&&gender.get(i).equals("male")&&age.get(i)>=10)
			{
				System.out.println(name.get(i) +"\t"+ String.valueOf(age.get(i))+"\t"+gender.get(i));
			}	
		}
	}
	
	
	public static void Non_Servivors(int lcount,List<String> name,List<Integer> age,List<String> gender,List<Boolean> has_survived)
	{
		System.out.println(" There are total "+lcount+" Loss ");
		System.out.println(" The Non-survivers are :\n");
		System.out.println(" Childrens age<10 :\n");
		for(int i=0;i<name.size();i++)
		{
			if(has_survived.get(i)&& age.get(i)<10)
			{
				System.out.println(name.get(i) +"\t"+ String.valueOf(age.get(i))+"\t"+gender.get(i));
			}
			
		}
		System.out.println(" Womens :\n");
		for(int i=0;i<name.size();i++)
		{
			if(has_survived.get(i)&&gender.get(i).equals("female")&& age.get(i)>=10)
			{
				System.out.println(name.get(i) +"\t"+ String.valueOf(age.get(i))+"\t"+gender.get(i));
			}
		}
		System.out.println(" Mens :\n");
		for(int i=0;i<name.size();i++)
		{
			if(has_survived.get(i)&&gender.get(i).equals("male")&& age.get(i)>=10)
			{
				System.out.println(name.get(i) +"\t"+ String.valueOf(age.get(i))+"\t"+gender.get(i));
			}
			
		}
	}
	
	public static void file_set_up(File f1, List<String> name, List<Integer> age, List<Boolean> has_survived, List<String> gender) throws FileNotFoundException
	{
		String list1[] ;
		Scanner sc= new Scanner(f1);
		System.out.println(sc.nextLine());
		while (sc.hasNextLine()) 
		{
	        list1 = sc.nextLine().split(",");
	        name.add(list1[4]);
	        if(!list1[6].equals(""))
	        {
	        	age.add((int)Math.round(Double.parseDouble(list1[6])));
	        }
	        else {
	        	age.add(30);
	        }
	        gender.add(list1[5]);
	        has_survived.add("1".equals(list1[1]));
	        if(has_survived.get(j))
	        {
	        	scount++;
	        }else {
	        	lcount++;
	        }
	        j++;
		}
	}
	public static void main(String args[]) throws FileNotFoundException{
		File f1= new File("titanic.csv");
		List<String> name = new ArrayList<>();
		List<Integer> age = new ArrayList<>();
		List<String> gender = new ArrayList<>();
		List<Boolean> has_survived = new ArrayList<>();
		
		file_set_up(f1,name,age,has_survived,gender);
		Servivors(scount,name,age,gender,has_survived);
		Non_Servivors(lcount,name,age,gender,has_survived);
	}
}
