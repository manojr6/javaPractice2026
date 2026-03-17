package javaPractice2026;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revNumber();

	}

	public static void revNumber() {

		int number=12345896;
		int rev=0;

		while (number!=0) {
			int digits= number%10;
			rev=rev*10+digits;
			number=number/10;
		}

		System.out.println(rev);


	}

}
