package week4;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int min,max;
		sc.close();
		
		if(x>y) {
			max = x;
			min = y;
			System.out.println("Max = " + max);
			System.out.println("Min = " + min);
			
		} else {
			max = y;
			min = x;
			System.out.println("Max = " + max);
			System.out.println("Min = " + min);
		}
	}

}
