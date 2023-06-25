package week5_Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_6 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			// 테스트 케이스 개수 입력
			int T = Integer.parseInt(br.readLine());

			for (int i = 0; i < T; i++) {
				// A와 B 입력
				String[] input = br.readLine().split(" ");
				int A = Integer.parseInt(input[0]);
				int B = Integer.parseInt(input[1]);

				// A와 B의 합 출력
				int sum = A + B;
				System.out.println(sum);
			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
