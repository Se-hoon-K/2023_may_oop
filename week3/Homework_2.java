package week3;

import java.util.Scanner;

public class Homework_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int menu;
		double base_temp;

		System.out.println("===================================");
		System.out.println("1. 화씨 -> 섭씨");
		System.out.println("2. 섭씨 -> 화씨");
		System.out.println("===================================");
		System.out.print("번호를 선택하시오 : ");
		menu = s.nextInt();

		String print = (menu == 1) ? "화씨 온도를 입력하시오 : " : "섭씨 온도를 입력하시오 : ";
		System.out.print(print);
		double degree = s.nextDouble();

		double result = (menu == 1) ? (degree - 32) / 1.8 : degree * 1.8 + 32;
		System.out.println("변환된 온도 : " + result);

		s.close();
	}

}
