package week6;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int a = 0;
		while(n != 0) {
			n=sc.nextInt();
			if( n % 3 != 0 && n % 5 !=0) {
				a ++;
			}
			
		}
		System.out.println(a);
		sc.close();
	}

}
