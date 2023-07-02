package week6;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		int var = 0;
		int min = 0;
		int max = 0;

		if (a < b) {
			min = a;
			max = b;
		} else {
			max = a;
			min = b;
		}

		for (int i = min; i <= max; i++) {
			sum += i;
			var ++;
		}
		double avg = (double)sum/var;
		System.out.println(sum + " " + var + " " + avg);
		sc.close();
	}

}
