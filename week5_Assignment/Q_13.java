package week5_Assignment;

import java.util.Scanner;

public class Q_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);

		}
		sc.close();
	}
}