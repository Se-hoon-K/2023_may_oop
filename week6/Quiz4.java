package week6;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0, t6 = 0, t7 = 0, t8 = 0, t9 = 0, t10 = 0;
		for (int i = 0; i < 15; i++) {
			int result = sc.nextInt();
			if (result < 10) {
				t1++;
			}else if(result <20){
				t2++;
			}else if(result <30) {
				t3++;
			}else if(result <40) {
				t4++;
			}else if(result <50) {
				t5++;
			}else if(result <60) {
				t6++;
			}else if(result <70) {
				t7++;
			}else if(result <80) {
				t8++;
			}else if(result <90) {
				t9++;
			}else {
				t10++;
			}
		}
		System.out.println("0~10 : " +t1);
		System.out.println("10~20 : " +t2);
		System.out.println("20~30 : " +t3);
		System.out.println("30~40 : " +t4);
		System.out.println("40~50 : " +t5);
		System.out.println("50~60 : " +t6);
		System.out.println("60~70 : " +t7);
		System.out.println("70~80 : " +t8);
		System.out.println("80~90 : " +t9);
		System.out.println("90~100 : " +t10);
		sc.close();
	}

}
