package book_study.exam05_recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam05_GCDArray {
	
	// 배열 arr의 모든 요소의 최대 공약수를 구하는 메서드
	
//	static int gcd(int x, int y) {	// 재귀적 최대 공약수 구하기
//		if(y == 0)
//			return x;
//		else
//			return gcd(y, x % y);
//	}
	
	static int gcd(int x, int y) { // 비재귀적 최대 공약수 구하기
		while(y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}
	
	static int gcdArray(int[] arr, int start, int no) { 
		if(no == 1)		// 애초부터 배열의 길이를 1로 정했을 시 바로 하나의 요소를 리턴시키기.
			return arr[start];
		if(no == 2)	// 배열의 맨 마지막 두 요소에 접근 완료 시 재귀 루프 멈추고 차례대로 공약수 구하기 시작
			return gcd(arr[start], arr[start + 1]); 
		else
			return gcd(arr[start], gcdArray(arr, start + 1, no -1)); // 배열의 모든 요소중 맨 마지막 두개의 요소부터 차례대로 두개씩 공약수를 구해나가기.
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("배열의 모든 요소의 최대공약수 구하기.");
		System.out.print("요솟수 : ");
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : ", i);
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println(gcdArray(arr, 0, n));
	}
}
