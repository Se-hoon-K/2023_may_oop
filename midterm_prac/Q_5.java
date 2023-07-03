package midterm_prac;

import java.util.Scanner;

public class Q_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		for(int i=0;i<5;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.printf("%d", min);
		sc.close();
	}

}
