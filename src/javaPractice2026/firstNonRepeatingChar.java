package javaPractice2026;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nonRepChar1();

	}
	
	public static void nonRepChar() {
		
		String s="umbrellafinumbgaer";
		
		Map<Character, Integer> map1= new LinkedHashMap<>();
		for (char ch : s.toCharArray() ) 
		{
			map1.put(ch, map1.getOrDefault(ch, 0)+1);
		}
		
		for (Map.Entry<Character, Integer> entry: map1.entrySet())
		{
			
			if (entry.getValue() ==1)
			{
				System.out.println("first non rep char: " + entry.getKey());
				break;
			}
		}
			
		}
	
	public static void nonRepChar1() {
		
		String str="abcdabcdefg";
		
		Map<Character , Integer> map2= new LinkedHashMap<>();
		for (char ch : str.toCharArray()) {
			map2.put(ch, map2.getOrDefault(ch, 0)+1 );
		}
		
		System.out.println(map2);
		
	for(Map.Entry<Character, Integer> entry:  map2.entrySet())
	{
	if(entry.getValue()==1) {
		System.out.println("first non repeating character:" +entry.getKey());
		break;
	}	
	}
	
	String result="";
	String result1="";
	String result2="";
	for(Map.Entry<Character, Integer> entry1: map2.entrySet())
	{
		result= result + entry1.getKey();
		
	}
	
	
	
	
	
	for(Map.Entry<Character, Integer> entry2: map2.entrySet())
	{
		if (entry2.getValue()>1) {
			result1= result1 + entry2.getKey();
		}
		
		
	}
	
	for(Map.Entry<Character, Integer> entry3: map2.entrySet())
	{
		if (entry3.getValue()==1) {
			result2= result2 + entry3.getKey();
		}
		
		
	}
	
	
	System.out.println("print all values:" +result);
	System.out.println("print only chars having duplicates:" +result1);
	System.out.println("print chars which not having duplicates:" +result2);
	
	}
	
	}


