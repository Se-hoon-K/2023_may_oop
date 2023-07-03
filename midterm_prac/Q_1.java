package midterm_prac;

import java.util.Scanner;

public class Q_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0, sum = 0;
		for (int i = 1; sum < n; i+=2) {
				count++;
				sum+=i;
		}
		sc.close();
		System.out.printf("%d %d", count, sum);
	}

}
