package book_study.exam01_basic_algorithm;

public class Exam11_Plus {
	public static void main(String[] args) {
		System.out.print("   | ");
		for(int i = 1; i < 10; i++) System.out.printf("%3d", i);
		System.out.print("\n---+----------------------------");
		for(int i = 1; i < 10; i++) {
			System.out.printf("\n%2d | ", i);
			for(int j = 1; j < 10; j++) System.out.printf("%3d", i + j);
			
		}
	}
}
