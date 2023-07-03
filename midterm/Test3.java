package midterm;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		int n = sc.nextInt();
		sc.close();
		String ab = a+b;
		String ovrd = (a.substring(0,n))+(b.substring(b.length()-3,b.length()));
		
		System.out.println(ab);
		System.out.println(ovrd);
		
	}

}
