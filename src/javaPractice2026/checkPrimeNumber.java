package javaPractice2026;

public class checkPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeNumberUsingSqRoot();
	}

	public static void primeNumber() {
		int num=13;
		boolean isPrime=true;

		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("prime number");
		} else {
			System.out.println("not prime number");

		}
	}

	
	public static void primeNumberUsingSqRoot() {
		int num=1;
		boolean isPrime=true;

		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}

		if (isPrime && num>1) {
			System.out.println("prime number");
		} else {
			System.out.println("not prime number");

		}
	}

}
