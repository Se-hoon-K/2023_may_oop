package week4;

import java.util.Scanner;

public class Q_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();
		switch(a) {
		case "A" : System.out.println("Excellent"); break;
		case "B" : System.out.println("Good"); break;
		case "C" : System.out.println("Usually"); break;
		case "D" : System.out.println("Effort"); break;
		case "E" : System.out.println("Failure"); break;
		default : System.out.println("error");
		}
		
	}

}
