package practical_practice01.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	// 다른 문자를 제외한 알파벳만 따졌을 때 회문이 맞는가??

public class Exam08_AlphabetPalindrome01 {
	
	// 팰린드롬 : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열.

	public String solution(String str) {
		int lt = 0, rt = str.length() - 1;
		while (lt < rt) {
			if (!(Character.isAlphabetic(str.charAt(lt))))
				lt++;
			else if (!(Character.isAlphabetic(str.charAt(rt))))
				rt--;
			else if (str.charAt(lt) != str.charAt(rt))
				return "NO";
			else {
				lt++;
				rt--;
			}
		}
		return "YES";
	}

	public static void main(String[] args) throws IOException {
		Exam08_AlphabetPalindrome01 T = new Exam08_AlphabetPalindrome01();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 입력 : ");
		String str = br.readLine().toUpperCase();
		System.out.println("알파벳만 따졌을 시 회문인지 여부 : " + T.solution(str));
	}
}
