package javaPractice2026;

public class revFirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revWithoutStr1();
	}

	public static void revwithStr() {
		int num=123456;

		String str=String.valueOf(num);

		char[] ch=str.toCharArray();

		char temp=ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]=temp;

		String result=new String(ch);

		System.out.println(result);

	}

	
	
	
	
	public static void revwithoutStr() {
		
		int num=123456;
		
		int last=num%10;
		
		int first=num;
		int digits=0;
		
		while (first>=10) {
			first=first/10;
			digits++;
		}
		
		System.out.println(first);
		System.out.println(digits);
		
		int power=(int) Math.pow(10, digits);
		
		System.out.println(power);
		
		int middle=num%power;
		
		System.out.println(middle);
		middle=middle/10;
		
		System.out.println(middle);
		
		int result=last*power+middle*10+first;
		
		System.out.println(result);
		
	}
	
	public static void revWithoutStr1() {
		int num=56878789;
		
		int last=num%10;
		
		int first=num;
		int digits=0;
		
		while (first>=10) {
			first=first/10;
			digits++;
		}
		
		int power=(int) Math.pow(10, digits);
		
		int middle=num%power;
		middle=middle/10;
		
		int result=last*power+middle*10+first;
		
		System.out.println(result);
	}
}
