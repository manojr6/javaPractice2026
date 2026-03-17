package javaPractice2026;

public class revoveSplChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//remUsingRegex();
		remUsingLoops();
	}


	public static void remUsingRegex() {

		String str="ja$^U&* jhdh 67878 ^&^** 00";

		String result=str.replaceAll("[^a-zA-Z0-9 ]", "");

		System.out.println(result);
	}


	public static void remUsingLoops() {

		String str="ja$^U&* jhdh 67878 ^&^** 00";

		String result ="";

		for(int i=0;i<str.length();i++) {

			char ch=str.charAt(i);

			if (Character.isLetterOrDigit(ch)||ch==' ') {
				result=result+ch;
			}

			
		}
		System.out.println(result);
		

	}
}