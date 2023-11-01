import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class first {

	public static void main(String[] args) throws FileNotFoundException 
	{
		List <String>words= new ArrayList<>();
		List <List <String>>Same_letter_words= new ArrayList<>();
		String fileinfo ;
		File f1 = new File("C:/Users/ramac/Downloads/words.txt");
		Scanner sc= new Scanner(f1);
		while(sc.hasNextLine())
		{
			fileinfo = sc.nextLine();
			words.add(fileinfo);
		}
		char alpha[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for(int j=0;j<26;j++)
			{
			List <String>temp= new ArrayList<>();
			for(int i=0;i<words.size();i++)
			{
				
				if(words.get(i).charAt(0) == alpha[j])
				{
					temp.add(words.get(i));
				}
			}
			Same_letter_words.add(temp);
		}
		Scanner sc1= new Scanner(System.in);
		System.out.print(" You : ");
		String input = sc1.next();
		int len1 = input.length();
		char last_letter= input.charAt(len1-1);
		for(int i=0;i<Same_letter_words.size();i++)
		{
			if(Same_letter_words.get(i).get(0).charAt(0) == last_letter)
			{
				System.out.println("Computer : "+Same_letter_words.get(i).get(0)+" with length "+Same_letter_words.get(i).get(0).length());
				break;
			}
		}
	}

}
