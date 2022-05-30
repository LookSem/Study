package BruteForce;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class No7568 {
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int height[] = new int[N];
		int weight[] = new int[N];
		for (int i = 0; i < N; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			height[i] = x;
			weight[i] = y;
		}
		for (int i = 0; i < N; i++) {
			int cnt = 1;
			for (int j = 0; j < N; j++) {
				if (weight[i] < weight[j] && height[i] < height[j]) {
					cnt++;
				}
			}
		System.out.print(cnt + " ");
		}
		
	}
}
