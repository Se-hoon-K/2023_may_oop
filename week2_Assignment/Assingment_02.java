package week2_Assignment;

public class Assingment_02 {

	public static void main(String[] args) {
		char t = 'T';
		for(int k = 1;k<=2;k++) { //줄 바꿈용
			for(int i = 1;i<=10;i++) { // t출력용 반복문(10회)
				System.out.print(t);
			}
			System.out.println();
		}
		for(int k = 1;k<=2;k++) { //줄 바꿈용
			for(int a=1;a<=4;a++) { //T 출력 전 공백 생성용
				System.out.print(" ");
			}
			for(int i = 1;i<=2;i++) { // t출력용 반복문(2회)
				System.out.print(t);
			}
			System.out.println();
		}

	}

}
