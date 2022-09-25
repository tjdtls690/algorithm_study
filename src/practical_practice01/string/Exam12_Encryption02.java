package practical_practice01.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	//'#'과 '*'로 이루어진 암호문을 이진수화, 10진수화, 아스키번호의 문자화로 복호화하시오.
	// ex) #****## --> 1000011 --> 67 --> 'C'
	// 첫 줄에는 보낸 문자의 개수(10을 넘지 않습니다)가 입력된다. 
	// 다음 줄에는 문자의 개수의 일곱 배 만큼의 #또는 * 신호가 입력됩니다.
public class Exam12_Encryption02 {
	
	// replace(a, b) : a를 b로 대체하라
	// Integer.parseInt(a, b) : a를 숫자로 바꾸고 b진수로 여겨서 10진수를 반환하라.
	
	public String solution(String s, int su) {
		String answer = "";
		for (int i = 0; i < su; i++) {
			String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
			answer += (char) Integer.parseInt(tmp, 2);
			s = s.substring(7);
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Exam12_Encryption02 T = new Exam12_Encryption02();
		int su = Integer.parseInt(br.readLine());
		String str = br.readLine();
		System.out.println(T.solution(str, su));
	}
}
