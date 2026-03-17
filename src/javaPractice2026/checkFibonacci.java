package javaPractice2026;

public class checkFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacciCheck();
	}


	public static void fibonacciCheck() {
		
	
		int n=10;
		int a=0;
		int b=1;

System.out.print(a+" " + b+ " ");

		for (int i = 2; i < n; i++) {
			int c=a+b;
			System.out.print(c+ " ");

			a=b;
			b=c;

		}

	}
}
