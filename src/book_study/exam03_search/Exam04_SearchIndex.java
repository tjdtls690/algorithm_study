package book_study.exam03_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam04_SearchIndex {
	
	static int searchIdx(int[]a, int n, int ky, int[] b) {
		int check = -1;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == ky) b[++check] = i;
		}
		return ++check;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a; // 요소 저장 배열
		int[] b; // 요소 인덱스 저장 배열
		int ky; // 키값
		int n; // 요솟수 길이
		
		System.out.print("요솟수 : ");
		n = Integer.parseInt(br.readLine());
		a = new int[n];
		b = new int[n];
		for(int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] : ", i);
			a[i] = Integer.parseInt(br.readLine());
		}
		System.out.print("검색할 키값 : ");
		ky = Integer.parseInt(br.readLine());
		int reNum = searchIdx(a, n, ky, b);
		
		System.out.print("키값과 일치하는 수의 인덱스 : ");
		for(int i = 0; i < reNum; i++) System.out.print(b[i] + " ");
		System.out.printf("\n키값의 갯수 : %d", reNum);
	}
}
