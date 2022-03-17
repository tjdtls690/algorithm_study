package book_study.exam05_recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam03_EuclidGCD {
	
	// 유클리드 호제법 증명은 너무 어렵다.
	// 그러나 직사각형의 각 변으로 구하는 원리만 알고 있자.
	
	// 두 수의 최대 공약수를 재귀 메서드로 구하기.
	
	static int gcd(int x, int y) {
		if(y == 0)
			return x;
		else 
			return gcd(y, x % y);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("두 정수의 최대 공약수를 구합니다.");
		System.out.println("정수 입력 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("정수 입력 : ");
		int b = Integer.parseInt(br.readLine());
		System.out.println(gcd(a, b));
	}
}
