package week3;

import java.util.Scanner;

public class add2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z, sum;
		
		System.out.print("첫 번째 숫자를 입력하시오: ");
		x = sc.nextInt();
		
		System.out.print("두 번째 숫자를 입력하시오: ");
		y = sc.nextInt();
		
		System.out.print("세 번째 숫자를 입력하시오: ");
		z = sc.nextInt();
		
		sum = x+y+z;
		System.out.println("세 숫자의 합은 " + sum + "입니다.");
		
	}

}
