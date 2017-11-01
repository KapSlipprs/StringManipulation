//Jesse Yochens
//Huey Ries

import java.util.*;
public class HiddenWord
{
	public static void main(String [] args){
		 String word1 = "books";
		 String guess,word2 = "";

		 HiddenWord word = new HiddenWord(word1);

		Scanner keyboard = new Scanner(System.in);
		do
		{
			System.out.print("Enter a guess: ");
			guess = keyboard.nextLine();
			word2 = getHint(guess);
			System.out.println("\n"+word2);
		}while(word2 != word1);

	}

	private static String word;

	public HiddenWord(String h)
	{
		word = h;
	}

	public static String getHint(String g)
	{
		String hint = "";


		for(int c = 0; c < word.length();  c++)
		{
			String letter = g.substring(c,c+1);

			if(word.charAt(c) == g.charAt(c))
			{
				 hint += letter;
			}
			else if (word.indexOf(letter) != -1)
			{
				hint += "+";
			}
			else
			{
				hint += "*";
			}

		}

		return hint;
	}
}

