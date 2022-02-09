package book_study.exam01_basic_algorithm;

import java.io.*;

public class Exam03_min4 {
	
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		return min;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print("a의 값 : "); int a = Integer.parseInt(br.readLine());
			System.out.print("b의 값 : "); int b = Integer.parseInt(br.readLine());
			System.out.print("c의 값 : "); int c = Integer.parseInt(br.readLine());
			System.out.print("d의 값 : "); int d = Integer.parseInt(br.readLine());
			System.out.println("최솟값 : " + min4(a,b,c,d));
		}
	}

}
