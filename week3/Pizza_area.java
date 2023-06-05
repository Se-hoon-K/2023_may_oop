package week3;

public class Pizza_area {

	public static void main(String[] args) {
		final double PI = 3.141592;
		double area1 = 20 * 20 * PI * 2;
		double area2 = 30 * 30 * PI;
		System.out.println("20cm 피자의 면적은 " + area1 + "입니다.");
		System.out.println("30cm 피자의 면적은 " + area2 + "입니다.");
		System.out.println((area1 > area2)? "20cm 피자 2판이 " : "30cm 피자 1판이 " + "효율적입니다.");
		
		
	}

}
