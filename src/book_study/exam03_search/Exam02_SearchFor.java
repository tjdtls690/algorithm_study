package book_study.exam03_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam02_SearchFor {
	// 요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색합니다.
	
	static int seqSearch(int[] x, int ky) {
		for(int i = 0; i < x.length; i++) if(x[i] == ky) return i;
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
		else System.out.printf("%d은(는) x[%d]에 있습니다.\n", ky, idx);
	}
}
