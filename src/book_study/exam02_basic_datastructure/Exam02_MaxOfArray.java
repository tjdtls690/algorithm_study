package book_study.exam02_basic_datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam02_MaxOfArray {
	
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) if(a[i] > max) max = a[i];
		return max;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = Integer.parseInt(br.readLine());
		int[] a = new int[num];
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(i + 1 + "번째 사람의 키 : ");
			a[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("제일 큰 사람의 키 : " + maxOf(a) + "cm");
	}
}
