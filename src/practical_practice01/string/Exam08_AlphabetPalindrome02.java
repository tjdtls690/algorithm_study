package practical_practice01.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	// 다른 문자를 제외한 알파벳만 따졌을 때 회문이 맞는가??

public class Exam08_AlphabetPalindrome02 {

	  // 팰린드롬 : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열.

	  // str.replaceAll("[^A-Z]", "") : str문자열 안에서 A부터 Z(대문자 알파벳) 안에 속하지 않는 것들을 ""(없애는 것)으로 대체해라
	  // ^ 는 부정을 뜻하며 [^A-Z] 는 정규식
	  // replaceAll() 은 특정 문자를 대체하는 기능

	  public String solution(String str){
	    str = str.replaceAll("[^A-Z]", "");
	    String str1 = new StringBuilder(str).reverse().toString();
	    if(str.equals(str1)) return "YES";
	    return "NO";
	  }
	  
	  public static void main(String[] args) throws IOException {
		  Exam08_AlphabetPalindrome02 T = new Exam08_AlphabetPalindrome02();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("문자열 입력 : ");
			String str = br.readLine().toUpperCase();
			System.out.println("알파벳만 따졌을 시 회문인지 여부 : " + T.solution(str));
		}
}
