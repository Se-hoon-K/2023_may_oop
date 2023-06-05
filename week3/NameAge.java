package week3;

import java.util.Scanner;

public class NameAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nme;
		int age;
		
		System.out.print("이름을 입력하시오: ");
		nme = sc.next();
		
		System.out.print("나이를 입력하시오: ");
		age = sc.nextInt();
		
		System.out.println(nme +"님 안녕하세요! " + age +"살 이시네요!");
		
		
		
	}

}
