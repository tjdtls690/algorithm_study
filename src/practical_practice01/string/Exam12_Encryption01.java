package practical_practice01.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	// '#'과 '*'로 이루어진 암호문을 이진수화, 10진수화, 아스키번호의 문자화로 복호화하시오.
	// ex) #****## --> 1000011 --> 67 --> 'C'
	// 첫 줄에는 보낸 문자의 개수(10을 넘지 않습니다)가 입력된다. 
	// 다음 줄에는 문자의 개수의 일곱 배 만큼의 #또는 * 신호가 입력됩니다.

public class Exam12_Encryption01 {
	public String solution(String s, int su){
		String answer = "";
		String[] tmp = new String[su];
		int check = 0;
		for(int i = 0; i < 7 * su; i += 7){
			tmp[check] = s.substring(i, i + 7);
			check++;
		}

		String[] str = new String[su];
		for(int i = 0; i < str.length; i++) str[i] = "";
		for(int i = 0; i < str.length; i++){
			for(char ch : tmp[i].toCharArray()){
				if(ch == '#') str[i] += 1;
				else str[i] += 0;
			}
		}
		
		char[] ch = new char[su];
		for(int i = 0; i < str.length; i++){
			int check1 = 0;
			int jegop = 1;
			for(int j = 6; j >= 0; j--){
				check1 += (int)(str[i].charAt(j) - 48) * jegop;
				jegop *= 2;
			}
			ch[i] = (char)check1;
		}
		for(char ch1 : ch) answer += ch1;
		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Exam12_Encryption01 T = new Exam12_Encryption01();
		int su = Integer.parseInt(br.readLine());
		String str = br.readLine();
		System.out.println(T.solution(str, su));
	}

}
