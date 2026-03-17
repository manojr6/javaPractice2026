package javaPractice2026;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revStr1();

	}

	public static void revStr() {
		String a="gajendra";
		char b[]=a.toCharArray();

		int size=b.length;

		char c[]=new char[size];

		int i=0;
		for (char d : b) {
			c[i]=b[size-i-1];
			i++;
		}

		System.out.println(c);
	}
	
	public static void revStr1() {
		

		String s = "komal";

        char arr[] = s.toCharArray();

		int left=0;
		int right=arr.length-1;
		
		while (left<right) {
			char temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			
			left++;
			right--;
			
			
					
		}
		
		System.out.println(arr);
	}

}
