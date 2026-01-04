/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10431                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10431                          #+#        #+#      #+#    */
/*   Solved: 2026/01/04 15:59:04 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int P = Integer.parseInt(br.readLine());
		int N = 0;
		int[] result = new int[P];

		while (N < P) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
			int[] arr = new int[20];
			for (int i = 0; i < 20; i++)
				arr[i] = Integer.parseInt(st.nextToken());

			// TODO : 메인로직
			for (int i = 19; i >= 0; i--) {
				for (int j = i - 1; j >= 0; j--) {
					if (arr[j] > arr[i])
						result[N]++;
				}
			}
			N++;
		}
		for (int n = 1; n <= P; n++)
			System.out.println(n + " " + result[n - 1]);
	}
}