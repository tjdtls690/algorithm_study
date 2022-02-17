package book_study.exam02_basic_datastructure;

import java.io.*;

public class Exam05_arrayCopy {
	
	// 배열 b의 모든 요소를 배열 a에 복사함
	
	static void print(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
		System.out.println();
		for(int i = 0; i < b.length; i++) System.out.print(b[i] + " ");
		
	}
	
	static void copy(int[] a, int[] b) {
		int length = a.length <= b.length ? a.length : b.length;
		for(int i = 0; i < length; i++) a[i] = b[i];
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("a의 요솟수 ： ");
		int[] a = new int[Integer.parseInt(br.readLine())];
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = ");
			a[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.print("b의 요솟수 ： ");
		int[] b = new int[Integer.parseInt(br.readLine())];
		for(int i = 0; i < b.length; i++) {
			System.out.print("b[" + i + "] = ");
			b[i] = Integer.parseInt(br.readLine());
		}
		copy(a, b);
		print(a, b);
	}
}
