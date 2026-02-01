/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1926                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1926                           #+#        #+#      #+#    */
/*   Solved: 2026/02/01 11:59:07 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

import javax.sound.sampled.Line;

public class Main {
	static int N, M;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int maxSize = 0;
	static int count = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		visited = new boolean[N][M];

		// 입력
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}

		// BFS
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++)
				if (!visited[i][j]) {
					if (map[i][j] == 0)
						visited[i][j] = true;
					else
						bfs(i, j);
				}
		}

		System.out.println(count);
		System.out.println(maxSize);
	}
	static void bfs(int sx, int sy) {
		// System.out.println("(" + sx + "," + sy +")");
		Queue<int[]> q = new LinkedList<>();
		visited[sx][sy] = true;
		q.add(new int[]{sx, sy});
		int size = 1;

		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int x = cur[0];
			int y = cur[1];

			for (int d = 0; d < 4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];

				if (nx < 0 || ny < 0 || nx >= N || ny >= M) 
					continue;
				if (map[nx][ny] == 0)
					continue;
				if (visited[nx][ny])
					continue;

				visited[nx][ny] = true;
				size++;
				// System.out.println("(" + nx + "," + ny +")");
				q.add(new int[]{nx, ny});
			}
		}
		maxSize = Math.max(maxSize, size);
		count++;
		// System.out.println("maxSize is :: " + maxSize);
		// System.out.println("count is :: " + count);
	}
}