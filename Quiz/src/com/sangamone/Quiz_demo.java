package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Question
{
	private  String c;
	private  String a;
	public Question(String c,String a)
	{
		this.c =c;
		this.a =a;
	}
	public String[] get()
	{
		String[] set =new String[2];
		set[0]=c;
		set[1]=a;
		return set;
	}
}
public class Quiz_demo {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("Quiz_Capitals.csv");
		String [] words;
		int i=0;
		String s1,s2,input;
		int mark=10,total=0;
		s1="What is he capital of ";
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
		Collections.shuffle(myList);
		Collections.shuffle(myList);
		for(i=0;i<3;i++)
		{
			System.out.print(s1+myList.get(i).get()[0]+s2);
			input = sc1.nextLine();
			if(myList.get(i).get()[1].equalsIgnoreCase(input))
			{
				total=total+mark;
			}
			else {
				System.out.println("The correct Answer is : "+myList.get(i).get()[1]);
			}
		}
		System.out.println("\n\nYour score : "+total+"/"+i*mark);
	}

}
