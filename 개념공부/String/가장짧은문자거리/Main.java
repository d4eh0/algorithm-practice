package 가장짧은문자거리;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] arr = st.nextToken().toCharArray();
        char target = st.nextToken().charAt(0);
        int[] answer = new int[arr.length];

        int tmp = 101;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] != target) {
                tmp++;
                answer[i] = tmp;
            } else {
                tmp = 0;
                answer[i] = tmp;
            }
        }
        tmp = 101;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != target) {
               tmp++;
               answer[i] = Math.min(tmp, answer[i]);
            } else {
                tmp = 0;
                answer[i] = Math.min(tmp, answer[i]);
            }
        }
        for (int i : answer)
            System.out.print(i + " ");


    }
}

// 0 1 2 3 3 2 1 0 1 2 3 4 5 6 5 4 3 2 1 0 1 2 3 2 1 0 1 0
// 0 1 2 3 3 2 1 0 1 2 3 4 5 6 5 4 3 2 1 0 1 2 3 2 1 0 1 2


//public class Main {
//
//    public static void main(String args[]) throws Exception {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        char[] text = st.nextToken().toCharArray();
//        ArrayList<Integer> arr = new ArrayList<>();
//        char target = st.nextToken().charAt(0);
//
//        // 타겟찾기
//        for (int i = 0; i < text.length; i++) {
//            if (text[i] == target) {
//                arr.add(i);
//            }
//        }
//
//        // 거리계산
//        for (int i = 0; i < text.length; i++) {
//            int min = Integer.MAX_VALUE;
//            for (int j : arr) {
//                if ( Math.abs(i - j) < min)
//                    min = Math.abs(i - j);
//            }
//            sb.append(min);
//            sb.append(' ');
//        }
//        System.out.println(sb.toString().trim());
//    }
//}