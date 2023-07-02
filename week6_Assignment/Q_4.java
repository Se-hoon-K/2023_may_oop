package week6_Assignment;

import java.util.Scanner;

public class Q_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int[] arr = new int[9];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (max == arr[i]) {
				break;
			} else {
				count++;
			}
		}
		System.out.printf("%d\n%d", max, count);
		sc.close();
	}

}
