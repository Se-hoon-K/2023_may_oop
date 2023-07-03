package midterm_prac;

import java.util.Scanner;

public class Q_6_Test {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        System.out.print("행의 길이를 입력하세요: ");
	        int rows = input.nextInt();
	        System.out.print("열의 길이를 입력하세요: ");
	        int cols = input.nextInt();

	        char[][] triangle = new char[rows][cols];

	        // 패턴에 맞는 알파벳 채우기
	        char alphabet = 'A';
	        for (int i = 0; i < rows; i++) {
	            int col = cols - 1;
	            for (int j = i; j < rows; j++) {
	                triangle[j][col] = alphabet++;
	                col++;
	            }
	        }

	        // 출력
	        for (int i = 0; i < rows; i++) {
	            // 공백 출력
	            for (int j = 0; j < cols - i - 1; j++) {
	                System.out.print(" ,");
	            }

	            // 알파벳 출력
	            for (int j = 0; j <= i; j++) {
	                System.out.print(triangle[i][j]);
	                if (j < i) {
	                    System.out.print(",");
	                }
	            }

	            System.out.println(); // 줄 바꿈
	        }

	}

}
