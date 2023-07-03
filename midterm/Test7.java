package midterm;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[3][5];
		int max = 0;
		for(int i = 0 ; i<3;i++) {
			System.out.printf("%d반 : ",i+1);
			for(int j = 0; j<5;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0 ; i<3;i++) {
			double avg = 0;
			for(int j = 0; j<5;j++) {
				avg += arr[i][j];
				if(max < arr[i][j]) {
					max = arr[i][j];
				}
			}
			avg = avg/5;
			System.out.println(i+1+"반 평균 : "+avg);
		}
		System.out.printf("1학년 최고 점수 : %d",max);
		sc.close();
	}

}
