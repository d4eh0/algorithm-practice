/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 7568                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/7568                           #+#        #+#      #+#    */
/*   Solved: 2026/01/13 08:22:28 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		int[][] size = new int[N][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			size[i][0] = Integer.parseInt(st.nextToken());
			size[i][1] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			int rank = 1;
			for (int j = 0; j < N; j++) {
				if (size[i][0] < size[j][0] && size[i][1] < size[j][1])
					rank++;
			}
			System.out.print(rank + " ");
		}
	}
}