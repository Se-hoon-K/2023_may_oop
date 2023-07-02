package week6_Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		ArrayList<Integer> count;
		count = new ArrayList<>();
		
		for(int i = 0; i<n;i++) {
			a[i] = sc.nextInt();
			if(a[i]<x) {
				count.add(a[i]);
			}
		}
		for(Integer k : count) {
			System.out.print(k + " ");
		}
		sc.close();
	}

}
