package midterm;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 1;
		for (int i = 0; i < b; i++) {
			sum *= a;
		}
		System.out.printf("%d의 %d승은 %d입니다", a, b, sum);
		sc.close();
	}

}
