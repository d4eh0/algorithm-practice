/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10709                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10709                          #+#        #+#      #+#    */
/*   Solved: 2026/01/11 23:34:37 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());

		for (int i = 0; i < H; i++) {
			String line = br.readLine();
			boolean isPresentC = false;
			int cloud = 0;
			for (int j = 0; j < W; j++) {
				if (line.charAt(j) == 'c') {
					isPresentC = true;
					cloud = 0;
				}
				if (isPresentC) {
					bw.write(cloud++ + " ");
				} else {
					bw.write("-1 ");
				}
			}
			bw.newLine();
		}
		bw.flush();
	}
}