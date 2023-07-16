package week9_Assignment;

import java.util.Scanner;

public class Q_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a ==0 && b==0) {
				break;
			}
			
			if(b%a == 0) {
				System.out.printf("factor\n");
			}else if(a%b==0) {
				System.out.printf("multiple\n");
			}else {
				System.out.printf("neither\n");
			}
			
		}
		sc.close();
	}

}
