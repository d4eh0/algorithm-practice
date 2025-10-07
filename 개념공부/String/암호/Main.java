package 암호;

import java.util.*;
import java.io.*;

// substring, replace, parseInt(String s, int radix)
public class Main {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String text = br.readLine();

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(
                    text.substring(0, 7).replace('#', '1').replace('*', '0'), 2);
            System.out.print((char) a);
            text = text.substring(7);
        }
    }
}

//public class Main {
//    public static void main(String args[]) throws Exception {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int count = Integer.parseInt(br.readLine());
//        String text = br.readLine();
//
//        for (int i = 0; i < count; i++) {
//            char[] arr = new char[7];
//            for (int j = 0; j < 7; j++) {
//                arr[j] = text.charAt(i * 7 + j);
//            }
//            System.out.print((char) toDecimal(arr));
//        }
//    }
//
//    public static int toDecimal(char[] arr) {
//        int i = 6;
//        int result = 0;
//        for (char c : arr) {
//            if (c == '#')
//                result += Math.pow(2, i);
//            i--;
//        }
//        return result;
//    }
//}