package com.sangamone;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class testcae_generator {
	public static void main(String []args) throws IOException
	{
		File f1 =new File("Testcase1.txt");
		File f2 =new File("Testcase2.txt");
		File f3 =new File("Testcase3.txt");
		File f4 =new File("Testcase4.txt");
		FileWriter f =new FileWriter(f1);
		Random r=new Random();
		for(int i=0;i<1000;i++)
		{
			int randint1 =r.nextInt(1000)+1;
			int randint2 =r.nextInt(1000)+1;
			int result =randint1 +randint2;
			f.write(String.valueOf(randint1)+","+String.valueOf(randint2)+","+String.valueOf(result)+"\n");
		}
		f =new FileWriter(f2);
		for(int i=0;i<1000;i++)
		{
			int randint1 =r.nextInt(1000)+1;
			int randint2 =r.nextInt(1000)+1;
			int result =randint1 -randint2;
			f.write(String.valueOf(randint1)+","+String.valueOf(randint2)+","+String.valueOf(result)+"\n");
		}
		f =new FileWriter(f3);
		for(int i=0;i<1000;i++)
		{
			int randint1 =r.nextInt(1000)+1;
			int randint2 =r.nextInt(1000)+1;
			int result =randint1 *randint2;
			f.write(String.valueOf(randint1)+","+String.valueOf(randint2)+","+String.valueOf(result)+"\n");
		}
		f =new FileWriter(f4);
		for(int i=0;i<1000;i++)
		{
			int randint1 =r.nextInt(1000)+1;
			int randint2 =r.nextInt(1000)+1;
			int result =randint1 /randint2;
			f.write(String.valueOf(randint1)+","+String.valueOf(randint2)+","+String.valueOf(result)+"\n");
		}
		System.out.println("DONE");
	}
}
