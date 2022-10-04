package practical_practice02.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

	// 학생들이 줄서있을 때, 앞에 서있는 학생들보다 키가 더 큰 학생만 앞에서 보인다.
	// 앞에서 볼 때 보이는 학생들의 수를 구하기.

public class Exam02_VisibleStudent {
	public int solution(int[] student) {
		int answer = 1;
		int height = student[0];
		for (int i = 1; i < student.length; i++) {
			if (student[i] > height) {
				height = student[i];
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Exam02_VisibleStudent T = new Exam02_VisibleStudent();
		int tmp = Integer.parseInt(br.readLine());
		StringTokenizer str = new StringTokenizer(br.readLine());
		int[] student = new int[tmp];
		for (int i = 0; str.hasMoreTokens(); i++) {
			student[i] = Integer.parseInt(str.nextToken());
		}
		System.out.println(T.solution(student));
	}
}
