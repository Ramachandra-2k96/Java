package com.sangam;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberToWordsConverter {
	private static ArrayList<String> readWordsFromFile(String filename) throws IOException {//working
        File file = new File(filename);
        ArrayList<String> wordsList = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                wordsList.add(scanner.nextLine());
            }
        }
        return wordsList;
    }
    private static String convertToWords(long number) throws IOException {//working
    	List<String> words=readWordsFromFile("words.txt");
        String[] units =new String[20];
        String[] tens =new String[20];
        tens[1]="";
        tens[0]="";
        int i=0,j=2;
        for(String word : words)
        {
        	if(i<=19)
        	{
            	units[i] = words.get(i);
        	}
        	if(i>19&&i<=27)
        	{
        		tens[j] = words.get(i);
        		j++;
        	}
        	if(i>27)
        	{
        		break;
        	}
        	i++;
        }
        if (number == 0) {
            return "Zero"; 
        }
        String result = "";
        if (number >= 10000000) {
            result += convertToWords(number / 10000000) +" "+words.get(i+3) +" ";
            number %= 10000000;
        }
        if (number >= 100000) {
            result += convertToWords(number / 100000) + " "+words.get(i+2)+" ";
            number %= 100000;
        }
        if (number >= 1000) {
            result += convertToWords(number / 1000) +" "+words.get(i+1)+" ";
            number %= 1000;
        }
        if (number >= 100) {
            result += convertToWords(number / 100) +" "+ words.get(i) +" and ";
            number %= 100;
        }
        if (number > 0) {
            if (number < 20) {
                result += units[(int) number];
            } else {
                result += tens[(int) (number / 10)];
                if (number % 10 > 0) {
                    result += " " + units[(int) (number % 10)];
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) throws IOException {//working
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (or 'exit' to quit): ");
        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("exit")) {
            try {
                long num = Long.parseLong(input);
                String words = convertToWords(num);
                System.out.println("Words: " + words);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }

            System.out.print("\nEnter a number (or 'exit' to quit): ");
            input = scanner.nextLine();
        }
        System.out.println("Exiting the program.");
        scanner.close();
    }
}
