package javaPractice2026;

public class findMaxDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maxDifference1();

	}


	public static void maxDifference() {
		int arr[] = {7,1,5,3,6,4};
		int maxDiff=Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int diff= arr[j]-arr[i];
				if (diff>maxDiff) {
					maxDiff=diff;
				}

			}

		}

		System.out.println(maxDiff);

	}

	public static void maxDifference1() {
		int arr[] = {7,1,5,3,6,4};

		int min=arr[0];
		int maxDiff=arr[1]-arr[0];

		for (int i = 0; i < arr.length; i++) {
			int diff=arr[i]-min;
			if (maxDiff<diff) {
				maxDiff=diff;
			}

			if(arr[i]<min)
			{
				min=arr[i];
			}
		}

		System.out.println(maxDiff);

	}
}

