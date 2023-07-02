package week6;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		int result = 0;
		if (num == num2 || num == num3 || num == num4 || num == num5) {
			result++;

		}else if(num2 == num3 || num2 == num4 || num2 == num5) {
			result++;
		}
		if (result == 0) {
			System.out.println("중복된 숫자 없음");
		} else {
			System.out.println("중복된 숫자 있음");
		}

	}

}
