package week5_Assignment;

import java.util.Scanner;

public class Q_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();

			System.out.println("Case #" + i + ": " + (c + d));
		}

		sc.close();
	}
}
