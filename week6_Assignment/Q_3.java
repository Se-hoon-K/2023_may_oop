package week6_Assignment;

import java.util.Scanner;

public class Q_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i =0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int min=arr[0], max=arr[0];
		
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.printf("%d %d",min,max);
		sc.close();
	}

}
