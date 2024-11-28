import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[21];
        int N = Integer.parseInt(br.readLine());

            for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("empty")) {
                for (int j=0; j<arr.length; j++) arr[j] = 0;
            } else if(command.equals("all")) {
                for (int j=0; j<arr.length; j++) arr[j] = 1;
            } else {
                int num = Integer.parseInt(st.nextToken());
                switch (command) {
                    case "add" : {
                        if (arr[num] != 1) arr[num]++;
                        break;
                    }
                    case "remove" : {
                        if (arr[num] == 1) arr[num]--;
                        break;
                    }
                    case "check" : {
                        if (arr[num] == 1) sb.append(1).append("\n");
                        else sb.append(0).append("\n");
                        break;
                    }
                    case "toggle" : {
                        if (arr[num] != 1) arr[num]++;
                        else arr[num]--;
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}