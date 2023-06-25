package week5_Assignment;

import java.util.Scanner;

public class Q_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int a, b, sum;
		for (int i = 0; i < in; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			sum = a + b;
			System.out.println(sum);
		}
		sc.close();
	}

}
