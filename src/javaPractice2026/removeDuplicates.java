package javaPractice2026;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remDupWithoutCollections();
		remDup1();
	}


	public static void remDup() {

		int arr[]= {2,8,9,76,98,7,6,7,8,9,12,18,12};

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++)	{
				{
					if(arr[i]==arr[j])
					{
						arr[j]=-1;
					}


				}
			}}

		for(int num: arr)
		{
			if(num!=-1)
				System.out.println(num + " ");
		}
	}
	
	public static void remDup1() {
		
		String x="honeybunbee";
		
		
		Set<Character> set=new HashSet<>();
		for (Character ch : x.toCharArray()) {
			set.add(ch);
		}
		
		String result="";
		
		for (Character ch : set) {
			result=result+ch;
		}
		
		System.out.println(result);
	}

	public static void remDupWithoutCollections() {
		String x="abcdabcdefghijkijk";
		String result="";
		
		
		for (int i = 0; i < x.length(); i++) {
			
			char ch=x.charAt(i);
			
			if (result.indexOf(ch)==-1)
			{
				result=result+ch;
			}
				
			}
			
		System.out.println(result);
		
	}
}
