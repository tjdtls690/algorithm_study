package book_study.exam03_search;

import java.io.*;
import java.util.Arrays;

public class Exam07_BinarySearchTesterEx {
	// Arrays.binarySearch에 의한 이진검색(실패할 때 삽입 포인트를 나타냄)
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num;
		int key;
		
		System.out.print("요솟수 : ");
		int n = Integer.parseInt(br.readLine());
		num = new int[n];
		
		System.out.println("오름차순으로 입력하세요.");
		for(int i = 0; i < num.length; i++) {
			System.out.printf("num[%d] : ", i);
			num[i] = Integer.parseInt(br.readLine());
		}
		System.out.print("검색할 값 : ");
		key = Integer.parseInt(br.readLine());
		int idx = Arrays.binarySearch(num, key);
		if(idx < 0) System.out.print("삽입포인트 : " + (- idx - 1));
		else System.out.printf("%d은(는) num[%d]에 있습니다.", key, idx);
	}
}
