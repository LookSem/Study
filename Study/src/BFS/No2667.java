package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No2667 {
	static int n;
	static int map[][];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static boolean visited[][];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		n = Integer.parseInt(st.nextToken());
		map = new int[n][n];
		for (int i = 0; i < n; i++) {
			String s = in.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}
		visited = new boolean[n][n];
		visited[0][0] = true;
		find(0,0);
	}
	static void find(int x, int y) {		
		Queue<int []> q = new LinkedList<>();
		q.add(new int[] {x,y});
		while (!q.isEmpty()) {
			int now[] = q.poll();
			int nowX = now[0]; 
			int nowY = now[1]; 
			for (int i = 0; i < 4; i++) {
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];
				
				if (nextX < 0 || nextY < 0 || nextX > n || nextY > n) {
					continue;
				}
				if (visited[nextX][nextY] || map[nextX][nextY]==0) {
					continue;
				}
				q.add(new int[] {nextX,nextY});
				visited[nextX][nextY] = true;
			}
		}
	}
}
