package javaPractice2026;

public class miingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//missingNumArray();
		missingNumArray1();

	}
	
	public static void missingNumArray() {
		int[] arr= {1,2,3,4,6,7,8};
		
		int n=8;
		int expectedSum=n*(n+1)/2;
		
		int actualSum=0;
		
		for (int num : arr) {
			actualSum=actualSum+num;
		}
		
		int missing=expectedSum-actualSum;
		
		System.out.println(missing);
	}
	
	public static void missingNumArray1() {
		
		int[] arr= {1,2,3,4,6,7,8,9,10,12,5,13,14,15,11};
		int n=16;
		
		int expectedSum=n*(n+1)/2;
		
		int actualSum=0;
		
		for (int num : arr) {
			actualSum=actualSum+num;
		}
		
		int missing=expectedSum-actualSum;
		
		System.out.println(missing);
	}

}
