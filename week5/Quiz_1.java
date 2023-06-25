package week5;

import java.util.Scanner;

public class Quiz_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vari = 3;
		System.out.println("5개의 수를 입력하시오.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		System.out.print(a + vari + " ");
		System.out.print(b - vari + " ");
		System.out.print(c * vari + " ");
		System.out.print(d / vari + " ");
		System.out.print(e % vari);
		sc.close();
	}

}
