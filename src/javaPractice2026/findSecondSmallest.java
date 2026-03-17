package javaPractice2026;

public class findSecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findSmall();

	}

	public static void findSmall() {
		int arr[] = { 100,14,2,9, 46, 47, 94, 94,109, 52,1008, 86, 36, 94,214,3009, 89,98999};
		int smallestNumber=Integer.MAX_VALUE;
		int secondSmallestNumber=Integer.MAX_VALUE;

		for (int i : arr) {

			if (i<smallestNumber) {
				secondSmallestNumber=smallestNumber;
				smallestNumber=i;
			}
			else
				if(i<secondSmallestNumber&&i!=smallestNumber)
				{
					secondSmallestNumber= i;
				}
		}
		System.out.println(smallestNumber);
		System.out.println(secondSmallestNumber);
	}

}
