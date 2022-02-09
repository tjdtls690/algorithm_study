package book_study.exam01_basic_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam02_min3 {
	
	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		return min;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print("세 정수의 최솟값을 구합니다. ");
			int a = Integer.parseInt(br.readLine());
			System.out.print("a의 값： ");
			int b = Integer.parseInt(br.readLine());
			System.out.print("b의 값：");
			int c = Integer.parseInt(br.readLine());
			System.out.println("c의 값：" + min3(a,b,c));
		}
	}

}
