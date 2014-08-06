public class CompareToChallenge
{
	public static void main( String[] args )
	{
		String[] wordA = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "apples", "100" };		
		String[] wordB = { "a", "bee", "sea", "fore", "alive", "sticks", "seventy", "octagon", "no", "tin", "apples", "100" };
		int num;
		 
		for (int i = 0; i < 12; i++ )
		{
			System.out.print("Comparing \"" + wordA[i] + "\" with \"" + wordB[i] + "\" produces ");
			num = wordA[i].compareTo(wordB[i]);
			System.out.println(num);
		}
		
	}
}