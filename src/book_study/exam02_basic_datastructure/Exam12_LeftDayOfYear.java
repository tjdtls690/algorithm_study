package book_study.exam02_basic_datastructure;

import java.io.*;

public class Exam12_LeftDayOfYear {
	
	// 연내의 남은 일 수를 구합니다.
	
	static int[][] mdays = {
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	static int isLeap(int y) {
		return (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) ? 1 : 0;
	}
	
	static int leftDayOfYear(int y, int m, int d) {
		d = mdays[isLeap(y)][m-1] - d;
		while(++m <= 12) d += mdays[isLeap(y)][m-1];
		return d;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int retry;
		do {
			System.out.println("연내의 남은 일 수를 구합니다.");
			System.out.print("년 : "); int year = Integer.parseInt(br.readLine());
			System.out.print("월 : "); int month = Integer.parseInt(br.readLine());
			System.out.print("일 : "); int day = Integer.parseInt(br.readLine());
			System.out.printf("연내의 남은 일 수는 %d일입니다.\n", leftDayOfYear(year, month, day));
			
			
			System.out.print("한번 더 할까요? (1.예/0.아니오) ： ");
			retry = Integer.parseInt(br.readLine());
		}while(retry == 1);
	}
}
