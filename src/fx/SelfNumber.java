package fx;

public class SelfNumber {

	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001]; // 1부터  10000까지
		
		for (int i = 1 ; i < 10000 ; i++) {
			int num = selfNum(i);
			
			if(num < 10001)
				check[num] = true;
			
		}
	
	
		
		for (int i = 1; i < 10001; i++) {
			if (!check[i]) 	// false 인 인덱스만 출력
				System.out.println(i);
			}
	}
		
	public static int selfNum(int n) {
			int d = n;
		while(n != 0) {
			
			d += n %10;
			n /= 10;
			
		}
		
		return d;
	}

}
