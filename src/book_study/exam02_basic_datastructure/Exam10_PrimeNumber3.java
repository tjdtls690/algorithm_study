package book_study.exam02_basic_datastructure;

public class Exam10_PrimeNumber3 {
	
	// 더 빠르게 소수 열거 (제곱의 값이 본 숫자보다 높다면 연산 중지)
	
	public static void main(String[] args) {
		int[] prime = new int[500];
		int counter = 0;
		int num = 0;
		Boolean flag;
		
		prime[num++] = 2;
		prime[num++] = 3;
		
		for(int i = 5; i <= 1000; i += 2) {
			flag = true;
			int n;
			for(n = 1; prime[n] * prime[n] <= i; n++) { // 연산을 < 로 하면 연산이 맞지도 않을 뿐더러,
														// 범위가 더 좁아져 연산 횟수만큼은 더 적어질거라 생각할 수 있지만
														// 소수가 아닌 수도 배열로 들어가버려서 연산 횟수가 오히려 증가한다.
				counter += 2;
				if(i % prime[n] == 0) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				counter++;		// prime[n] * prime[n] <= i 이 성립이 안된다면 제곱 연산 진행후 카운터가 안올라가기에 1 증가
				prime[num++] = i;
			}
		}
		
		for(int i = 0; i < num; i++) {
			System.out.println(prime[i]);
		}
		System.out.println("곱셈과 나눗셈을 수행한 횟수 ：  " + counter);
		System.out.println("소수의 갯수 : " + num);
	}
}
