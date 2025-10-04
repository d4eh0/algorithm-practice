package 가장짧은문자거리;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] text = st.nextToken().toCharArray();
        ArrayList<Integer> arr = new ArrayList<>();
        char target = st.nextToken().charAt(0);

        // 타겟찾기
        for (int i = 0; i < text.length; i++) {
            if (text[i] == target) {
                arr.add(i);
            }
        }

        // 거리계산
        for (int i = 0; i < text.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j : arr) {
                if ( Math.abs(i - j) < min)
                    min = Math.abs(i - j);
            }
            sb.append(min);
            sb.append(' ');
        }
        System.out.println(sb.toString().trim());
    }
}