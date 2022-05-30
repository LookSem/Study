package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class No2178 {
	static int [][] map;
	static int n,m;
	static boolean [][] visited;
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			String s = in.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = s.charAt(j) -'0';
			}
		}
		visited = new boolean[n][m];
		visited[0][0] = true;
		find(0, 0);
		System.out.println(map[n-1][m-1]);
	}
	static void find(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x,y});
		while (!q.isEmpty()) {
			int now[] = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			
			for (int i = 0; i < 4; i++) {
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];
				
				if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) {
					continue;
				}
				if (visited[nextX][nextY] || map[nextX][nextY]==0) {
					continue;
				}
				q.add(new int[] {nextX, nextY});
				map[nextX][nextY] = map[nowX][nowY] +1;
				visited[nextX][nextY] = true;
			}
		}
	}
}
