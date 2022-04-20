package practical_practice01.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 특정 문자(알파벳)만 골라서 역순으로 정렬

public class Exam05_ReverseAlphabetOrder02 {
	// Character.isAlphabetic(ch[lt]) : char형 변수인 ch[lt] 가 알파벳이 맞냐??

	public String solution(char[] ch) {
		int lt = 0;
		int rt = ch.length - 1;
		while (lt < rt) {
			if (!Character.isAlphabetic(ch[lt]))
				lt++;
			else if (!Character.isAlphabetic(ch[rt]))
				rt--;
			else {
				char temp = ch[lt];
				ch[lt] = ch[rt];
				ch[rt] = temp;
				lt++;
				rt--;
			}
		}
		String answer = new String(ch);
		return answer;
	}

	public static void main(String[] args) throws IOException {
		Exam05_ReverseAlphabetOrder02 T = new Exam05_ReverseAlphabetOrder02();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 입력 : ");
		char[] ch = br.readLine().toCharArray();
		System.out.println("알파벳만 역순으로 뒤집은 결과 : " + T.solution(ch));
	}
}
