package midterm;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("문자열을 입력하시오: ");
		String in = sc.nextLine();
		sc.close();
		int spc_cnt = 0;
		int num_cnt = 0;
		int alph_cnt = 0;
		for(int i = 0; i<in.length();i++) {
			char temp = in.charAt(i);
			if(temp == ' ') {
				spc_cnt++;
			}else if(Character.isLetter(temp)==true) {
				alph_cnt++;
			}else if(Character.isDigit(temp)==true) {
				num_cnt++;
			}
		}
		System.out.printf("알파벳 문자 갯수 = %d\n",alph_cnt);
		System.out.printf("숫자 문자 갯수 = %d\n",num_cnt);
		System.out.printf("스페이스 문자 갯수 = %d",spc_cnt);
	}

}
