package LoopsPractice;

public class Practicealoop1 {
	
	public static void main(String args[]) {
		
		String str="we have large inventory of things in our warehouse falling in "
				+"the catagory:appeal and the slightly"
				+"more in demand catagory:makeup along with the catagory furniture and _.!";
		
		printCatagories(str);
		
		
	}

	public static void printCatagories(String string) {
		int i=0;
		while(true) {
			int found =string.indexOf("catagory:",+i);
			if(found== -1) break;
			int start=found +9;
			int end=string.indexOf(" ",start);
			System.out.println(string.substring(start,end));
			
			break;
		}
		
	}
}
