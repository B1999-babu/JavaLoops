package practice.String;

public class StringPractice {
	public static void main(String args[]) {
	String a="Hello";
	String b="there";
	System.out.println(a.length());
	System.out.println(a.charAt(4));
	System.out.println(b.charAt(2));
	
	
	
	if(a=="Hello"){
		System.out.println("Printed ==hello");
	}
	if(!a.equals("hello")) {
		System.out.println("Printed equals hello");
		
	}
	
	if(b.equalsIgnoreCase("tHEre")){
		System.out.println("Printed there");
	}
	
	
	String c="hello Baburao,How are you?";
	int d=c.indexOf("How");
	System.out.println(d);
	int e=c.lastIndexOf("hello");
	System.out.println(e);

	}
}
