package 문장속단어;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int maxLength = 0;
        String answer = "";

        while (st.hasMoreTokens()) {
            String next = st.nextToken();
            if (next.length() > maxLength) {
                answer = next;
                maxLength = next.length();
            }
        }
        System.out.println(answer);



    }
}

// StringTokenizer로 쪼개고
// int max를 만들어서 문자열들 length()로 비교