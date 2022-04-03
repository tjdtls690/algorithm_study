package book_study.exam05_recursive;

public class Exam07_RecurX2 {
	
	// recur(n-1);
	// System.out.println(n);
	// recur(n-2);
	// 위 과정을 비재귀적 으로 풀어서 쓴 코딩
	
	static void recur(int n) {
		IntStack s = new IntStack(n);
		
		while(true) {
			if(n > 0) { // 재귀 제거
				s.push(n); // 출력문 전의 recur(n-1) 메서드. -> 잠시 숫자를 푸시해서 저장 후 1의 숫자까지 먼저 내려가며 계속 push 
						   // (하향식 표에서 가장 왼쪽 밑에 위치한 함수로 먼저 내려가기)
				n = n - 1;	
				continue; // 재귀 함수의 맨 밑까지 먼저 내려가면서 push만 하고 출력은 0에 닿을때까지 하지 않게끔.
			}
			
			if(s.isEmpty() == false) { // 꼬리 재귀 제거
				n = s.pop();	// 잠시 저장된 숫자를 최근에 저장된 숫자부터 팝
				System.out.println(n);
				n = n - 2;		// n의 값을 n - 2로 업데이트 후 메서드의 시작지점으로 돌아가기. (n - 2)가 1이상인 경우 push, pop 후 출력
				continue;
			}
			break;
		}
	}
	
	public static void main(String[] arhs) {
		recur(4);
	}
}
