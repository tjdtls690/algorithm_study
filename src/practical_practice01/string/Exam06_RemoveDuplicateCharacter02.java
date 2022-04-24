package practical_practice01.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 속 중복문자 제거

public class Exam06_RemoveDuplicateCharacter02 {
	// indexOf(str.charAt(i)) : str.charAt(i) 가 문자열 안에서 존재 한다면 왼쪽에서 몇번째 위치에 존재하냐??
	// 여러개가 존재해도 제일 첫번째 위치한 인덱스 값만 반환

	public String solution(String str) {
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			if (i == str.indexOf(str.charAt(i)))
				answer += str.charAt(i);
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 입력 : ");
		String str = br.readLine();
		Exam06_RemoveDuplicateCharacter02 T = new Exam06_RemoveDuplicateCharacter02();
		System.out.println("중복 문자 제거 후 결과 : " + T.solution(str));
	}
}
