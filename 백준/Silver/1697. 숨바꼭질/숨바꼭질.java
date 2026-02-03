/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1697                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1697                           #+#        #+#      #+#    */
/*   Solved: 2026/02/02 00:25:57 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {

	static int N, K;
	static int[] map = new int[100001];
	static boolean[] visited = new boolean[100001];
	static int[] dx = {-1, 1, 2};

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		if (N == K) {
			System.out.println(0);
			return;
		}

		map[K] = -1; 

		for (int i = 0; i < 100001; i++) {
				if (map[i] == 0) bfs(N);
		}
	}

	static void bfs(int sx) {
		Queue<Integer> q = new ArrayDeque<>();
		visited[sx] = true;
		q.add(sx);

		while(!q.isEmpty()) {
			int x = q.poll();

			// 걷기
			for (int d = 0; d < 3; d++) {
				int nx;
				if (d < 2)
					nx = x + dx[d];
				else 
					nx = x * 2;
				if (nx < 0 || nx >= 100001) continue;
				if (visited[nx]) continue;
				if (map[nx] == -1) {
					map[nx] = map[x] + 1;
					System.out.println(map[nx]);
					return;
				}

				visited[nx] = true;
				map[nx] = map[x] + 1;
				q.add(nx);
			}
		}
	}
}

// -1 : 동생
// 0 : 안감
// 1+ : 걸림


// 텔포도 하고 걷기도 두번하고 q빌때까지 반복!!!