import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] adj;
    static boolean[] isVisit;
    static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        adj = new ArrayList[N+1]; // 인접한 노드를 저장
        // ArrayList<Integer>[] adj = new ArrayList<Integer>[N+1]; 처럼 바로 제네릭 배열 생성은 허용x
        // 선언 후 반복문을 통해 따로 할당해줘야한다.
        // 왜? 타입안정성 때문, 제네릭은 컴파일 타임에, 배열은 런타임 타임에 이루어지므로.

        // 또는 ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
        for(int i=1; i<N+1; i++) {
            adj[i] = new ArrayList<Integer>();
        }


        isVisit = new boolean[N+1];
        // ArrayList<Boolean> visted = new ArrayList<>();
        for(int i=1; i<N+1; i++) {
            isVisit[i] = false;
        }

        for(int i=0; i<N-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);
            adj[b].add(a);
        }
        parents = new int[N+1];
        DFS(1);

        for(int i=2; i<N+1; i++){
            System.out.println(parents[i]);
        }
    }
    public static void DFS(int x) {
        if(isVisit[x]) return; // 방문했다면 바로 빠져나옴
        isVisit[x] = true;
        for(int i : adj[x]) {
            if (!isVisit[i]) {
                parents[i] = x;
                DFS(i);
            }
        }
    }
}

// BFS(큐), DFS(스택) 으로도 풀어볼것.    
// Set, List, Vector, ArrayList 등 자바의 컬렉션들 알아보기.