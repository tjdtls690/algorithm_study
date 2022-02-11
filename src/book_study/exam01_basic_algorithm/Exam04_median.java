package book_study.exam01_basic_algorithm;

import java.io.*;

public class Exam04_median {
	
	// a, b, c의 중앙값을 구하여 반환 
	
	static int med3(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) return b;
			else if(a > c) return c;
			else return a;
		}else if(a > c) return a;
		else if(b > c) return c;
		else return b;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("a의 값 : "); int a = Integer.parseInt(br.readLine());
			System.out.println("b의 값 : "); int b = Integer.parseInt(br.readLine());
			System.out.println("c의 값 : "); int c = Integer.parseInt(br.readLine());
			System.out.println("중앙 값 : " + med3(a,b,c));
		}
		
	}
	
	static int med34(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) return b;
			else if(a > c) return c;
			else return a;
		}else if(a > c) return a;
		else if(b > c) return c;
		else return b;
		
	}
}
