package book_study.exam01_basic_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam06_SumFor {
	
	// 1부터 n까지의 합 구하기.
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("n의 값：");
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i = 1; i <= n; i++) sum += i;
		System.out.println(sum);
		System.out.println(n*(n+1)/2);
	}

}
