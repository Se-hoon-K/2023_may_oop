package week5;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하시요: ");
		int n = sc.nextInt();
		sc.close();
		long sum = 1;
		for(int i = 1; i<=n ; i++) {
			sum *= i;
			
		}
		System.out.println(sum);
	}

}
