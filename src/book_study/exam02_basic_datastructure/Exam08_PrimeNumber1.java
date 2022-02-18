package book_study.exam02_basic_datastructure;

public class Exam08_PrimeNumber1 {
	
	// 소수 구하는 원리
	
	public static void main(String[] args) {
		for(int i = 2; i <= 1000; i++) {
			int n;
			for(n = 2; n < i; n++) {
				if(i % n == 0) break;
			}
			if(i == n) System.out.println(i);
		}
	}
}
