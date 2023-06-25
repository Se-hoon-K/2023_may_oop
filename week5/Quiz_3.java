package week5;

import java.util.Scanner;

public class Quiz_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("세 수를 입력하세요. ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int max = 0; // 최대값 변수 생성;

		if (a > b) { // a가 b보다 클 경우
			max = a; // a가 최대값
			if (c > a) { // c가 a보다 클 경우
				max = c;// c가 최대값
			}
		} else {// 그외 b가 a보다 크거나 같을 경우
			max = b; // b가 최대값
			if (c > b) { // c가 b보다 클 경우
				max = c;// c가 최대값
			}
		}
		System.out.println("입력 받은 수 중 가장 큰 수는 " + max + "입니다.");

	}

}
