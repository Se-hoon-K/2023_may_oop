package week6_Assignment;

import java.util.Scanner;

public class Q_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int l = sc.nextInt();
		int[] arr = new int[l];
		for (int i = 0; i < l; i++) {
			arr[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		for (int i = 0; i < l; i++) {
			if (arr[i] == v) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
