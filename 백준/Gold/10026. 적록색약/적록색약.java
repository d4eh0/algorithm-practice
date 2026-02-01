/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10026                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10026                          #+#        #+#      #+#    */
/*   Solved: 2026/02/01 13:24:34 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	
	static int N;
	static char[][] map;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int count = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		map = new char[N][N];
		visited = new boolean[N][N];

		// 입력
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < N; j++)
				map[i][j] = line.charAt(j);
		}

		// 정상 BFS
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) bfs(i, j);
			}
		}
		System.out.print(count + " ");

		// G to R
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				if (map[i][j] == 'G') map[i][j] = 'R';
		}

		// visited 초기화
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				visited[i][j] = false;
		}

		// count 초기화
		count = 0;
		// 색약 BFS
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) bfs(i, j);
			}
		}
		System.out.print(count);
	}

	static void bfs(int sx, int sy) {
		Queue<int []> q = new LinkedList<>();
		char alpha = map[sx][sy];
		q.add(new int[]{sx, sy});
		visited[sx][sy] = true;
		// System.out.println("sx, sy :: (" + sx + "," + sy + ")");

		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int x = cur[0];
			int y = cur[1];

			for (int d = 0; d < 4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];

				if (nx < 0 || ny < 0 || nx >= N || ny >= N)
					continue;
				if (visited[nx][ny])
					continue;
				if (map[nx][ny] != alpha)
					continue;

				visited[nx][ny] = true;
				q.add(new int[]{nx, ny});
			}
		}
		count++;
	}
}