package practical_practice01.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	// 입력받은 문자열이 회문 문자열이 맞는지 여부를 알아보기.
	// 대소문자 구분하지 않음.

public class Exam07_PalindromeString01 {
	public String solution(String str) {
		int lt = 0;
		int rt = str.length() - 1;
		int check = 0;
		while (lt < rt) {
			if (str.charAt(lt) != str.charAt(rt)) {
				check++;
				break;
			}
			lt++;
			rt--;
		}
		if (check == 0)
			return "YES";
		else
			return "NO";
	}

	public static void main(String[] args) throws IOException {
		Exam07_PalindromeString01 T = new Exam07_PalindromeString01();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 입력 : ");
		String str = br.readLine().toUpperCase();
		System.out.println("회문 문자열이 맞는가? : " + T.solution(str));
	}
}
