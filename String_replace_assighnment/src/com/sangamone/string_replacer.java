package com.sangamone;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class string_replacer {
	public static void file_write(String file1,String file2)throws IOException{
		Scanner sc1= new Scanner(new File(file1));
		Scanner sc2= new Scanner(new File(file2));
		FileWriter fw =new FileWriter(new File("Output.txt"));
		String[] temp1,template;
		String s2,pos1;
		int pos2;
		while(sc2.hasNextLine())//read every line of template
		{
			template = sc2.nextLine().split(" ");//template elements
			while(sc1.hasNextLine())
			{
				s2= "";
				temp1 = sc1.nextLine().replace("\n","" ).split(", ");//names
				for(String temp:template)//run loop for every template elements
				{
					if(!temp.contains("$")) {
						s2= s2+" "+temp; //if its not $ directly merge that to string
					}
					else
					{
						pos1 = temp.substring(1,2); //else, get the position of next element after $ 
						pos2 =Integer.parseInt(pos1);//convert that to integer
						s2 = s2+ " "+temp1[pos2-1]; //add that to string by acquiring the element from the details array at the required position		
					}
				}
				fw.write(s2+"\n");
			}
		}
		fw.close();
	}
		

	public static void main(String[] args) throws IOException  {
		file_write("list1.txt","template.txt");
	}
}
