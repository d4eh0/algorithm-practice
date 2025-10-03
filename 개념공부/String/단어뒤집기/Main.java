package 단어뒤집기;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String text = br.readLine();
            for (int i = text.length() - 1; i >= 0; i--)
                bw.write(text.charAt(i));
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}