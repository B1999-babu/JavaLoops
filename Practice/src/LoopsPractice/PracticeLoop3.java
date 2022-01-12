package LoopsPractice;

public class PracticeLoop3 {

	public static void main(String args[]) {
		int Counter=0;
		  for(int i=0; i<=100; i++) {
			for(int j=0; j<30; j++) {  
			  Counter++;
			  System.out.println("i: "+i+"-----"+j);
		  }
	}

		  System.out.println("Total no of printed: "+Counter);
	}
}