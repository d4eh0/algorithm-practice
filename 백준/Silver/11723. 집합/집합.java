import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int S = 0; // S = 0000 0000 0000 0000 0000 0000 0000 0000
        int N = Integer.parseInt(br.readLine());

        while(N-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("empty")) {
                S = 0; // S에 0000 0000 ... 0000을 대입
            } else if(command.equals("all")) {
                S = ~0; // S에 1111 1111 ... 1111을 대입
            } else {
                int num = Integer.parseInt(st.nextToken());
                switch (command) {
                    case "add" : {
                        S |= (1 << num-1); // num-1만큼 왼쪽으로 shift(= 오른쪽에 0을 추가)
                        break;
                    }
                    case "remove" : {
                        S &= ~(1 << num-1);
                        break;
                    }
                    case "check" : {
                        sb.append((S & (1 << (num - 1))) != 0 ? 1 : 0);
                        sb.append("\n");
                        break;
                    }
                    case "toggle" : {
                        S ^= (1 << num-1);
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}