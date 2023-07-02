package week6;

public class Test {

	public static void main(String[] args) {
		int[] list = new int[5];
		
		for(int e : list) {
			list[e] += 1;
			System.out.println(e);
		}
	}

}
