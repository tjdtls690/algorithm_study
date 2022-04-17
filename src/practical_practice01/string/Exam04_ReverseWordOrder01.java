package practical_practice01.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	// 단어를 역순으로 뒤집기.

public class Exam04_ReverseWordOrder01 {
	public String[] solution(String[] str) {
		for (int i = 0; i < str.length; i++) {
			String temp = "";
			for (int j = str[i].length() - 1; j >= 0; j--)
				temp += str[i].charAt(j);
			str[i] = temp;
		}

		return str;
	}

	public static void main(String[] args) throws IOException {
		Exam04_ReverseWordOrder01 T = new Exam04_ReverseWordOrder01();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("입력할 단어의 갯수 입력 : ");
		String[] str = new String[Integer.parseInt(br.readLine())];
		for (int i = 0; i < str.length; i++) {
			System.out.printf("%d번째 단어 입력 : ", i+1);
			str[i] = br.readLine();
		}
		String[] str1 = T.solution(str);
		for (int i = 0; i < str.length; i++) {
			System.out.printf("%d번째 단어 역순 : %s\n", i+1, str1[i]);
			// System.out.printf("%d번째 단어 역순 : %s\n", i+1, T.solution(str));
			// 주석 처리 된 코드는 메서드가 계속 반복 실행 되면서 짝수번째 단어들이
			// 역순으로 됐다가 다시 역순 처리되어 처음으로 돌아와버리는 현상이 발생하기에
			// 오답이다.
		}
	}
}
