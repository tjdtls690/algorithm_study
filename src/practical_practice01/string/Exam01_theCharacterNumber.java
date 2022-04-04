package practical_practice01.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	// 대소문자 구분하지 않고 특정 글자의 갯수 구하기.

public class Exam01_theCharacterNumber {
	
	// toUpperCase() 알파벳을 전부 대문자로 변환
	// toLowerCase() 알파벳을 전부 소문자로 변환

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 입력 : ");
	    String str = br.readLine().toUpperCase();
	    System.out.print("찾을 글자 입력 : ");
	    char ch1 = br.readLine().charAt(0);
	    char ch2 = Character.toUpperCase(ch1);
	    int check = 0;
	    for(int i = 0; i < str.length(); i++){
	      if(str.charAt(i) == ch2){
	        check++;
	      }
	    }
	    System.out.printf("%c의 갯수 : %d", ch1, check);
	}

}
