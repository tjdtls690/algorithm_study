package book_study.exam05_recursive;

public class Exam06_Recur {
	
	// 재귀 알고리즘 분석법
	// recur 메서드 하향식, 상향식 분석 방법
	
	static void recur(int n) {
		if(n > 0) {
			recur(n - 2);
			System.out.println(n);
			recur(n - 1);
		}
	}
	public static void main(String[] args) {
		recur(4);
	}
	
//	 	하향식 분석법 : 위에서부터 가지치듯 아래로 내려가기
//    	                               4
//                      2                              3
//           	0              1                1                2
//                         -1     0         -1     0          0     1
//		                                                        -1     0
//
//		상향식 분석법 : 조건이 n이 1 이상이어야만 실행이 되는 것이니 상향식은 매개변수 1부터 시작하면 된다.
//
//	recur(1) : recur(-1) 1 recur(0) : 1
//	recur(2) : recur(0) 2 recur(1) : 2 1
//	recur(3) : recur(1) 3 recur(2) : 1 3 21
//	recur(4) : recur(2) 4 recur(3) : 21 4 1321
	
}
