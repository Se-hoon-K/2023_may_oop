package week9_Assignment;

import java.util.Scanner;

public class Q_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		int[] divi = new int[n+1];
		int count = 0;
		
		for(int i =1; i<=n;i++) {
			if(n%i == 0) {
				divi[count] = i;
				count++;
			}
		}
		System.out.print(divi[k-1]);
		
	}

}
