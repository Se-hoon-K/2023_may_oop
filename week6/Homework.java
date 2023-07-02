package week6;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int com = (int) (Math.random() * 100);
		int user = 0;
		int count = 1;
		while (user != com) {
			System.out.print("정답을 추측하여 보시오 : ");
			user = sc.nextInt();
			if (user < com) {
				System.out.printf("제시한 점수가 낮습니다.\n");
				count++;
			} else if (user > com) {
				System.out.printf("제시한 점수가 높습니다.\n");
				count++;
			}else {
				System.out.printf("축하합니다. 시도횟수=%d",count);
			}
		}
		sc.close();
	}

}
