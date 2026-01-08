/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 14467                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/14467                          #+#        #+#      #+#    */
/*   Solved: 2026/01/09 00:02:57 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int cnt = 0;
		int N = Integer.parseInt(st.nextToken());
		int[] cows = new int[11];
		for (int i = 0; i <= 10; i++)	// Arrays.fill(cows, -1);
			cows[i] = -1;

		while (N-- > 0) {
			st = new StringTokenizer(br.readLine()); 
			int cowNumber = Integer.parseInt(st.nextToken());
			int dir = Integer.parseInt(st.nextToken());

			if (cows[cowNumber] == -1) {
				cows[cowNumber] = dir;
				continue;
			} 	
			if (cows[cowNumber] != dir) {
				cows[cowNumber] = dir;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}