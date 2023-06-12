package week4_Assignment;

import java.util.Scanner;

public class Q_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hr = sc.nextInt();
		int min = sc.nextInt();
		sc.close();
		if(min >= 45) {
			min = min-45;
			System.out.println(hr + " " + min);
		}else if(hr > 0 && min < 45) {
			hr = hr-1;
			min = min + 60 - 45;
			System.out.println(hr + " " + min);
		}else {
			hr = hr+24-1;
			min = min + 60-45;
			System.out.println(hr + " " + min);
		}
	}

}
