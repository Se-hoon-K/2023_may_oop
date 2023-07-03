package midterm_prac;

import java.util.Scanner;

public class Q_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Character[] abv = new Character[3];
		for(int i =0;i<3;i++) {
			String in = sc.next();
			abv[i]=in.toUpperCase().charAt(0);
		}
		for(Character c : abv ) {
			System.out.print(c);
		}
		sc.close();
	}

}
