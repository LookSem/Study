package Recursive;

import java.util.Scanner;

public class Test2 {
	static int sum = 0;
	public static int fi(int x) {	
		if (x==0) return 0;
		if (x==1) return 1;
		return fi(x-1) + fi(x-2);
		
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(fi(N));
		
	}

}

