package 문자열압축;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        sb.append(br.readLine());
        sb.append('@');
        char[] arr = sb.toString().toCharArray();

        int cnt = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] == arr[i]) {
                cnt++;
            }
            else {
                bw.write(arr[i]);
                if (cnt > 1) bw.write(cnt + 48);
                cnt = 1;
            }
        }
        bw.flush();
    }
}