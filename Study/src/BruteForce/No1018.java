package BruteForce;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class No1018 {
	static int min;
	static char board[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		int N = in.nextInt();
		board = new char[M][N];
		in.nextLine();
		for (int i = 0; i < M; i++) {
			String str  = in.nextLine();
			for (int j = 0; j < N; j++) {
				board[i][j] = str.charAt(j);
				board[i][j] = str.charAt(j);
			}
		}
		int M_cnt = M-7;
		int N_cnt = N-7;
		for (int i = 0; i < M_cnt; i++) {
			for (int j = 0; j < N_cnt; j++) {
				find(i,j);
			}
		}
		System.out.println(min);
	}
	static void find(int x, int y) {
		int x_end = x+8;
		int y_end = y+8;
		int Bcnt = 0;
		int Wcnt = 0;
		for (int i = 0; i < x_end; i++) {
			for (int j = 0; j < y_end; j++) {
				if ((i+j)%2==0) {
					if (board[i][j] == 'B') Wcnt++; 
					else Bcnt++;
				}else {
					if (board[i][j] == 'W') Wcnt++; 
					else Bcnt++;
				}
				
			}
		}
		min = Math.min(Bcnt, Wcnt);
	}
	
}
