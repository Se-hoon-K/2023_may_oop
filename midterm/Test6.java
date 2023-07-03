package midterm;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		boolean rslt = true;
		for(int i =0; i<5;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<4;i++) {
			for(int j = i+1; j<5;j++) {
				if(arr[i]==arr[j]) {
					rslt = false;
				}
			}
		}
		if(rslt == true) {
			System.out.println("중복된 숫자가 없습니다.");
		}else {
			System.out.println("중복된 숫자가 있습니다.");
		}
		sc.close();
	}

}
