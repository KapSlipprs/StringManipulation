//Jesse Yochens
//Huey Ries

import java.util.*;
public class WordGame
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);

		int wordNumber = (int)(Math.random()*10);

		String[] words={"honda","third","truck","laugh","silly","shake","color","scene","books","candy"};
		String word = words[wordNumber];
		String guess;

		HiddenWord puzzle=new HiddenWord(word);

		System.out.println("Welcome to the word game!");
		System.out.println("You must guess a five letter word!");
		System.out.println();

		do
		{
			System.out.print("What is your guess? ");
			guess= keyboard.nextLine();

			if(!(guess.equals(puzzle.getHint(guess))))
			{
				System.out.println("Oh no! That isn't correct!");
				System.out.println("Your hint is: "+puzzle.getHint(guess));
			}


		}
		while(!(guess.equals(puzzle.getHint(guess))));
		System.out.println("Good Job!you got it correct!");
		System.out.println("Your word was: "+word);


	}
}