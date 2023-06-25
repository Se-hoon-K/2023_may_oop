package week5;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		int sum =0;
		while(i <=n) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		sc.close();
	}

}
