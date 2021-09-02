package fx;

import java.util.Scanner;

public class HanNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		System.out.println(hanNum(n));

	}
public static int hanNum(int N) {
	int cnt = 0;
	
	if(N < 100)
		return N;
	
	else {
		cnt = 99;
		
		for ( int i = 100 ; i <= 1000 ; i++) {
			int hun = i / 100;
			int ten = (i / 10) % 10;
			int one = i % 10;
			
			if(i<=999) {
				if( (hun-ten) == (ten-one)) {
					cnt++;
				}
				
			}
			
		}
	}
	
	
	return cnt;
	}
}