package book_study.exam05_recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam02_FactorialEx {
	
	// 재귀 메서드 쓰지 않고 factorial 메서드 구현
	
	public static int factorial(int x) {
		int fac = 1;
		for(int i = 2; i <= x; i++) fac *= i;
		
		return fac;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("정수 입력 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.println(factorial(a));
	}
}
