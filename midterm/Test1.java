package midterm;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int in2 = sc.nextInt();
		int min = 0, max = 0, div = 0, lo = 0;
		if (in > in2) {
			max = in;
			min = in2;
		} else {
			max = in2;
			min = in;
		}
		lo = max % min;
		div = max / min;
		System.out.printf("%d / %d = %d...%d", max, min, div, lo);
		sc.close();
	}

}
