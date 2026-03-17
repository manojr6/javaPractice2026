package javaPractice2026;

public class checkArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkArmstrong();
	}

	public static void checkArmstrong() {

		int num=153;
		int original=num;
		int sum=0;

		while (num!=0) {
			int digit=num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;

		}

		if (sum==original) {
			System.out.println("armstrong");
		} else {
			System.out.println("not armstrong");
		}
		
		
	}

}
