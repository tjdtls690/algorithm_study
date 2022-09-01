package practical_practice01.string;

import java.io.*;
import java.util.*;

	// 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성.
  
public class Exam10_ShortestDistance01 {
	
	// StringTokenizer : 문자열을 분리 (기본값은 띄어쓰기 기준으로 분리)
	
  public List<Integer> solution(String str1, char str2){
    List<Integer> arr1 = new ArrayList<Integer>();
    List<Integer> arr2 = new ArrayList<Integer>();
    List<Integer> answer = new ArrayList<Integer>();
    int check = 1000;
    for(int i = 0; i < str1.length(); i++){
      check++;
      if(str1.charAt(i) == str2) check = 0;
      arr1.add(check);
    }
    check = 1000;
    for(int i = str1.length() - 1; i >= 0; i--){
      check++;
      if(str1.charAt(i) == str2) check = 0;
      arr2.add(check);
    }
    
    for(int i = 0; i < arr1.size(); i++){
      if(arr1.get(i) >= arr2.get(arr1.size() - 1 - i)) answer.add(arr2.get(arr1.size() - 1 - i));
      else answer.add(arr1.get(i));
    }
    return answer;
  }
  
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    Exam10_ShortestDistance01 T = new Exam10_ShortestDistance01();
    String str1 = st.nextToken();
    char str2 = st.nextToken().charAt(0);
    List<Integer> answer = T.solution(str1, str2);
    for(Integer x : answer) System.out.print(x + " ");
  }
}