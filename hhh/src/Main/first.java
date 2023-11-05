package Main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class first {
	public static char alpha[]=new char[26];
	public static int man_score = 0,Comp_Score = 0;

	public static void generate_alphabet()
	{
		for (int j = 97,i=0; j < (97+26); j++,i++) {
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
	
	private static void Play_the_game(List<String>Used_words,List<List<String>>Same_letter_words, Method_Rule3 obj,String lastword)
	{
		String input;
		while(true) {
			System.out.print("YOU : ");
			Object[] o1=(Object[]) obj.rule3(Used_words); 
			input = o1[1].toString();
			man_score += input.length();
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
				
				for (List<String> usedList : Same_letter_words) {
	                usedList.removeIf(usedWord -> Used_words.contains(usedWord));
	            }
				for(int i=0;i<Same_letter_words.size();i++)
				{
					if(Same_letter_words.get(i).size() == 0)
					{
						System.out.println("Computer : I have no word left");
						System.out.println("You won");
						System.exit(0);
					}
					else if(Same_letter_words.get(i).get(0).charAt(0) == last_letter)
					{
						String max_size_word = Same_letter_words.get(i).get(0);
						for (int j=0;j<Same_letter_words.get(i).size();j++)
						{
							if(Same_letter_words.get(i).get(j).length() > max_size_word.length() && Same_letter_words.get(i).get(j).length() > len1)
							{
								max_size_word = Same_letter_words.get(i).get(j);
							}
							else if(Same_letter_words.get(i).get(j).length() > max_size_word.length() )
							{
								max_size_word = Same_letter_words.get(i).get(j);
							}
						}
						System.out.println("Computer : "+max_size_word+"\n");
						Used_words.add(max_size_word);
						lastword = max_size_word;
						Comp_Score += max_size_word.length();
						System.out.println("Your score : "+man_score+"\t Computer Score : "+Comp_Score);
						break;
					}
				}
			}
			else {
				System.out.println("You lose");
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
		
		File f1 = new File("words.txt");
		try (Scanner sc = new Scanner(f1)) {
			while(sc.hasNextLine())
			{
				fileinfo = sc.nextLine();
				words.add(fileinfo);
			}
		}
		generate_alphabet();
		Same_letter_words = make_group(words,Same_letter_words);
		lastword = " ";
		Method_Rule3 obj=new Method_Rule3(); 
		Play_the_game(Used_words,Same_letter_words,obj,lastword);
	}
}

