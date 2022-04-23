package practical_practice01.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

	// 문자열 속 중복문자 제거

public class Exam06_RemoveDuplicateCharacter01 {
	public String solution(char[] ch) {
		List<Character> li = new ArrayList<Character>();
		for (int i = 0; i < ch.length; i++) {
			int check = 0;
			for (int j = 0; j < li.size(); j++) {
				if (ch[i] == li.get(j)) {
					check++;
					break;
				}
			}
			if (check == 0)
				li.add(ch[i]);
		}
		String answer = "";
		for (char ch1 : li)
			answer += ch1;
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 입력 : ");
		char[] ch = br.readLine().toCharArray();
		Exam06_RemoveDuplicateCharacter01 T = new Exam06_RemoveDuplicateCharacter01();
		System.out.println("중복 문자 제거 후 결과 : " + T.solution(ch));
	}
}
