package book_study.exam01_basic_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam09_Negative {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a;
		
		do {
			System.out.print("a의 값 : ");
			a = Integer.parseInt(br.readLine());
		}while(a <= 0);
		
		int check = 1;
		for(int i = 10; i <= a; i *= 10) check++;
		System.out.println("a의 자릿수는 " + check + "자리 입니다.");
	}
}
