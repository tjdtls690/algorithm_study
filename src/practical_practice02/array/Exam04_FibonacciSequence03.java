package practical_practice02.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	// 입력한 수만큼 피보나치 수열 출력
	// 배열을 썼을 경우
	// 손코딩으로 배열을 쓰지 말고 풀어보라고 할 경우
	// 02번보다 if문 제외하고 더 간단하게 코드 다듬기

public class Exam04_FibonacciSequence03 {
	public void solution(int su){
		int a = 1, b = 1, c;
		System.out.print(a + " " + b + " ");
		for(int i = 2; i < su; i++){
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Exam04_FibonacciSequence03 T = new Exam04_FibonacciSequence03();
		int su = Integer.parseInt(br.readLine());
		T.solution(su);
	}
}
