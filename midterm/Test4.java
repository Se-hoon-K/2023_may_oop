package midterm;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int even_sum = 0;
		int odd_sum = 0;
		for(int i = 1; i <= 10;i++) {
			int in = sc.nextInt();
			if(i%2 == 0) {
				even_sum += in;
			}else {
				odd_sum += in;
			}
		}
		System.out.printf("odd : %d\n",odd_sum);
		System.out.printf("odd : %d\n",even_sum);
		sc.close();
	}

}
