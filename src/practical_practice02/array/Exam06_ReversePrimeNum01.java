package practical_practice02.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

	// N개의 자연수가 입력되면 각 자연수를 뒤집은 후 수가 소수이면
	// 그 소수를 출력하는 알고리즘
	// 첫번째 방법 (성능 중하)

public class Exam06_ReversePrimeNum01 {
	public boolean isPrime(int num){
		if(num == 1) return false;
		for(int i = 2; i < num; i++){
			if(num % i == 0) return false;
		}
		return true;
	}

	public List<Integer> solution(int su, String[] str){
		List<Integer> answer = new ArrayList<Integer>();
		for(int i = 0; i < str.length; i++){
			char[] ch = str[i].toCharArray();
			String tmp = "";
			for(int j = ch.length - 1; j >= 0; j--) tmp += ch[j];
			int tmp1 = Integer.parseInt(tmp);
			if(isPrime(tmp1)) answer.add(tmp1);
		}
		
		return answer;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Exam06_ReversePrimeNum01 T = new Exam06_ReversePrimeNum01();
		int su = Integer.parseInt(br.readLine());
		String[] str = new String[su];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; st.hasMoreTokens(); i++) str[i] = st.nextToken();
		
		for(int num : T.solution(su, str)) System.out.print(num + " ");
	}
}
