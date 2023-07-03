package midterm;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		boolean rslt = true;
		if(in < 2) {
			System.out.println("2 이상의 수를 입력 해주세요.");
		}
		for(int i = 2; i<in/2;i++) {
			if(in%i==0) {
				rslt = false;
			}
		}
		if(rslt == true) {
			System.out.println("소수입니다");
		}else {
			System.out.println("소수가 아닙니다");
		}
		sc.close();
	}

}
