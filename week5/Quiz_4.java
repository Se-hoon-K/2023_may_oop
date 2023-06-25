package week5;

import java.util.Scanner;

public class Quiz_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt(); //나이 입력
		sc.close();
		if (age >= 20) { //20세 이상일 시
			System.out.println("adult");

		} else { // 20새 미만일 시

			System.out.println((20 - age) + " years later"); // 20에서 나이값을 제외한 후 ~년후 출력
		}

	}

}
