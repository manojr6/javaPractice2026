package javaPractice2026;

public class findSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//findHighestSecond();
		findSecLarg1();

	}

	
	public static void findHighestSecond() {
		
		int arr[] = { 100,14, 46, 47, 94, 94,109, 52,1008, 86, 36, 94,214,3009, 89,98999};
		int largestNumber=Integer.MIN_VALUE;
		int secondLargestNumber=Integer.MIN_VALUE;
		
		
		for (int i : arr) {
			if(i>largestNumber)
			{
				secondLargestNumber=largestNumber;
				largestNumber=i;
				
			}
			else if(i>secondLargestNumber && i!=largestNumber) 
			{
				secondLargestNumber=i;
			}
			
		}
		
		System.out.println(largestNumber);
		System.out.println(secondLargestNumber);
		
	}

public static void findSecLarg1() {
	int arr[] = { 100,14, 46, 47, 94, 94,109,567819, 52,1008, 86, 36, 94,214,3009, 89,98999};
	
	int largest=Integer.MIN_VALUE;
	int secondLargest=Integer.MIN_VALUE;
	
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]>largest) {
			secondLargest=largest;
			largest=arr[i];
			
		} else 
		if (arr[i]>secondLargest && arr[i]!=largest) {
			secondLargest=arr[i];
		}

		}
	
	System.out.println(largest);
	System.out.println(secondLargest);
		
	}
}




