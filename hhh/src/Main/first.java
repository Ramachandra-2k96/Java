package Main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Main.Method_Rule3;

public class first {
	public static char alpha[]=new char[26];
	
	
	public static void generate_alphabet()
	{
		for (int j = 97,i=0; j <= 122; j++,i++) {
			alpha[i]=(char)j;
		}
	}
	
	
	public static List<List<String>> make_group(List<String> a,List<List<String>>b)
	{
		for(int j=0;j<26;j++)
		{
			List <String>temp= new ArrayList<>();
			for(int i=0;i<a.size();i++)
			{
			
				if(a.get(i).charAt(0) == alpha[j])
				{
					temp.add(a.get(i));
				}
			}
			b.add(temp);
		}
		return b;
	}
	
	
	
	private static void Play_the_game(List<String>Used_words,List<List<String>>Same_letter_words, Method_Rule3 obj,String lastword) {
		String input;
		while(true) {
			System.out.print("YOU : ");
			Object[] o1=(Object[]) obj.rule3(Used_words); 
			input = o1[1].toString();
			Boolean isdisqualified =(Boolean) o1[0];
			Used_words.add(input);
			
			if(isdisqualified) 
			{
				System.out.println("You lost the game");
				System.exit(0);
			}
			
			if (lastword.isBlank() || lastword.charAt(lastword.length() - 1) == input.charAt(0)) 
			{
				int len1 = input.length();
				char last_letter= input.charAt(len1-1);
				for(int i=0;i<Same_letter_words.size();i++)
				{
					if(Same_letter_words.get(i).isEmpty())
					{
						System.out.println("Computer : I have no word left");
						System.out.println("You won");
						System.exit(0);
					}
					else if(Same_letter_words.get(i).get(0).charAt(0) == last_letter)
					{
						System.out.println("Computer : "+Same_letter_words.get(i).get(0)+" with length "+Same_letter_words.get(i).get(0).length()+"\n");
						Used_words.add(Same_letter_words.get(i).get(0));
						lastword = Same_letter_words.get(i).remove(0);
						break;
					}
				}
			}
			else {
				System.out.println("You loose");
				System.exit(0);
			}
		}
	}	

	
	
	
public static void main(String[] args) throws FileNotFoundException 
	{
		List <String>words= new ArrayList<>();
		List <String>Used_words= new ArrayList<>();
		List <List <String>>Same_letter_words= new ArrayList<>();
		String fileinfo ,lastword;
		File f1 = new File("C:/Users/ramac/Downloads/words.txt");
		Scanner sc= new Scanner(f1);
		while(sc.hasNextLine())
		{
			fileinfo = sc.nextLine();
			words.add(fileinfo);
		}
		generate_alphabet();
		Same_letter_words = make_group(words,Same_letter_words);
		lastword = " ";
		Method_Rule3 obj=new Method_Rule3(); 
		Play_the_game(Used_words,Same_letter_words,obj,lastword);
	}
}

