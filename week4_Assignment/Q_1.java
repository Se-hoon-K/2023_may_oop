package week4_Assignment;

import java.util.Scanner;

public class Q_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		a = s.nextInt();
		b = s.nextInt();
		s.close();
		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}

}
