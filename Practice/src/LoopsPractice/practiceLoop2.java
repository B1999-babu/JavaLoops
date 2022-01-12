package LoopsPractice;

public class practiceLoop2 {
	
	public static void main(String args[]) {
		//int j=10;
		String name="Baburao kadappa Doog";
		for(int i=name.length()-1; i>=0; i--) {
			System.out.println("Char: "+name.charAt(i));
		}
		
		
		
		for(int i=0;i<=name.length();i++) {
			System.out.println("Char2: "+i);
		}
		
		
		
		for(int i=0;i<name.length();i++) {
			System.out.println("Char3 : "+name.charAt(i));
		}
		
		
		for(int i=0; i<=100; i+=2) {
			System.out.println("Even numbers: "+i);
		}
		
	}

}
