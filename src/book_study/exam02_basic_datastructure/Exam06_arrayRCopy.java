package book_study.exam02_basic_datastructure;

import java.io.*;

public class Exam06_arrayRCopy {
	
	// 배열 b의 모든 요소를 배열 a에 역순 복사
	
	static void print(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
		System.out.println();
		for(int i = 0; i < b.length; i++) System.out.print(b[i] + " ");
	}
	
	static void rCopy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for(int i = 0; i < num; i++) a[i] = b[b.length-1-i];
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("a의 요솟수 : ");
		int[] a = new int[Integer.parseInt(br.readLine())];
		for(int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.print("\nb의 요솟수 : ");
		int[] b = new int[Integer.parseInt(br.readLine())];
		for(int i = 0; i < b.length; i++) {
			System.out.print("b[" + i + "] = ");
			b[i] = Integer.parseInt(br.readLine());
		}
		
		rCopy(a, b);
		print(a, b);
		
	}
}
