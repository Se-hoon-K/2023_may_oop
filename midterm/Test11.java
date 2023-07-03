package midterm;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//높이 입력.
		int m = sc.nextInt();//너비 입력.
		sc.close();
		
		int count = 1; //출력 숫자값 초기화
		int temp_count = 0; //역순 출력 숫자값 초기화
		for (int i = 0; i < n; i++) {//높이 반복문
			if (i % 2 == 0) {//정방향 출력 조건 : i값을 2로 나누었을때 나머지가 없을 경우
				
				for (int j = 0; j < m; j++) {// 숫자값 정방향으로 너비 크기만큼 출력.
					System.out.printf("%d ", count);
					count++;// 숫자값 증감식
				}
				
				temp_count = count+m-1;//역순 출력용 숫자값 + 너비값 -1 : 마지막 숫자값 증감식으로 인해 초기값이 1 늘어남.
				count += m;// 다음 차례 정방향 출력시 너비만큼 증가된 시작값 설정용.
				System.out.println();
				
			} else {//역방향 숫자 출력식. 
				for (int j = m; j > 0; j--) {
					System.out.printf("%d ", temp_count);
					temp_count--;//출력값 최대에서 감소.
				}
				System.out.println();

			}

		}
	}

}
