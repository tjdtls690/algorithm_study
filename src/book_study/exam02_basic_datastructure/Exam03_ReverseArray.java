package book_study.exam02_basic_datastructure;

import java.util.*;

public class Exam03_ReverseArray {
	
	// 배열 요솟값을 읽어 들여 역순으로 정렬
	
	static void print(int[] a) {
		for(int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
		System.out.println();
	}
	
	static void swap(int[] a, int index1, int index2) {
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}
	
	static void reverse(int[] a) {
		print(a);
		for(int i = 0; i < a.length/2; i++) {
			System.out.println(a[i] + "과(와) " + a[a.length-i-1] + "을(를) 교환합니다.");
			swap(a, i, a.length-i-1);
			print(a);
		}
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		int[] a = new int[1 + rand.nextInt(10)];
		System.out.println("사람 수 : " + a.length);
		
		for(int i = 0; i < a.length; i++) a[i] = rand.nextInt() % 201;
		reverse(a);
		System.out.println("역순 정렬을 마쳤습니다.");
	}
}
