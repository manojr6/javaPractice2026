package javaPractice2026;

public class moveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//moveZeros();
		moveZeros1();

	}

	public static void moveZeros() {

		int arr[] = {1,0,2,0,3,0,4,6,8,0,9};
		int index=0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=0) 
			{
				arr[index]=arr[i];
				index++;
			}
		}

		while(index<arr.length)
		{
			arr[index]=0;
			index++;
		}

		for (int num : arr) {
			System.out.print(num+ " ");
		}
	}
	
	
	public static void moveZeros1() {
		int arr[]= {1,0,2,0,3,0,4,64,89,75,81,19,0,0,8,0,9,7,8};
		int index=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=0) {
				arr[index]=arr[i];
				index++;
			}
		}
		
		while (index<arr.length) {
			arr[index]=0;
			index++;
		}
		
		for (int num : arr) {
			System.out.print(num+" ");
		}
	}

}
