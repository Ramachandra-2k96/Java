package Main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Permutation {
	public static List<String> perm9(String word9) {
		String input1 = "";
		String s1, s2;
		List<String> result = new ArrayList<>();
		List<String> list4 = new ArrayList<>();
		input1 = word9;
		s1 = input1.substring(0, 1);
		s2 = input1.substring(1, 9);
		result = perm8(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		s1 = input1.substring(1, 2);
		s2 = input1.substring(0, 1) + input1.substring(2, 9);
		result = perm8(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}

		s1 = input1.substring(2, 3);
		s2 = input1.substring(0, 2) + input1.substring(3, 9);
		result = perm8(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}

		s1 = input1.substring(3, 4);
		s2 = input1.substring(0, 3) + input1.substring(4, 9);
		result = perm8(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		s1 = input1.substring(4, 5);
		s2 = input1.substring(0, 4) + input1.substring(5, 9);
		result = perm8(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		s1 = input1.substring(5, 6);
		s2 = input1.substring(0, 5) + input1.substring(6, 9);
		result = perm8(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		s1 = input1.substring(6, 7);
		s2 = input1.substring(0, 6) + input1.substring(7, 9);
		result = perm8(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		s1 = input1.substring(7, 8);
		s2 = input1.substring(0, 7) + input1.substring(8, 9);
		result = perm8(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		s1 = input1.substring(8, 9);
		s2 = input1.substring(0, 8) + input1.substring(9, 9);
		result = perm8(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		return list4;
	}
	
	public static List<String> perm8(String word8) {
		String input1 = "";
		String s1, s2;
		List<String> result = new ArrayList<>();
		List<String> list4 = new ArrayList<>();
		input1 = word8;
		s1 = input1.substring(0, 1);
		s2 = input1.substring(1, 8);
		result = perm7(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		s1 = input1.substring(1, 2);
		s2 = input1.substring(0, 1) + input1.substring(2, 8);
		result = perm7(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}

		s1 = input1.substring(2, 3);
		s2 = input1.substring(0, 2) + input1.substring(3, 8);
		result = perm7(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}

		s1 = input1.substring(3, 4);
		s2 = input1.substring(0, 3) + input1.substring(4, 8);
		result = perm7(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		s1 = input1.substring(4, 5);
		s2 = input1.substring(0, 4) + input1.substring(5, 8);
		result = perm7(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		s1 = input1.substring(5, 6);
		s2 = input1.substring(0, 5) + input1.substring(6, 8);
		result = perm7(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		s1 = input1.substring(6, 7);
		s2 = input1.substring(0, 6) + input1.substring(7, 8);
		result = perm7(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		s1 = input1.substring(7, 8);
		s2 = input1.substring(0, 7) + input1.substring(8, 8);
		result = perm7(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		return list4;
	}
	
	public static List<String> perm7(String word7) {
		String input1 = "";
		String s1, s2;
		List<String> result = new ArrayList<>();
		List<String> list4 = new ArrayList<>();
		input1 = word7;
		s1 = input1.substring(0, 1);
		s2 = input1.substring(1, 7);
		result = perm6(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		s1 = input1.substring(1, 2);
		s2 = input1.substring(0, 1) + input1.substring(2, 7);
		result = perm6(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}

		s1 = input1.substring(2, 3);
		s2 = input1.substring(0, 2) + input1.substring(3, 7);
		result = perm6(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}

		s1 = input1.substring(3, 4);
		s2 = input1.substring(0, 3) + input1.substring(4, 7);
		result = perm6(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		s1 = input1.substring(4, 5);
		s2 = input1.substring(0, 4) + input1.substring(5, 7);
		result = perm6(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		s1 = input1.substring(5, 6);
		s2 = input1.substring(0, 5) + input1.substring(6, 7);
		result = perm6(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		s1 = input1.substring(6, 7);
		s2 = input1.substring(0, 6) + input1.substring(7, 7);
		result = perm6(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		return list4;
	}
	
	public static List<String> perm6(String word6) {
		String input1 = "";
		String s1, s2;
		List<String> result = new ArrayList<>();
		List<String> list4 = new ArrayList<>();
		input1 = word6;
		s1 = input1.substring(0, 1);
		s2 = input1.substring(1, 6);
		result = perm5(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		s1 = input1.substring(1, 2);
		s2 = input1.substring(0, 1) + input1.substring(2, 6);
		result = perm5(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}

		s1 = input1.substring(2, 3);
		s2 = input1.substring(0, 2) + input1.substring(3, 6);
		result = perm5(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}

		s1 = input1.substring(3, 4);
		s2 = input1.substring(0, 3) + input1.substring(4, 6);
		result = perm5(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		s1 = input1.substring(4, 5);
		s2 = input1.substring(0, 4) + input1.substring(5, 6);
		result = perm5(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		s1 = input1.substring(5, 6);
		s2 = input1.substring(0, 5) + input1.substring(6, 6);
		result = perm5(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		return list4;
	}
	
	public static List<String> perm5(String word5) {
		String input1 = "";
		String s1, s2;
		List<String> result = new ArrayList<>();
		List<String> list4 = new ArrayList<>();
		input1 = word5;
		s1 = input1.substring(0, 1);
		s2 = input1.substring(1, 5);
		result = perm4(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		s1 = input1.substring(1, 2);
		s2 = input1.substring(0, 1) + input1.substring(2, 5);
		result = perm4(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}

		s1 = input1.substring(2, 3);
		s2 = input1.substring(0, 2) + input1.substring(3, 5);
		result = perm4(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}

		s1 = input1.substring(3, 4);
		s2 = input1.substring(0, 3) + input1.substring(4, 5);
		result = perm4(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		
		s1 = input1.substring(4, 5);
		s2 = input1.substring(0, 4) + input1.substring(5, 5);
		result = perm4(s2);
		for(int i=0;i<result.size();i++)
		{
			list4.add(s1 + result.get(i));
		}
		return list4;
	}
	
	public static List<String> perm4(String word4) {
		String input1 = "";
		String s1, s2;
		List<String> result = new ArrayList<>();
		List<String> list4 = new ArrayList<>();
		input1 = word4;
		s1 = input1.substring(0, 1);
		s2 = input1.substring(1, 4);
		result = perm3(s2);
		for(int i=0;i<result.size();i++) {
			list4.add(s1 + result.get(i));
		}
		

		s1 = input1.substring(1, 2);
		s2 = input1.substring(0, 1) + input1.substring(2, 4);
		result = perm3(s2);
		for(int i=0;i<result.size();i++) {
			list4.add(s1 + result.get(i));
		}

		s1 = input1.substring(2, 3);
		s2 = input1.substring(0, 2) + input1.substring(3, 4);
		result = perm3(s2);
		for(int i=0;i<result.size();i++) {
			list4.add(s1 + result.get(i));
		}

		s1 = input1.substring(3, 4);
		s2 = input1.substring(0, 3) + input1.substring(4, 4);
		result = perm3(s2);
		for(int i=0;i<result.size();i++) {
			list4.add(s1 + result.get(i));
		}
		return list4;
	}

	public static List<String> perm3(String word3) {
		String input1 = word3;
		List<String> permutation_words = new ArrayList<>();
		String s1 = input1.substring(0, 1);
		String s2 = input1.substring(1, 2);
		String s3 = input1.substring(2, 3);
		permutation_words.add(s1 + s2 + s3);
		permutation_words.add(s1 + s3 + s2);
		permutation_words.add(s2 + s1 + s3);
		permutation_words.add(s2 + s3 + s1);
		permutation_words.add(s3 + s1 + s2);
		permutation_words.add(s3 + s2 + s1);
		return permutation_words;
	}

	public static void main(String[]args) throws IOException
	{
		String input1="";
		String s1,s2;
		List<String> result = new ArrayList<>();		
		String filePath = "output.txt";
		File file = new File(filePath);
		if(!file.exists())
		{
			file.createNewFile();
		}
		
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
		input1 = "EAT";
		result = perm3(input1);
		writer.write("Permutation of "+input1+" ( "+result.size()+" )is :\n"+result+"\n\n");
		
		
		input1 = "FAST";
		result = perm4(input1);
		writer.write("Permutation of "+input1+" ( "+result.size()+" )is :\n"+result+"\n\n");
		
		input1 = "SMILE";
		result = perm5(input1);
		writer.write("Permutation of "+input1+" ( "+result.size()+" )is :\n"+result+"\n\n");
		
		input1 = "FASTER";
		result = perm6(input1);
		writer.write("Permutation of "+input1+" ( "+result.size()+" )is :\n"+result+"\n\n");
		
		input1 = "SINCERE";
		result = perm7(input1);
		writer.write("Permutation of "+input1+" ( "+result.size()+" )is :\n"+result+"\n\n");
		
		input1 = "PROGRESS";
		result = perm8(input1);
		writer.write("Permutation of "+input1+" ( "+result.size()+" )is :\n"+result+"\n\n");
		
		input1 = "BEAUTIFUL";
		result = perm9(input1);
		writer.write("Permutation of "+input1+" ( "+result.size()+" )is :\n"+result+"\n\n");
		writer.write(" Printing complete ");
        } catch (IOException e) {
            e.printStackTrace();
        }
		System.out.println(" Printing complete");
	}
}
