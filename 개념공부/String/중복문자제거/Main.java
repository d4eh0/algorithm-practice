package 중복문자제거;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String text = br.readLine();
        HashMap<Character, Boolean> h = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (!h.getOrDefault(c, false)) {
                h.put(c, true);
                bw.write(c);
            } else {
                continue;
            }
        }
        bw.flush();
        bw.close();
    }
}