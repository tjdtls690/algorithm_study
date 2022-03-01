package book_study.exam02_basic_datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 년월일을 입력받아 n일 뒤, 후 의 날짜를 반환받는 클래스

public class Exam15_YMD {
	
	int y;
	int m;
	int d;
	
	public Exam15_YMD() {} // 기본 생성자
	
	public Exam15_YMD(int y, int m, int d) { // 필드 저장 생성자 
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  // 윤년
	};
	
	static int isLeap(int y) { // 윤년, 평년 판단
		return (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) ? 1 : 0;
	}
	
	Exam15_YMD after(int n) { // n일 후의 날짜 구하기
		if(n < 0) before(-n);
		Exam15_YMD d1 = new Exam15_YMD(y, m, d);
		d1.d += n;
		while(d1.d > mdays[isLeap(d1.y)][d1.m - 1]) {
			d1.d -= mdays[isLeap(d1.y)][d1.m - 1];
			if(++d1.m > 12) {
				d1.m = 1;
				d1.y++;
			}
		}
		return d1;
	}
	
	Exam15_YMD before(int n) { // n일 전의 날짜 구하기
		if(n < 0) after(-n);
		Exam15_YMD d1 = new Exam15_YMD(y, m, d);
		d1.d -= n;
		while(d1.d < 1) {
			if(--d1.m < 1) {
				d1.m = 12;
				d1.y--;
			}
			d1.d += mdays[isLeap(d1.y)][d1.m - 1];
		}
		return d1;
	}
	
	void print(Exam15_YMD af, Exam15_YMD be, int n) { // 결과값 출력
		System.out.printf("%d일 후의 날짜는 %d년 %d월 %d일 입니다.\n", n, af.y, af.m, af.d);
		System.out.printf("%d일 전의 날짜는 %d년 %d월 %d일 입니다.\n", n, be.y, be.m, be.d);
	}
	
	public void startProgram() { // 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Exam15_YMD d1 = null;
		int y = 0, m = 0, d = 0, n = 0;
		try {
			while(y < 1) {
				System.out.println("날짜를 입력하세요.");
				System.out.print("년 (1 ~ ): ");
				y = Integer.parseInt(br.readLine());
			}
			while(m < 1 || m > 12) {
				System.out.print("월 (1 ~ 12): ");
				m = Integer.parseInt(br.readLine());
			}
			while(d < 1 || d > 31) {
				System.out.print("일 (1 ~ 31): ");
				d = Integer.parseInt(br.readLine());
			}
			d1 = new Exam15_YMD(y, m, d);
			System.out.print("몇 일 앞뒤의 날짜를 구할까요?? : ");
			n = Integer.parseInt(br.readLine());
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		d1.print(d1.after(n), d1.before(n), n);
	}
	
	public static void main(String[] args) {
		Exam15_YMD d1 = new Exam15_YMD();
		d1.startProgram();
	}
}
