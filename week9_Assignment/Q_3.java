package week9_Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			ArrayList<Integer> arr = new ArrayList<>();
			int n = sc.nextInt();
			if (n == -1)
				break;
			String[] arr1 = new String[n];
			int divi = 1;
			int sum = 0;
			String spc = " + ";

			for (int i = 0; i < n; i++) {
				if (n % divi == 0) {
					arr1[i] = divi + spc;
					sum += divi;
					divi++;

				}
			}
			for (int j = 0; j < arr1.length; j++) {
				System.out.print(arr1[j]);
			}

		}

	}

}
