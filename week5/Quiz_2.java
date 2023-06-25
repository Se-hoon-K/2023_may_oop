package week5;

import java.util.Scanner;

public class Quiz_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m_height = sc.nextInt(); // 민기 키
		int m_weight = sc.nextInt(); // 민기 몸무게
		int k_height = sc.nextInt(); // 기영이 키
		int k_weight = sc.nextInt(); // 기영이 몸무게
		sc.close();

		if (m_weight > k_weight && m_height > k_height) { //민기의 키와 몸무게가 기영이보다 클 경우
			System.out.println(1);
		} else { // 그외 모든 상
			System.out.println(0);
		}

	}

}
