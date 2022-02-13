package book_study.exam01_basic_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam08_doWhile {
	
	// 큰 수에서 작은 수 빼기.
	
	static int doWhile(int a, int b) {
		
		return b-a;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int b;
		do {
			System.out.print("a의 값 : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("b의 값 : ");
			b = Integer.parseInt(br.readLine());
		}while(b < a);
		System.out.println("큰 수에서 작은수 빼기 : " + doWhile(a, b));
	}
}
