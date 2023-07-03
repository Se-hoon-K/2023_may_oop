package midterm;

public class Test9 {

	public static void main(String[] args) {
		char ch = 'A';
		int temp = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.printf(" ");
			}
			for (int k = 0; k < i+1; k++) {
				System.out.print((char)(ch+temp));
				temp++;
			}
			System.out.printf("\n");
		}
	}
}
