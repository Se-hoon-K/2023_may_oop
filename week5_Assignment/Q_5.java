package week5_Assignment;

import java.util.Scanner;

public class Q_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		String l = "long";
		sc.close();
		for(int a =0; a<(in/4); a++) {
			System.out.print(l + " ");
		}
		System.out.println("int");
		
	}

}
