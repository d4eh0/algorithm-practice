import java.io.*;
import java.util.*;

import javax.sound.sampled.Line;

public class Main {
	static int N, M;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];
		visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < M; j++)
				map[i][j] = line.charAt(j) - '0';
		}

		bfs(0, 0);
		System.out.println(map[N - 1][M - 1]);
	}

	static void bfs(int sx, int sy) {
		Queue<int[]> q = new LinkedList<>();
		visited[0][0] = true;
		q.add(new int[]{0, 0});

		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int x = cur[0];
			int y = cur[1];

			for (int d = 0; d < 4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];

				// System.out.println("(" + nx + "," + ny + ")");
				// System.out.println(N + "," + M);
				if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
				if (map[nx][ny] == 0) continue;
				if (visited[nx][ny]) continue;
				
				visited[nx][ny] = true;
				map[nx][ny] = map[x][y] + 1;
				q.add(new int[]{nx, ny});
			}
		}
	}
}




// import java.io.*;
// import java.util.*;

// public class Main {

// 	static int N, M;
// 	static int map[][];
// 	static boolean visited[][];

// 	static int dx[] = {-1, 1, 0, 0};
// 	static int dy[] = {0, 0 , -1, 1};

// 	public static void main(String[] args) throws Exception {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
		
// 		N = Integer.parseInt(st.nextToken());
// 		M = Integer.parseInt(st.nextToken());

// 		map = new int[N][M];
// 		visited = new int[N][M];

// 		for (int i = 0; i < N; i++) {
// 			String line = br.readLine();
// 			for (int j = 0; j < M; j++)
// 				board[i][j] = line.charAt(j) - '0';
// 		}

// 		bfs(0, 0);

// 		System.out.println(map[N - 1][M - 1]);
// 	}

// 	static void bfs(int sx, int sy) {
// 		Queue<int[]> q = new LinkedList<>();
// 		q.add(new int[]{sx, sy});
// 		visited[sx][sy] = true;

// 		while (!q.isEmpty()) {
// 			int[] cur = q.poll();
// 			int x = cur[0];
// 			int y = cur[1];

// 			for (int d = 0; d < 4; d++) {
// 				int nx = x + dx[d];
// 				int ny = y + dy[d];

// 				if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
// 				if (map[nx][ny] == 0) continue;
// 				if (visited[nx][ny]) continue;

// 				visited[nx][ny] = true;
// 				map[nx][ny] = map[x][y] + 1;
// 				q.add(new int[]{nx, ny});
// 			}
// 		}
// 	}
// }