package Recursive;

import java.util.Scanner;

public class Test1 {
	public static int fact(int num) {
		if (num<=1) return 1;
		else return num*(fact(num-1));
			
	}
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(fact(N));
	}
}
