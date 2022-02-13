package book_study.exam01_basic_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam07_SumMed {
	
	static int sumof(int a, int b) {
		
		if(b < a) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		int sum = 0;
		for(int i = a; i <= b; i++) sum += i;
		return sum;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("a와 b를 포함하여 그 사이의 모든 정수의 합을 구합니다.");
		System.out.print("a의 값 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("b의 값 : ");
		int b = Integer.parseInt(br.readLine());
		System.out.println("정수 a, b 사이의 모든 정수의 합은 " + sumof(a, b) + "입니다.");
	}
}
