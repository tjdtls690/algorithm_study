package practical_practice01.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

	// 문장 속 단어들 중 가장 긴 단어 추출

public class Exam03_TheLongestWord {

	// new StringTokenizer : 문자열에서 단어 구분짓기 (기본값 : 띄어쓰기로 구분)
	// hasMoreTokens() : 다음 문자열(인덱스) 가 존재하냐
	// nextToken() : 다음 문자열(인덱스) 를 반환

	public String solution(StringTokenizer str) {
		String answer = "";

		while (str.hasMoreTokens()) {
			String temp = str.nextToken();
			if (answer.length() < temp.length())
				answer = temp;
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		Exam03_TheLongestWord T = new Exam03_TheLongestWord();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 입력 : ");
		StringTokenizer str = new StringTokenizer(br.readLine());
		System.out.println("문자열 중 가장 긴 단어 : " + T.solution(str));
	}
}
