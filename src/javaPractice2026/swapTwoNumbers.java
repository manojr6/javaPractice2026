package javaPractice2026;

public class swapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapNumbers();
	}

	public static void swapNumbers() {
		int a=60;
		int b=558;
		
		//add/sub

		/*
		 * a=a+b; b=a-b; a=a-b;
		 */

		//multi/div
		
		/*
		 * a=a*b; b=a/b; a=a/b;
		 */
		
		//XOR
		/*
		 * a=a^b; b=a^b; a=a^b;
		 */
		
		//using temp
		
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println(a);
		System.out.println(b);

	}

}
