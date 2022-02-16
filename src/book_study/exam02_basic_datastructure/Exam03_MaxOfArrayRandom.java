package book_study.exam02_basic_datastructure;

import java.util.*;

public class Exam03_MaxOfArrayRandom {
	
	// 배열의 요소의 최댓값을 출력  (요솟수와 값을 난수로 생성)
	
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) if(a[i] > max) max = a[i];
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("키의 최댓값을 구합니다.");
		Random rand = new Random();
		int[] a = new int[1+ rand.nextInt(10)];
		
		for(int i = 0; i < a.length; i++) a[i] = 100 + rand.nextInt(91);
		
		System.out.println("사람 수 : " + a.length);
		for(int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
		System.out.println("\n제일 큰 사람의 키 : " + maxOf(a) + "cm");
		
		
	}
}
