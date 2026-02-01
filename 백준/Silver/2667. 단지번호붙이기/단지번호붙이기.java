/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2667                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2667                           #+#        #+#      #+#    */
/*   Solved: 2026/02/01 23:13:07 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	
	static int N;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	static ArrayList<Integer> list = new ArrayList<>();
	static int count = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		map = new int[N][N];
		visited = new boolean[N][N];
		
		// 입력
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < N; j++)
				map[i][j] = line.charAt(j) - '0';
		}

		// BFS
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 0) {
					visited[i][j] = true;
					continue;
				}
				if (!visited[i][j])
					bfs(i, j);
			}
		}
		
		// 출력
		System.out.println(count);
		Collections.sort(list);
		for (int n : list)
			System.out.println(n);

	}

	static void bfs(int sx, int sy) {
		int num = map[sx][sy];
		Queue<int[]> q = new ArrayDeque<>();
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
				
				if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
				if (visited[nx][ny]) continue;
				if (map[nx][ny] != num) continue;

				visited[nx][ny] = true;
				size++;
				q.add(new int[]{nx, ny});
			}
		}
		list.add(size);
		count++;
	}
}