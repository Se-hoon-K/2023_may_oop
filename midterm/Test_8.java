package midterm;

import java.util.Scanner;

public class Test_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[15];
		int count = 0;
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}

		for (int i = 10; i <= 100; i += 10) {
			count = 0;
			for (int j = 0; j < 15; j++) {
				if (score[j] < i && score[j]>=i-10) {
					count++;
				}
			}
			if (count > 0) {
				System.out.printf("%d ~ %d : ", i - 10, i);
				for (int k = 0; k < count; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		sc.close();
	}

}
