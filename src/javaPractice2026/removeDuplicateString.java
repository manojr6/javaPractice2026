package javaPractice2026;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class removeDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remDupStrList();
	}

	public static void remDupStrSet() {

		String str="java selenium automation java";

		String[] words=str.split("\\s+");

		Set<String> set=new LinkedHashSet<>();
		for (String word : words) {
			set.add(word);
		}

		String result=String.join(" ", set);

		System.out.println(result);



	}

	public static void remDupStrList() {
		String str="java selenium automation coding coding java";

		String[] words=str.split("\\s+");

		List<String> list=new ArrayList<>();
		for (String word : words) {
			if (!list.contains(word)) 
			{

				list.add(word);
			}

		}
		
		String result=String.join(" ", list);
		
		
		System.out.println(result);
	}

}
