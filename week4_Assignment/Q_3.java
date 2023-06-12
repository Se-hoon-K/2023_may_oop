package week4_Assignment;

import java.util.Scanner;

public class Q_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		s.close();
		int a = year % 4;
		int b = year % 100;
		int c = year % 400;
		
		if (c == 0) {
			System.out.println("1");
		} else if(b==0){
			System.out.println("0");
		} else if(a==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}
