package com.sangamone;
import com.sangamone.testclass;
public class mainclass {

	public static void main(String[] args) {
		testclass tc =new testclass();
        System.out.println(tc.readLinesAndCompare("file1.txt", "file2.txt"));
        System.out.println(tc.compareWords("file1.txt", "file2.txt"));
    }

}
