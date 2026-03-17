package javaPractice2026;

public class countCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countAllChars();

	}

	public static void countAllChars() {

		String x="ABCdef123 %^&)*";

		int vowels=0;
		int consonants=0;
		int numbers=0;
		int specialChar=0;
		for (char ch : x.toLowerCase().toCharArray()) 
		{
			if (Character.isLetter(ch)) {
				if ("aeiou".indexOf(ch)!=-1)
				{
					vowels++;
				}
				else {
					consonants++;
				}


			}
			else
				if(Character.isDigit(ch))
				{
					numbers++;
				}

				else
				{
					if (!Character.isWhitespace(ch)) {
						specialChar++;
					}
				}

		}

		System.out.println(vowels);
		System.out.println(consonants);
		System.out.println(numbers);
		System.out.println(specialChar);
	}
}
