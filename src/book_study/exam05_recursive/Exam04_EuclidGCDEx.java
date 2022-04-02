package book_study.exam05_recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam04_EuclidGCDEx {
	
	static int gcd(int x, int y) {
		while(y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("두 수의 최대공약수를 구합니다.");
		System.out.print("정수 입력 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("정수 입력 : ");
		int b = Integer.parseInt(br.readLine());
		System.out.println(gcd(a, b));
	}
}
