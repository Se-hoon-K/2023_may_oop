package week4_Assignment;

import java.util.Scanner;

public class Q_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		a = s.nextInt();
		s.close();
		if (a >= 90) {
			System.out.println("A");
		} else if (a>=80) {
			System.out.println("B");
		} else if (a>=70) {
			System.out.println("C");
		} else if (a>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
