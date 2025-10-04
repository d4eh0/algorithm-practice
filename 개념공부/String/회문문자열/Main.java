package 회문문자열;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        int lo = 0, hi = text.length() - 1;
        char[] arr = text.toUpperCase().toCharArray();

        while (lo < hi) {
            if (arr[lo] != arr[hi]) {
                System.out.println("NO");
                return;
            }
            lo++;
            hi--;
        }
        System.out.println("YES");

    }
}