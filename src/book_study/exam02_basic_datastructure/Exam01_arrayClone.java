package book_study.exam02_basic_datastructure;

public class Exam01_arrayClone {
	public static void main(String[] args) {
		int[] a = {1,2,10,4,5};
		int[] b = a.clone();
		for(int i = 0; i < b.length; i++) System.out.print(b[i] + " ");
	}
}
