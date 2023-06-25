package week5_Assignment;

import java.util.Scanner;

public class Q_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total_sum = sc.nextInt();
		int num_item = sc.nextInt();
		int item_sum = 0;
		for(int a=0; a<num_item; a++) {
			int price = sc.nextInt();
			int num = sc.nextInt();
			item_sum = item_sum + (price * num);
		}
		if(total_sum == item_sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}

}
