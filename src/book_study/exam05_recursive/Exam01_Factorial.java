package book_study.exam05_recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam01_Factorial {
	
	// 재귀 메서드로 팩토리얼 구하기
	
	public static int factorial(int x) {
		if(x == 1)
			return x;
		return x * factorial(x - 1);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("정수입력 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.println(factorial(a));
	}
}
