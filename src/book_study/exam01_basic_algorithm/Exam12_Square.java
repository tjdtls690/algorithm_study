package book_study.exam01_basic_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam12_Square {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정사각형의 한 변의 길이 : ");
		int a = Integer.parseInt(br.readLine());
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) System.out.print("*");
			System.out.println();
		}
	}
}
