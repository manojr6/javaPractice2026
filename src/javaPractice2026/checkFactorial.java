package javaPractice2026;

public class checkFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorialCheck();

	}

	public static void factorialCheck() {
		int num=3;
		int fact=1;

		for (int i = 1; i <=num; i++) {
			fact=fact*i;
		}

		System.out.println(fact);
	}

}
