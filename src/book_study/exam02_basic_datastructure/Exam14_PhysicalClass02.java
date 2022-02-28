package book_study.exam02_basic_datastructure;

	// 신체검사 데이터용 클래스 배열에서 평균 키와 시력의 분포를 구함
	// 시력 분포도 출력을 숫자가 아닌 '*' 갯수로 표현하기

public class Exam14_PhysicalClass02 {
	
	static final int VMAX = 21;	// 시력 분포(0.0에서 0.1 단위로 21개)
	
	static class PhyscData{	// 고객 정보
		private String name;
		private int height;
		private double vision;
		
		public PhyscData() {}
		
		public PhyscData(String name, int height, double vision) { 
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public double getVision() {
			return vision;
		}

		public void setVision(double vision) {
			this.vision = vision;
		}
	}
	
	public static double avg(PhyscData[] x) {	// 고객 평균 키
		int sum = 0;
		for(PhyscData x1 : x) sum += x1.getHeight();
		return (double)sum / x.length;
	}
	
	public static void distVision(PhyscData[] x, String[] vdist) {	// 고객 시력 분포도
		for(int i = 0; i < x.length; i++) {
			double vi = x[i].getVision();
			if(vi >= 0.0 && vi <= 2.0) {
				vdist[(int)(x[i].getVision() * 10)] += "*";
			}
		}
	}
	
	public static void print(PhyscData[] x, String[] vdist) {
		System.out.println("■ 신체검사 리스트 ■");
		System.out.println("이름      키    시력");
		System.out.println("--------------------");
		for(int i = 0; i < x.length; i++) System.out.printf("%s%7d%7.1f\n", x[i].getName(), x[i].getHeight(), x[i].getVision());
		System.out.printf("\n평균 키 : %.1f\n", avg(x));
		System.out.println("\n시력 분포");
		for(int i = 0; i < vdist.length; i++) System.out.printf("%.1f ~ : %s\n", i/10.0, vdist[i]);
		
	}
	
	public static void main(String[] args) {
		PhyscData[] x = {
				new PhyscData("박현규", 162, 0.3),
				new PhyscData("함진아", 173, 0.3),
				new PhyscData("최윤미", 175, 2.0),
				new PhyscData("홍연의", 171, 1.5),
				new PhyscData("이수진", 168, 0.4),
				new PhyscData("김영준", 174, 1.2),
				new PhyscData("박용규", 169, 0.8),
		};
		String[] vdist = new String[VMAX];
		for(int i = 0; i < vdist.length; i++) vdist[i] = "";
		distVision(x, vdist);
		print(x, vdist);
	}
}
