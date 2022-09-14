package practical_practice01.string;

import java.io.*;

	// 문자열 압축 (같은 문자가 연속으로 반복되는 경우 반복 문자 바로 오른쪽에 반복 횟수를
	// 표기하는 방법으로 문자열을 압축하라.

public class Exam11_StringCompression01 {
	public String solution(String s) {
		String answer = "";
		int check = 1;
		answer += s.charAt(0);
		
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				check++;
				continue;
			}

			if (check > 0) {
				answer += check;
				check = 1;
			}
			answer += s.charAt(i);
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Exam11_StringCompression01 T = new Exam11_StringCompression01();
		String str = br.readLine();
		System.out.println(T.solution(str));
	}
}
