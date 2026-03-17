package javaPractice2026;



public class checkFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		charFreq1();
	}

	public static void charFreq() {

		String str="focusonyourgoals";

		char[] arr=str.toCharArray();

		boolean[] visited=new boolean[arr.length];


		for (int i = 0; i < arr.length; i++) {
			if(visited[i]==true)
				continue;

			int count=1;

			for (int j = i+1; j < arr.length; j++) {

				if(arr[i]==arr[j])
				{
					count++;
					visited[j]=true;

				}


			}

			System.out.println(arr[i] + " = " + count );

		} 


	}

	public static void charFreq1() {

		String str1="pothapun";
		char[] arr1= str1.toCharArray();
		boolean visited[]=new boolean[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			if(visited[i]==true)

				continue;

			int count1=1;
			{
				for (int j = i+1; j < arr1.length; j++) {
					if (arr1[i]==arr1[j]) {
						visited[j]=true;
						count1++;
					}
				}


			}
			System.out.println(arr1[i] + "=" + count1);


		}
	}
}