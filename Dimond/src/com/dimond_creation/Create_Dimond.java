package com.dimond_creation;

public class Create_Dimond {
	public static void Left(String word) {
		for(int i=0;i<=word.length();i++)
		{
			String s1=word.substring(0,i);
			System.out.println(s1);
		}
		for(int i=word.length()-1;i>=0;i--)
		{
			String s1=word.substring(0,i);
			System.out.println(s1);
		}
	}
	public static void Right(String word) {
		for(int i=1;i<=word.length();i++)
		{
			String s1=word.substring(0,i);
			for(int j=0;j<word.length()-i;j++)
			{
				System.out.print(" ");
			}
			System.out.print(s1);
			System.out.println();
		}
		for(int i=word.length()-1;i>=1;i--)
		{
			String s1=word.substring(0,i);
			for(int j=0;j<word.length()-i;j++)
			{
				System.out.print(" ");
			}
			System.out.print(s1);
			System.out.println();
		}
	}
	public static void Complete(String word) {
		int len =word.length();
		int len2 =word.length()/2;
		for(int i=0;i<len2+1;i++)
		{
			String s1=word.substring(0,len-2*(len2-i));
			for(int j=0;j<len2-i;j++)
			{
				System.out.print(" ");
			}
			System.out.print(s1);
			System.out.println();
		}
		for(int i=len2-1;i>=0;i--)
		{
			String s1=word.substring(0,len-2*(len2-i));
			for(int j=0;j<len2-i;j++)
			{
				System.out.print(" ");
			}
			System.out.print(s1);
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
//		Left("FUNWITHPROGRAMMING");
//		Right("FUNWITHPROGRAMMING");
		Complete("FUNWITHPROGRAMMING");
	}

}
