package week4;

import java.util.Scanner;

public class Nested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();

		if (number > 0) {
			System.out.println("양수입니다");

		} else if (number == 0) {
			System.out.println("0입니다");

		} else {
			System.out.println("음수입니다");
		}
	}

}
