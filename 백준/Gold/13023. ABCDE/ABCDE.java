import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Main {
    static ArrayList<Integer>[] arr;
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new ArrayList[N];
        visited = new boolean[N];
        for (int node = 0; node < N; node++) {
            arr[node] = new ArrayList<Integer>(); // 관계
        } // 선언은 완료, 초기화는 아직

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arr[start].add(end);
            arr[end].add(start); // 같은 친구 관계가 두 번 이상 주어지는 경우는 없다.
            // 있다면?
        } // 친구노드와 방문여부 초기화 완료

        for(int i = 0; i < N; i++) {
            if(!visited[i]) {
                DFS(i,0);
            }
        }
        System.out.println(0);
    }
    static void DFS(int v, int count) {
        count++;
        if(count == 5) {
            System.out.println(1);
            System.exit(0);
        }
        visited[v] = true;
        for(int i : arr[v]) {
            if(!visited[i]) {
                DFS(i,count);
            }
        }
        visited[v] = false;
    }
}