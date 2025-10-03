package 문자찾끼;

import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine().toLowerCase();
        char target = br.readLine().toLowerCase().charAt(0);
        int count = 0;

        for(int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target ) {
                count++;
            }
        }
        System.out.println(count);
    }
}