package week4_Assignment;

import java.util.Scanner;

public class Q_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int end, max;

		if (a == b && a == c) {
			end = 10000 + (a * 3);
			System.out.println(end);

		} else if (a == b || a == c || b == c) {
			if (a != b && a != c) {
				end = 1000 + (b * 100);
				System.out.println(end);
			} else {
				end = 1000 + (a * 100);
				System.out.println(end);
			}
		} else {
			if (a > b && a > c) {
				max = a;
				System.out.println(max * 100);
			} else if (b > a && b > c) {
				max = b;
				System.out.println(max * 100);

			} else {
				max = c;
				System.out.println(max * 100);
			}

		}

	}

}
