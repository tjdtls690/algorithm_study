package practical_practice01.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam09_OnlyNumbers03 {
  public int solution(String str){
	  
    int answer = 0;
    for(char x : str.toCharArray()){
      if(x > 47 && x < 58) answer = answer * 10 + (x - 48);
    }
    return answer;
  }
  
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Exam09_OnlyNumbers03 T = new Exam09_OnlyNumbers03();
    String str = br.readLine();
    System.out.println(T.solution(str));
  }
}