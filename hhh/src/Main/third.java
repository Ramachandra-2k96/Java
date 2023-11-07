package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class third {
	static List<String> male = new ArrayList<>();
	static List<String> female = new ArrayList<>();
	static List<String> children = new ArrayList<>();
	public static void Survivors(List<String> name,List<Integer> age,List<String> gender,List<Boolean> has_survived)
	{
		for(int i=0;i<name.size();i++)
		{
			if(has_survived.get(i)&& age.get(i)<10)
			{
				children.add(name.get(i) +"\t"+ String.valueOf(age.get(i))+"\t"+gender.get(i));
			}
		}
		for(int i=0;i<name.size();i++)
		{
			if(has_survived.get(i)&&gender.get(i).equals("female")&&age.get(i)>=10)
			{
				female.add(name.get(i) +"\t"+ String.valueOf(age.get(i))+"\t"+gender.get(i));
			}
		}
		for(int i=0;i<name.size();i++)
		{
			if(has_survived.get(i)&&gender.get(i).equals("male")&&age.get(i)>=10)
			{
				male.add(name.get(i) +"\t"+ String.valueOf(age.get(i))+"\t"+gender.get(i));
			}	
		}
	}
		
	public static void Non_Survivors(List<String> name,List<Integer> age,List<String> gender,List<Boolean> has_survived)
	{
		for(int i=0;i<name.size();i++)
		{
			if(!has_survived.get(i)&& age.get(i)<10)
			{
				children.add(name.get(i) +"\t"+ String.valueOf(age.get(i))+"\t"+gender.get(i));
			}
			
		}
		for(int i=0;i<name.size();i++)
		{
			if(!has_survived.get(i)&&gender.get(i).equals("female")&& age.get(i)>=10)
			{
				female.add(name.get(i) +"\t"+ String.valueOf(age.get(i))+"\t"+gender.get(i));
			}
		}
		for(int i=0;i<name.size();i++)
		{
			if(!has_survived.get(i)&&gender.get(i).equals("male")&& age.get(i)>=10)
			{
				male.add(name.get(i) +"\t"+ String.valueOf(age.get(i))+"\t"+gender.get(i));
			}
		}
	}
	
	public static void file_set_up(File f1, List<String> name, List<Integer> age, List<Boolean> has_survived, List<String> gender) throws FileNotFoundException
	{
		String list1[] ;
		Scanner sc= new Scanner(f1);
		sc.nextLine();
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
	        
		}
	}
	
	public static void main(String args[]) throws FileNotFoundException{
		File f1= new File("titanic.csv");
		List<String> name = new ArrayList<>();
		List<Integer> age = new ArrayList<>();
		List<String> gender = new ArrayList<>();
		List<Boolean> has_survived = new ArrayList<>();
		
		
		file_set_up(f1,name,age,has_survived,gender);
		Survivors(name,age,gender,has_survived);
		System.out.println("Total Survivors : "+(male.size()+female.size()+children.size()));
		System.out.println("Childrens :"+children.size()+"\nMale :"+male.size()+"\nFemale : "+female.size());
		male.clear();
		female.clear();
		children.clear();
		Non_Survivors(name,age,gender,has_survived);
		System.out.println("\nTotal Non-Survivors : "+(male.size()+female.size()+children.size()));
		System.out.println("Childrens :"+children.size()+"\nMale :"+male.size()+"\nFemale : "+female.size());
	}
}
