/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2583                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2583                           #+#        #+#      #+#    */
/*   Solved: 2026/02/03 09:56:58 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {

	static int N, M, K;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		map = new int[M][N];
		visited = new boolean[M][N];

		int cnt = 0;
		ArrayList<Integer> list = new ArrayList<>();

		// 다 칠해주고
		while (K-- > 0) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());

			for  (int i = b; i < d; i++) {
				for (int j = a; j < c; j++)
					map[i][j] = 1;
			}
		}
		// bfs
		for  (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 0 && !visited[i][j]) {
						cnt++;
						list.add(bfs(i, j));
					}
				}
			}

		System.out.println(cnt);
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
	}
	static int bfs(int sx, int sy) {
		int size = 1;
		Queue<int[]> q = new ArrayDeque<>();
		visited[sx][sy] = true;
		q.add(new int[]{sx, sy});

		while(!q.isEmpty()) {
			int[] cur = q.poll();
			int x = cur[0];
			int y = cur[1];

			for (int d = 0; d < 4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];

				if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
				if (visited[nx][ny]) continue;
				if (map[nx][ny]!= 0) continue;

				visited[nx][ny] = true;
				q.add(new int[]{nx, ny});
				size++;
			}
		}
		return(size);
	}
}