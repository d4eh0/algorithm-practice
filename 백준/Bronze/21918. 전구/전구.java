/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 21918                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/21918                          #+#        #+#      #+#    */
/*   Solved: 2026/01/10 13:24:06 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int light[] = new int[N + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++)
			light[i] = Integer.parseInt(st.nextToken());

		while (M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if (a == 1) {
				light[b] = c;
			} else {
				switch(a) {
					case 2 :
						for (int i = b; i <= c; i++)
							light[i] = (light[i] == 0) ? 1 : 0;
						break;
					case 3 :
						for (int i = b; i <= c; i++)
							light[i] = 0;
						break;
					case 4 :
						for (int i = b; i <= c; i++)
							light[i] = 1;
						break;
				}
			}
		}
		for (int i = 1; i <= N; i++)
			System.out.print(light[i] + " ");

	}
}