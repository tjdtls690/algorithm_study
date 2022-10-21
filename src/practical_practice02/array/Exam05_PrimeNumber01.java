package practical_practice02.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

	// 소수 구하기 (에라토스테네스 체 사용하지 않고) => 성능 저하

public class Exam05_PrimeNumber01 {
	public List<Integer> solution(int su) {
		List<Integer> answer = new ArrayList<Integer>();
		answer.add(2);
		for (int i = 3; i <= su; i++) {
			int check = 0;
			for (int j = 0; j < answer.size(); j++) {
				if (i % answer.get(j) != 0)
					check++;
				if (check == answer.size())
					answer.add(i);
			}
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Exam05_PrimeNumber01 T = new Exam05_PrimeNumber01();
		int su = Integer.parseInt(br.readLine());
		System.out.print(T.solution(su).size());
	}
}
