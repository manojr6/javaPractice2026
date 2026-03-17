package javaPractice2026;

public class reverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//revUsingString();
		//revUsingStringBuilder();
		revUsingStringBuffer();

	}
	
	public static void revUsingString() {
		
		String str="maayandi is a good family man";
		
		String[] words =str.split(" ");
		
		
		
		for (String word : words) {
			
			String rev="";
		
		for (int i=word.length()-1;i>=0;i--) {
			rev=rev+word.charAt(i);
			
		}
		
		System.out.print(rev+" ");
		
		}
		
	}
	
	public static void revUsingStringBuilder() {
		
	String str="maayandi is a good family man";
		
		String[] words =str.split(" ");
		
	
			for (String word : words) {
				
			
			StringBuilder sb=new StringBuilder(word);
			
			System.out.print(sb.reverse()+ " ");
		}
		
		
		
	}
	
	public static void revUsingStringBuffer() {
		
	String str="maayandi is a good family man";
		
		String[] words =str.split(" ");
		
	
			for (String word : words) {
				
			
			StringBuffer sb=new StringBuffer(word);
			
			System.out.print(sb.reverse()+ " ");
		}
	}

	}
