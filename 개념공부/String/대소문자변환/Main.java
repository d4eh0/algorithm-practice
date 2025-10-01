package 대소문자변환;

import java.util.*;
import java.io.*;

import static java.lang.Character.*;

public class Main {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String text = br.readLine();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (isLowerCase(c))
                bw.write(toUpperCase(c));
            else
                bw.write(toLowerCase(c));
        }
        bw.flush();
        bw.close();

    }
}