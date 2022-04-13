package practical_practice01.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	// 대문자는 소문자로, 소문자는 대문자로 변환

public class Exam02_CaseConversion02 {

	// toCharArray() : 문자열을 char형 배열로 반환

	public String solution(String str) {
		String str1 = "";
		for (char ch : str.toCharArray()) {
			if (ch > 96)
				str1 += (char) (ch - 32);
			else
				str1 += (char) (ch + 32);
		}
		return str1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Exam02_CaseConversion02 m = new Exam02_CaseConversion02();
		System.out.print("문자열 입력 : ");
		String str = br.readLine();
		System.out.println("변환 완료 값 : " + m.solution(str));
	}
}
