/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1676                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1676                           #+#        #+#      #+#    */
/*   Solved: 2026/02/05 22:03:23 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int answer = 0;
		int fiveCount = 0;
		int twoCount = 0;

		while (N > 1) {
			int cur = N--;

			while (cur % 5 == 0 && cur >= 5) {
				fiveCount++;
				cur /= 5;
			}
			while (cur % 2 == 0 && cur >= 2) {
				twoCount++;
				cur /= 2;
			}
		}
		answer = Math.min(twoCount, fiveCount);

		System.out.println(answer);
	}
}