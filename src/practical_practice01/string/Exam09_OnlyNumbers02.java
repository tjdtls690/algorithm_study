package practical_practice01.string;

import java.io.*;

public class Exam09_OnlyNumbers02 {
  public int solution(String str){
    String str1 = "";
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) > 47 && str.charAt(i) < 58) str1 += str.charAt(i);
    }
    return Integer.parseInt(str1);
  }
  
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Exam09_OnlyNumbers02 T = new Exam09_OnlyNumbers02();
    String str = br.readLine();
    System.out.println(T.solution(str));
  }	
}
