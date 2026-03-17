package javaPractice2026;

public class checkPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPali1();

	}

	public static void checkPali() {

		String a="racecar";
		char b[]=a.toCharArray();

		int size=b.length;

		char c[]=new char[size];

		int i=0;
		for (char d : b) {
			c[i]=b[size-i-1];
			i++;
		}
		
		System.out.println(c);

		if (a.equals(new String(c)))
		{
			System.out.println("it is palindrome");

		} else {
			System.out.println("not a palindrome");
		}
	}
	
	public static void checkPali1() {

		String a="louis";
		
		int left=0;
		int right=a.length()-1;
		
		boolean isPalindrome=true;
		
		while (left<right) {
		if (a.charAt(left)!=a.charAt(right)) 
		{
			isPalindrome=false;
			break;
			
		} 
		left++;
		right--;
		
			
		}
		
		if (isPalindrome) {
			System.out.println("it is palindrome");
		} else {

			System.out.println("not palindrome");
		}
	}

}
