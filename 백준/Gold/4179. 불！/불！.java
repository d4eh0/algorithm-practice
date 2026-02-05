import java.io.*;
import java.util.*;

public class Main {

    static int R, C;
    static char[][] map;
    static int[][] fireTime;
    static int[][] jihoonTime;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        fireTime = new int[R][C];
        jihoonTime = new int[R][C];

        
        for (int i = 0; i < R; i++) {
            Arrays.fill(fireTime[i], Integer.MAX_VALUE);
            Arrays.fill(jihoonTime[i], -1);
        }

        int[] start = new int[2];
        Queue<int[]> q = new ArrayDeque<>();

        for (int i = 0; i < R; i++) {
            String line = br.readLine(); 
            for (int j = 0; j < C; j++) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'J') {
                    start[0] = i;
                    start[1] = j;
                }
                if (map[i][j] == 'F') {
                    q.add(new int[]{i, j});
                    fireTime[i][j] = 0;
                }
            }
        }   

        bfsFire(q);
        bfsJihoon(start[0], start[1]);
    }

    static void bfsFire(Queue<int[]> q) {

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
                if (map[nx][ny] == '#' || fireTime[nx][ny] != Integer.MAX_VALUE) continue;
                
                fireTime[nx][ny] = fireTime[x][y] + 1;
                q.add(new int[]{nx, ny});
            }
        }
    }

    static void bfsJihoon(int sx, int sy) {
        Queue<int[]> q = new ArrayDeque<>();
        jihoonTime[sx][sy] = 0; 
        q.add(new int[]{sx, sy});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            
            if (x == 0 || y == 0 || x == R - 1 || y == C - 1) {
                System.out.println(jihoonTime[x][y] + 1);
                return;
            }

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
                if (map[nx][ny] == '#' || jihoonTime[nx][ny] != -1) continue;
                
                
                if (fireTime[nx][ny] <= jihoonTime[x][y] + 1) continue;
                
                jihoonTime[nx][ny] = jihoonTime[x][y] + 1;
                q.add(new int[]{nx, ny});
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}