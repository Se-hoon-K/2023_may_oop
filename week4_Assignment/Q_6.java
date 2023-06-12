package week4_Assignment;

import java.util.Scanner;

public class Q_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hr = sc.nextInt();
		int min = sc.nextInt();
		int ckTm = sc.nextInt();
		min = ckTm + min;
		int addhr = min/60;
		sc.close();

		if (min >=60) {
			hr = hr+addhr;
			if(hr >= 24) {
				hr = hr-24;
			}
			min = min-(addhr*60);
			System.out.println(hr + " " + min);
		}else {
			System.out.println(hr + " " + min);
		}
		
		
		
	}

}
