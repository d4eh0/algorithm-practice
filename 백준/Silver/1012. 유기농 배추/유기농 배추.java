/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1012                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1012                           #+#        #+#      #+#    */
/*   Solved: 2026/02/02 00:25:38 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {

	static int N, M;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		// 테스트 케이스 루프
		while (T-- > 0) {
			int worm = 0;

			// 세팅
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			map = new int[N][M];
			visited = new boolean[N][M];

			// 배추 다심기
			while (K-- > 0) {
				st = new StringTokenizer(br.readLine());
				int i = Integer.parseInt(st.nextToken());
				int j = Integer.parseInt(st.nextToken());
				map[i][j] = 1;
			}

			// BFS
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (map[i][j] == 1 && !visited[i][j]) {
						bfs(i, j);
						worm++;
					}	
				}
			}

			System.out.println(worm);
			worm = 0;
		}

	}
	static void bfs(int sx, int sy) {
		Queue<int[]> q = new ArrayDeque<>();
		visited[sx][sy] = true;
		q.add(new int[]{sx, sy});

		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int x = cur[0];
			int y = cur[1];

			for (int d = 0; d < 4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];

				if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
				if (visited[nx][ny]) continue;
				if (map[nx][ny] == 0) continue;

				visited[nx][ny] = true;
				q.add(new int[]{nx, ny});
			}
		}
	}
}