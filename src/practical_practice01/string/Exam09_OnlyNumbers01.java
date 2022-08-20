package practical_practice01.string;

import java.io.*;

	// 문자열 안에서 숫자만 추출해서 자연수로 반환

public class Exam09_OnlyNumbers01 {
	// Character.isDigit(str.charAt(i)) : str.charAt(i) 이 숫자인가??
	
  public int solution(String str){
    String str1 = "";
    for(int i = 0; i < str.length(); i++){
      if(Character.isDigit(str.charAt(i))){
        str1 += str.charAt(i);
      }
    }
         return Integer.parseInt(str1);
  }
  
  
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Exam09_OnlyNumbers01 T = new Exam09_OnlyNumbers01();
    String str = br.readLine();
    System.out.println(T.solution(str));
  }
}