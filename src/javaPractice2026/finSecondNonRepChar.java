package javaPractice2026;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class finSecondNonRepChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		secondNonRep();
	}

	public static void secondNonRep() {

		String str="aabbccddeefgghhhjkkllm";

		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		int count=0;

		for(Entry<Character, Integer> entry: map.entrySet()) {
			if (entry.getValue()==1) 
			{
				count++;
				if(count==2)
				{System.out.println(entry.getKey());
				break;
				}


			}
		}


	}

}
