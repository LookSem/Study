package BruteForce;

import java.util.Scanner;

public class Test1 {

		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println(result(arr, N, M));
		
	}
	public static int result(int[] arr, int N, int M) {
		int sum = 0;
		for (int i = 0; i < N-2; i++) {
			for (int j = i+1; j < N-1; j++) {
				for (int k = j+1; k < N; k++) {
					int tmp = arr[i] + arr[j] + arr[k];
					if (M==tmp) {
						return tmp;
					}
					if (sum < tmp && tmp < M) {
						sum = tmp;
					}
				}
			}
		}
		return sum;
	}
	
}
