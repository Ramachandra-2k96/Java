package com.sangamone;

import java.util.ArrayList;
import java.util.List;

public class triad {
	public static List<List<Integer>> list_triad() {
		List<Integer> temp;
		List<List<Integer>> triad =new ArrayList<>();
		for(int i=3;i<20;i++)
		{
			for(int j=i+1;j<20;j++) {
				int num1 =i*i;
				int num2 =j*j;
				double c = Math.sqrt(num1+num2);
				if(c == (int)c)
				{
					temp =new ArrayList<>();
					temp.add(i);
					temp.add(j);
					temp.add((int)c);
					triad.add(temp);
				}
			}
		}
		return triad;
	}

	public static void main(String[] args) {
		System.out.println(list_triad());
	}
}
