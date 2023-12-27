package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Question
{
	private  String part1;
	private  String part2;
	public Question(String part1,String part2)
	{
		this.part1 =part1;
		this.part2 =part2;
	}
	public String[] get()
	{
		String[] parts =new String[2];
		parts[0]=part1;
		parts[1]=part2;
		return parts;
	}
}
class File_details
{
	private String name,Question;
	public File_details(String name,String Question)
	{
		this.name = name;
		this.Question = Question;
	}
	public String[]get()
	{
		String [] details =new String[2];
		details[0]=name;
		details[1]=Question;
		return details;
	}
}

public class Quiz_demo {
	public static void start_Quiz( String file,int limit,String s1)throws FileNotFoundException
	{
		File f = new File(file);
		String [] words;
		int i=0;
		String s2,input;
		int mark=10,total=0;
		s2="?";
		Scanner sc= new Scanner(f);
		Scanner sc1= new Scanner(System.in);
		List<Question> myList = new ArrayList<>();
		sc.nextLine();
		while(sc.hasNextLine())
		{
			words =sc.nextLine().split(",");
			myList.add(new Question(words[0],words[1]));
		}
		Collections.shuffle(myList);
		for(i=0;i<3;i++)
		{
			System.out.print(s1+myList.get(i).get()[0]+s2);
			input = sc1.nextLine();
			if(myList.get(i).get()[1].equalsIgnoreCase(input))
			{
				total=total+mark;
			}
		}
		System.out.println("\n\nYour score : "+total+"/"+i*mark);
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		List<File_details>files =new ArrayList<>();
		File f =new File("quiz.txt");
		String [] arr;
		int limit=3;
		int choice;
		Scanner sc= new Scanner(f);
		while(sc.hasNextLine())
		{
			arr=sc.nextLine().split(",");
			files.add(new File_details(arr[0],arr[1]));
		}
		sc= new Scanner(System.in);
		System.out.println(" Enter you choice :");
		for(int i=0;i<files.size();i++)
		{
			System.out.println((i+1)+" : "+files.get(i).get()[0]);
		}
		choice =sc.nextInt();
		System.out.println(" You have selected "+files.get(choice-1).get()[0]);
		switch(choice)
		{
			case 1:
				start_Quiz("Quiz_"+files.get(choice-1).get()[0]+".csv",limit,files.get(choice-1).get()[1]);break;
			case 2:
				start_Quiz("Quiz_"+files.get(choice-1).get()[0]+".csv",limit,files.get(choice-1).get()[1]);break;
			case 3:
				start_Quiz("Quiz_"+files.get(choice-1).get()[0]+".csv",limit,files.get(choice-1).get()[1]);break;
			case 4:
				start_Quiz("Quiz_"+files.get(choice-1).get()[0]+".csv",limit,files.get(choice-1).get()[1]);break;
			default:System.out.println(" Invalid choice ");
		}
	}

}
