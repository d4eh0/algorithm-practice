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

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		Arrays.fill(map, -1);

		bfs(N);
	}

	static void bfs(int sx) {
		Queue<Integer> q = new ArrayDeque<>();
		map[sx] = 0;
		q.add(sx);

		while(!q.isEmpty()) {
			int x = q.poll();

			if (x == K) {
				System.out.println(map[x]);
				return;
			}
			
			if (x - 1 >= 0 && x - 1 < 100001 && map[x - 1] == -1) {
				map[x - 1] = map[x] + 1;
				q.add(x - 1);
			}

			if (x + 1 >= 0 && x + 1 < 100001 && map[x + 1] == -1) {
				map[x + 1] = map[x] + 1;
				q.add(x + 1);
			}

			if (x * 2 >= 0 && x * 2 < 100001 && map[x * 2] == -1) {
				map[x * 2] = map[x] + 1;
				q.add(x * 2);
			}
		}
	}
}

// -1 : 동생
// 0 : 안감
// 1+ : 걸림


// 텔포도 하고 걷기도 두번하고 q빌때까지 반복!!!