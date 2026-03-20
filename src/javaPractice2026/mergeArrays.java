package javaPractice2026;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class mergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mergeArrayManual();
	}

	public static void mergeArrayManual() 
	{
		int arr1[]= {1,2,4,5,6,7,8,9};
		int arr2[]= {1,3,4,9,6,5,8,9};

		LinkedHashSet<Integer> set=new LinkedHashSet<>();

		for (int num : arr1) {
			set.add(num);
		}

		for (int num : arr2) {
			set.add(num);
		}


		int[] result=new int[set.size()];
		int i=0;

		for (int num : set) {
			result[i++]=num;
		}

		System.out.println(Arrays.toString(result));

	}
}
