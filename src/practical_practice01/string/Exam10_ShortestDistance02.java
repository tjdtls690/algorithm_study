package practical_practice01.string;

import java.io.*;
import java.util.*;

	// 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성.
  
public class Exam10_ShortestDistance02 {
	
	// ArrayList.set(index, Object) : index 번째의 데이터를 Object로 변경 시킴
	// Math.min(a, b) : a와 b 중에 더 작은 수 반환
	
  public List<Integer> solution(String str1, char str2){
    List<Integer> answer = new ArrayList<Integer>();
    int check = 1000;
    for(int i = 0; i < str1.length(); i++){
      check++;
      if(str1.charAt(i) == str2) check = 0;
      answer.add(check);
    }
    check = 1000;
    for(int i = str1.length() - 1; i >= 0; i--){
      check++;
      if(str1.charAt(i) == str2) check = 0;
      answer.set(i, Math.min(check, answer.get(i)));
    }
    return answer;
  }
  
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    Exam10_ShortestDistance02 T = new Exam10_ShortestDistance02();
    String str1 = st.nextToken();
    char str2 = st.nextToken().charAt(0);
    List<Integer> answer = T.solution(str1, str2);
    for(Integer x : answer) System.out.print(x + " ");
  }
}
