package book_study.exam02_basic_datastructure;

public class Exam09_PrimeNumber2 {
	
	// 소수가 아닌 짝수는 연산에서 제외 (버전 2)
	
	public static void main(String[] args) {
		int[] prime = new int[500];
		int count = 0;
		int num = 0;
		
		prime[num++] = 2;
		
		for(int i = 3; i < 1000; i += 2) {
			int n;
			for(n = 1; n < num; n++) {
				count++;
				if(i % prime[n] == 0) break;
			}
			if(n == num) prime[num++] = i;
		}
		
		for(int i = 0; i < num; i++) System.out.println(prime[i]);
		System.out.println("나눗셈 수행 횟수 : " + count);
	}
}
