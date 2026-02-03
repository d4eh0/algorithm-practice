/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 7576                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/7576                           #+#        #+#      #+#    */
/*   Solved: 2026/02/02 00:25:51 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {

	static int maxTime = 0;
	static Queue<int[]> q = new ArrayDeque<>();

	static int N, M;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		visited = new boolean[N][M];
		
		// 입력
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}

		// bfs
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 1 && !visited[i][j]) {
					visited[i][j] = true;
					q.add(new int[]{i,j});
				}
			}
		}

		bfs();

		// for(int[] arr : map)
		// 	System.out.println(Arrays.toString(arr));

		// 다 잘 익었는지 확인
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				maxTime = Math.max(maxTime, map[i][j]);
				if (map[i][j] == 0) {
					System.out.println("-1");
					return;
				}
			}
		}
		System.out.println(maxTime - 1);
	}

	static void bfs() {

		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int x = cur[0];
			int y = cur[1];

			for (int d = 0; d < 4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];

				if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
				if (map[nx][ny] == -1) continue;
				if (visited[nx][ny]) continue;

				if (map[nx][ny] == 0) {
					visited[nx][ny] = true;
					map[nx][ny] = map[x][y] + 1;
					q.add(new int[]{nx, ny});
				}
			}
		}
	}
}

// -1을 만나면?
// 0을 만나면?

// 1 0 2 0 0
// 0 0 2 0 0
// 0 0 2 0 1
// 0 0 2 0 0
// = 4

//여러 군데에서 동시에 퍼져야함 !