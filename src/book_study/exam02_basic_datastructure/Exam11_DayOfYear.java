package book_study.exam02_basic_datastructure;

import java.io.*;

public class Exam11_DayOfYear {
	
	// 그 해 경과 일수를 구함
	
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	static int isLeap(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0;
	}
	
	static int dayOfYear(int year, int month, int day) {
		month--;
		while(--month >= 0) day += mdays[isLeap(year)][month];
		return day;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int retry;
		do {
			System.out.println("그 해 경과 일 수를 구합니다.");
			System.out.print("년 : "); int year = Integer.parseInt(br.readLine());
			System.out.print("월 : "); int month = Integer.parseInt(br.readLine());
			System.out.print("일 : "); int day = Integer.parseInt(br.readLine());
			System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));
			
			
			System.out.print("한번 더 할까요? (1.예／0.아니오）： ");
			retry = Integer.parseInt(br.readLine());
		}while(retry == 1);
	}
}
