package javaPractice2026;

public class countDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countDigits1();
	}

	public static void countDigits1() {
		int num=98764321;
		int count=0;

		while (num!=0) {
			num=num/10;
			count++;
		}

		System.out.println(count);
	}

}
