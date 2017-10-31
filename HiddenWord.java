public class HiddenWord
{

	
	private String word;

	public HiddenWord(String h)
	{
		word = h;
	}

	public String getHint(String g)
	{
		String words = "";
		
		
		for(int c = 0; c < words.length();  c++)
		{
			String letter = g.substring(c,c+1);
		
			if(g.charAt(c) == word.charAt(c))
			{
				 words += letter;
			}
			else if (g.indexOf(letter) > -1) 
			{
				words += "+";
			}
			else 
			{
				words += "*";
			}

		}
		
		return words;
	}
}

