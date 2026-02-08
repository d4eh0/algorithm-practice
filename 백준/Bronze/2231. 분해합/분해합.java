/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2231                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2231                           #+#        #+#      #+#    */
/*   Solved: 2026/02/08 20:31:26 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int start = Math.max(1, N - 54); // 🔥 핵심 최적화

        for (int i = start; i <= N; i++) {
            int cur = i;
            int result = i;

            while (cur > 0) {
                result += cur % 10;
                cur /= 10;
            }

            if (result == N) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(0);
    }
}
