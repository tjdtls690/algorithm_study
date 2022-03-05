package book_study.exam03_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam03_SeqSearchEx {
	
	// 요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색합니다.
	// 출력문을 선형 검색 스캐닝 과정을 상세하게 출력하도록 만들기. 
	
	static int seqSearch(int[] x, int ky) {
		System.out.print("   |");
		for(int i = 0; i < x.length; i++) System.out.printf("%3d", i);
		System.out.print("\n---+");
		for(int i = 0; i < x.length; i++) System.out.print("---");
		System.out.println();
		
		
		
		for(int i = 0; i < x.length; i++) {
			System.out.print("   |");
			for(int j = 0; j < i; j++) System.out.print("   ");
			System.out.println("  *");
			
			System.out.printf("%3d|", i);
			for(int j = 0; j < x.length; j++) System.out.printf("%3d", x[j]);
			if(x[i] == ky) {
				System.out.println();
				return i;
			}
			System.out.println("\n   |");
		}
		return -1;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("요솟수 : ");
		int num = Integer.parseInt(br.readLine());
		int[] x = new int[num];
		for(int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = Integer.parseInt(br.readLine());
		}
		System.out.print("검색할 값 입력 : ");
		int ky = Integer.parseInt(br.readLine());
		int idx = seqSearch(x, ky);
		if(idx == -1) System.out.println("그 값의 요소가 없습니다.");
		else System.out.printf("  %d은(는) x[%d]에 있습니다.\n", ky, idx);
	}
}
