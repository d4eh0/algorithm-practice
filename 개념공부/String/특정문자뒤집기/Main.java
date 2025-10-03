package 특정문자뒤집기;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String text = br.readLine();

        ArrayList<Character> arr = new ArrayList<>();
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            arr.add(c);
            if ( (c >= 65 && c <= 90) || (c >= 97 && c <= 122) ) {
                q.add(c);
            }
        }
        for (int i = text.length() - 1; i >= 0; i--) {
            char c = arr.get(i);
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                arr.set(i, q.poll());
            }
        }

        for (char c : arr) {
            bw.write(c);
        }
        bw.flush();

    }
}