package book_study.exam04_stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam01_02_intStackProgram {
	
	private static Exam01_01_intStack is = new Exam01_01_intStack(10);	// 최대 10개를 푸시할 수 있는 스택
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void push() throws IOException{
		System.out.print("데이터 : ");
		int su = Integer.parseInt(br.readLine());
		is.push(su);
	}
	
	public static void pop() {
		System.out.printf("팝한 데이터는 %d입니다.\n\n", is.pop());
	}
	
	public static void peek() {
		System.out.printf("피크한 데이터는 %d입니다.\n\n", is.peek());
	}
	
	public static void dump() {
		is.dump();
	}
	
	public static void indexOf() throws IOException{
		System.out.print("인덱스를 찾을 값 : ");
		int x = Integer.parseInt(br.readLine());
		int check = is.indexOf(x);
		if(check != -1) System.out.printf("%d는 %d 인덱스에 위치합니다.\n\n", x, check);
		else System.out.println("찾으시려는 값이 존재하지 않습니다.\n");
	}
	
	public static void clear() {
		is.clear();
		System.out.println("스택을 성공적으로 비웠습니다.\n");
	}
	
	public static void capacity() {
		System.out.printf("스택의 총 용량은 %d입니다.\n\n", is.capacity());
	}
	
	public static void size() {
		System.out.printf("현재 스택의 데이터 수는 %d개 입니다.\n\n", is.size());
	}
	
	public static void isEmpty() {
		boolean check = is.isEmpty();
		if(check == true) System.out.println("현재 스택은 비어있습니다.\n");
		else System.out.println("현재 스택은 비어있지 않습니다.\n");
	}
	
	public static void isFull() {
		boolean check = is.isFull();
		if(check == true) System.out.println("현재 스택은 가득 찬 상태입니다.\n");
		else System.out.println("현재 스택은 가득 차있지 않습니다.\n");
	}
	
	public static void main(String[] args) throws IOException{
		boolean isStop = false;
		
		while(!isStop) {
			System.out.printf("현재 데이터 수 : %d/%d\n", is.getPtr(), is.getMax());
			System.out.println("(1) 푸시 (2) 팝 (3) 피크 (4) 전체 데이터 확인 (5) 인덱스 (6) 스택비우기 \n"
					+ "(7) 스택용량 (8) 현재 스택 데이터 수 (9) 스택 데이터 유무 \n"
					+ "(10) 스택 가득 차있는지 여부 (0) 종료 : ");
			int choice = Integer.parseInt(br.readLine());
			switch(choice) {
			case 1 : push(); break;
			case 2 : pop(); break;
			case 3 : peek(); break;
			case 4 : dump(); break;
			case 5 : indexOf(); break;
			case 6 : clear(); break;
			case 7 : capacity(); break;
			case 8 : size(); break;
			case 9 : isEmpty(); break;
			case 10: isFull(); break;
			case 0 : isStop = true; break;
			}
		}
		
	}
}
