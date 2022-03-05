package book_study.exam03_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam05_BinSearchEx {
	
	static int binSearch(int[] num, int pl, int pr, int ky) {
		
		System.out.printf("   |%3d", 0);
		for(int i = 1; i < num.length; i++) System.out.printf("%4d", i);
		System.out.print("\n---+");
		for(int i = 0; i < (num.length - 1) * 4 + 3; i++) System.out.print("-");
		System.out.println();
		
		while(pl <= pr) {
			int pc = (pl + pr) / 2;
			
			if(pr - pl > 1) System.out.printf(String.format("   |%%%ds%%%ds%%%ds\n", pl * 4 + 4, (pc - pl) * 4 - 1 , (pr - pc) * 4), "<-", "+", "->");
			else System.out.printf(String.format("   |%%%ds\n", pc * 4 + 3), "+");
			System.out.printf("%3d|%3d", pc, num[0]);
			for(int i = 1; i < num.length; i++) System.out.printf("%4d", num[i]);
			System.out.println();
			if(pl != pr) System.out.println("   |");
			
			if(num[pc] == ky) {
				return pc;
			}else if(num[pc] > ky) {
				pr = pc - 1;
			}else {
				pl = pc + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pl = 0; // 검색 범위의 첫 인덱스
		int pr; // 검색 범위의 마지막 인덱스
		int[] num; // 요소 배열
		int ky; // 검색할 키 값
		int idx; // 키값의 인덱스
		
		System.out.print("요솟수 : ");
		int n = Integer.parseInt(br.readLine());
		num = new int[n];
		pr = n - 1;
		
		System.out.println("오름차순으로 숫자 입력");
		for(int i = 0; i < num.length; i++) {
			System.out.printf("num[%d] : ", i);
			num[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.print("검색할 키 값 : ");
		ky = Integer.parseInt(br.readLine());
		
		idx = binSearch(num, pl, pr, ky);
		if(idx == -1) System.out.println("\n찾으려는 값이 없습니다.");
		else System.out.printf("\n%d는 num[%d]에 있습니다.", ky, idx);
	}
}
