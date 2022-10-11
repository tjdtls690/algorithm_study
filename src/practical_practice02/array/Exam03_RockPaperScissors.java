package practical_practice02.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

	// 가위 바위 보
	// a가 이기면 A, b가 이기면 'B', 무승부면 'D' 를 출력

public class Exam03_RockPaperScissors {
	public char[] solution(int[] a, int[] b){
		char[] answer = new char[a.length];
		
		for(int i = 0; i < a.length; i++){
			if(a[i] - b[i] == 1 || a[i] - b[i] == -2) answer[i] = 'A';
			else if(a[i] == b[i]) answer[i] = 'D';
			else answer[i] = 'B';
		}

		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Exam03_RockPaperScissors T = new Exam03_RockPaperScissors();
		int tmp = Integer.parseInt(br.readLine());
		StringTokenizer str1 = new StringTokenizer(br.readLine());
		StringTokenizer str2 = new StringTokenizer(br.readLine());
		int[] a = new int[tmp];
		int[] b = new int[tmp];
		for(int i = 0; str1.hasMoreTokens(); i++){
			a[i] = Integer.parseInt(str1.nextToken());
			b[i] = Integer.parseInt(str2.nextToken());
		}
		for(char c : T.solution(a, b)) System.out.println(c);
	}

}
