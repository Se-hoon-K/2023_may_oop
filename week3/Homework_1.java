package week3;

import java.util.Scanner;

public class Homework_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int opt;
		double base_temp;
		
		System.out.println("===================================");
		System.out.println("1. 화씨 -> 섭씨");
		System.out.println("2. 섭씨 -> 화씨");
		System.out.println("===================================");
		System.out.print("번호를 선택하시오 : ");
		opt = s.nextInt();

		int fer = 1;
		if (opt == fer) {
			System.out.print("화씨 온도를 입력하시오 : ");
			base_temp = s.nextDouble();
			System.out.println("섭씨 온도는 "+(base_temp - 32.0) / 1.8);
		} else {
			System.out.print("섭씨 온도를 입력하시오 : ");
			base_temp = s.nextDouble();
			System.out.println("화씨 온도는 "+base_temp * 1.8 + 32);
		}

	}

}
