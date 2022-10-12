package practical_practice02.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	// 입력한 수만큼 피보나치 수열 출력
	// 배열을 썼을 경우

public class Exam04_FibonacciSequence01 {
	public int[] solution(int su){
		int[] answer = new int[su];
		
		answer[0] = 1;
		answer[1] = 1;
		for(int i = 2; i < answer.length; i++) answer[i] = answer[i - 1] + answer[i - 2];
		

		return answer;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Exam04_FibonacciSequence01 T = new Exam04_FibonacciSequence01();
		int su = Integer.parseInt(br.readLine());
		for(int i : T.solution(su)) System.out.print(i + " ");
	}
}
