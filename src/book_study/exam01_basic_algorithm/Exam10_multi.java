package book_study.exam01_basic_algorithm;

public class Exam10_multi {
	public static void main(String[] args) {
		System.out.print("   |");
		for(int i = 1; i < 10; i++) System.out.printf("%3d", i);
		System.out.println("\n---+-----------------------------------");
		for(int i = 1; i < 10; i++) {
			System.out.print(" " + i + " |");
			for(int j = 1; j < 10; j++) System.out.printf("%3d", i*j);
			System.out.println();
		}
	}
}
