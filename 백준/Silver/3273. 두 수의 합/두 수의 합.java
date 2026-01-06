/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 3273                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/3273                           #+#        #+#      #+#    */
/*   Solved: 2026/01/06 18:57:57 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ans = 0;
		int n = Integer.parseInt(br.readLine());
		int[] count = new int[1000001];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			int next = Integer.parseInt(st.nextToken());
			count[next]++;
		}

		int x = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= (x - 1) / 2; i++) {
			if (i <= 100000 && x - i <= 100000)
				ans += (count[i] > 0 && count[x - i] > 0) ? 1 : 0;
		}
		System.out.println(ans);
	}
}