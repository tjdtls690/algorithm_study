package practical_practice01.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	// 입력받은 문자열이 회문 문자열이 맞는지 여부를 알아보기.
	// 대소문자 구분하지 않음

public class Exam07_PalindromeString02 {
	public String solution(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) return "NO";
		}
		return "YES";
	}

	public static void main(String[] args) throws IOException {
		Exam07_PalindromeString02 T = new Exam07_PalindromeString02();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 입력 : ");
		String str = br.readLine().toUpperCase();
		System.out.println("회문 문자열이 맞는가? : " + T.solution(str));
	}
}
