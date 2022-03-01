package book_study.exam03_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam01_BinSearch {
	
	// 오름차순 배열에서 검색에 활용되는 이진검색
	
	static int binSearch(int[] a, int x, int ky) {
		int pl = 0;
		int pr = x - 1;
		
		while(pl <= pr) {
			int pc = (pl + pr) / 2;
			if(ky == a[pc]) {
				return pc;
			}else if(ky > a[pc]) {
				pl = pc + 1;
			}else {
				pr = pc - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("요솟수 : ");
		int x = Integer.parseInt(br.readLine());
		int[] a = new int[x];
		System.out.println("오름차순으로 입력하세요.");
		for(int i = 0; i < a.length; i++) {
			System.out.print("x[" + i + "] : ");
			a[i] = Integer.parseInt(br.readLine());
		}
		System.out.print("검색할 값 : ");
		int n = Integer.parseInt(br.readLine());
		
		int idx = binSearch(a, x, n);
		if(idx == -1) System.out.println("그 값의 요소가 없습니다.");
		else System.out.printf("%d은(는) x[%d]에 있습니다.", n, idx);
	}
}
