package practical_practice02.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

	// 입력받은 수들 중 자기 자신이 자신의 앞수보다 큰 숫자만 출력 

public class Exam01_GreaterNumber {
	public void solution(int[] su){
		System.out.print(su[0] + " ");
		for(int i = 1 ; i < su.length; i++){
			if(su[i] > su[i-1]) System.out.print(su[i] + " ");
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Exam01_GreaterNumber T = new Exam01_GreaterNumber();
		int tmp = Integer.parseInt(br.readLine());
		StringTokenizer str = new StringTokenizer(br.readLine());
		int[] su = new int[tmp];
		for(int i = 0; str.hasMoreTokens(); i++){
			su[i] = Integer.parseInt(str.nextToken());
		}
		T.solution(su);
	}
}
