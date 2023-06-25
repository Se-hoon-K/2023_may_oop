package week5;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tot = 1;
		for(int i=1; i<=10 ;i++) {
			tot = n * i;
			System.out.print(tot + " ");
		}
		sc.close();
	}

}
