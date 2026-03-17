package javaPractice2026;

public class findDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDup();
	}

	public static void findDup() {
		int arr[] = {1,2,3,4,2,5,3,9,9,8,5,2,4,1};

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					System.out.print(arr[i]+ " ");
					break;
				}
			}
		}
	}
}
