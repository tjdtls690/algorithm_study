package book_study.exam01_basic_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam14_StarPira {
	
	// 기호문자 *로 피라미드를 출력함
	
	static void spira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < n - i; j++) System.out.print(" ");
			for(int j = 0; j < i * 2 - 1; j++) System.out.print("*");
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("피라미드 모양으로 나타냅니다.");
		int n;
		do {
			System.out.print("단수는 ： ");
			n = Integer.parseInt(br.readLine());
		}while(n <= 0);
		spira(n);
	}
}
