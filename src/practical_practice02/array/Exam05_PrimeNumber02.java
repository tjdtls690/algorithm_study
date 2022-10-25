package practical_practice02.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	// 소수 구하기 (에라토스테네스 체 사용) => 성능 향상
	// 에라토스테네스 체 : 
	// 1. 입력받은 숫자의 인덱스 까지의 int 형 배열 생성
	// 2. for문으로 i가 2부터 시작하여 인덱스가 i인 값이 0일 때 answer++;
	// 3. i의 배수가 인덱스인 값을 1로 변환

public class Exam05_PrimeNumber02 {
	public int solution(int su){
		int answer = 0;
		int[] check = new int[su + 1];
		for(int i = 2; i <= su; i++) {
			if(check[i] == 0) answer++;
			for(int j = i; j <= su; j += i) check[j] = 1;
		}
		
		return answer;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Exam05_PrimeNumber02 T = new Exam05_PrimeNumber02();
		int su = Integer.parseInt(br.readLine());
		System.out.print(T.solution(su));
	}
}
