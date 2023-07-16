package week9;

public class BoxTest {

	public static void main(String[] args) {
		BoxFrame bf = new BoxFrame(30,20,20);
		System.out.printf("상자의 가로, 세로, 높이는 %d, %d, %d입니다.\n",bf.width,bf.length,bf.height);
		System.out.print(bf.toString());
	}

}
