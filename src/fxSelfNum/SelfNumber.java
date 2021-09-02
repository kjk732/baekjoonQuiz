package fxSelfNum;

public class SelfNumber {

	public static void main(String[] args) {
		
		System.out.println(selfNum(51));
		
		
		
	}
	
	public static int selfNum(int d) {
			int n = d;
		for( int i = 1 ; d/i < 1 ; i *= 10) {
			
			n -= d / i;
			
		}	
		
		return n;
	}

}
