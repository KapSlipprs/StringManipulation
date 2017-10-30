public class HiddenWord
{
	//gay

	private String word;

	public HiddenWord(String h)
	{
		word=h;
	}

	public String getHint(String g)
	{
		String hint;

		for (int i=0; i<g.length()-1; i++)
		{
			if (g.charAt(i)==word.charAt(i))
			{
				word += g.charAt(i);
			}
			else if (g.charA