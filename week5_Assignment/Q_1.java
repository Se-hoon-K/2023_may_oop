package week5_Assignment;

import java.util.Scanner;

public class Q_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		sc.close();
		for(int a = 1; a<10; a++) {
			System.out.println(times + " * " +a+" = "+(times*a));
		}
	}

}
