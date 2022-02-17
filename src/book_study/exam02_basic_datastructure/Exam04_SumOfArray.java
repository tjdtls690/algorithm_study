package book_study.exam02_basic_datastructure;

import java.io.*;

public class Exam04_SumOfArray {
	
	// 배열 a의 요소의 합을 출력
	
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) sum += a[i];
		return sum;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("요솟수는 ： ");
		int num = Integer.parseInt(br.readLine());
		int[] a = new int[num];
		
		for(int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("전 요소의 합계 : " + sumOf(a));
	}
}
