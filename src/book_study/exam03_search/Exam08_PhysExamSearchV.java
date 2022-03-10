package book_study.exam03_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

//신체검사 데이터 배열에서 검색 (시력)

public class Exam08_PhysExamSearchV {
	
	static class PhyscData{
		private String name;
		private int height;
		private double vision;
		
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		// 시력 내림차순용 comparator
		public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();
		
		private static class VisionOrderComparator implements Comparator<PhyscData>{
			@Override
			public int compare(PhyscData o1, PhyscData o2) {
				return o1.vision > o2.vision ? -1 : o1.vision < o2.vision ? 1 : 0;
				
				// 만약 x[] 배열의 시력이 오름차순이라면
				// return o1.vision > o2.vision ? 1 : o1.vision < o2.vision ? -1 : 0;
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PhyscData[] x = { // 배열의 요소는 시력순이지 않으면 안됩니다.
				new PhyscData("이나령", 162, 2.0), new PhyscData("유지훈", 168, 1.5), new PhyscData("전서현", 173, 1.2),
				new PhyscData("김한결", 169, 0.8), new PhyscData("이호연", 174, 0.7), new PhyscData("홍준기", 171, 0.4),
				new PhyscData("이수민", 175, 0.3), };
		System.out.print("찾는 시력 : ");
		double vision = Double.parseDouble(br.readLine());
		int idx = Arrays.binarySearch(x, new PhyscData("", 0, vision), PhyscData.VISION_ORDER);
		if(idx < 0) System.out.println("찾으시는 시력이 없습니다.");
		else {
			System.out.printf("x[%d] : ", idx);
			System.out.println(x[idx]);
		}
	}
}
