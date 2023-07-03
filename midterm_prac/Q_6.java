package midterm_prac;

import java.util.Scanner;

public class Q_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] arr = new char[n][n];
		char ch = 'A';
		
		for (int i = 0; i < n; i++) {
			int c = n -1;
			
			for (int j = i; j < n; j++) {
				arr[j][c++] = ch++;
			}
		}
		
		for (int i = 0; i < n; i++) {
            // 공백 출력
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // 알파벳 출력
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j]);
                if (j < i) {
                    System.out.print(",");
                }
            }

            System.out.println();
        }
		
	}

}
