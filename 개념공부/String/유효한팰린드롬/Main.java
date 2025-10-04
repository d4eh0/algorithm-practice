package 유효한팰린드롬;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        int lo = 0, hi = text.length() - 1;
        char[] arr = text.toUpperCase().toCharArray();

        while (lo < hi) {
            if (!Character.isAlphabetic(arr[lo])) {
                lo++;
            }
            if (!Character.isAlphabetic(arr[hi])) {
                hi--;
            }
            if (Character.isAlphabetic(arr[lo]) && Character.isAlphabetic(arr[hi])) {
                if (arr[lo] != arr[hi]) {
                    System.out.println("NO");
                    return;
                }
                lo++;
                hi--;
            }
        }
        System.out.println("YES");


    }
}