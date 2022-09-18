package practical_practice01.string;

import java.io.*;

	// 문자열 압축 (같은 문자가 연속으로 반복되는 경우 반복 문자 바로 오른쪽에 반복 횟수를
	// 표기하는 방법으로 문자열을 압축하라.

public class Exam11_StringCompression02 {
	public String solution(String s){
		String answer = "";
		s += " ";
		int check = 1;
		for(int i = 0; i < s.length() - 1; i++){
			if(s.charAt(i) == s.charAt(i + 1)) check++;
			else {
				answer += s.charAt(i);
				if(check > 1) {
					answer += check;
					check = 1;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Exam11_StringCompression02 T = new Exam11_StringCompression02();
		String str = br.readLine();
		System.out.println(T.solution(str));
	}
}
