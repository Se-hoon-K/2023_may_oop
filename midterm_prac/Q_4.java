package midterm_prac;

import java.util.Scanner;

public class Q_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int r = sc.nextInt();
		for(int i =0 ; i<c ; i++) {
			for(int j = 0;j<r;j++) {
				System.out.print((i+1)*(j+1) + " ");
			}
			System.out.printf("\n");
		}
		sc.close();
	}

}
