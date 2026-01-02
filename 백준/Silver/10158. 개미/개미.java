/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10158                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10158                          #+#        #+#      #+#    */
/*   Solved: 2026/01/02 13:28:01 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {

		// 1. 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int p = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());

		int t = Integer.parseInt(br.readLine());

		// 2. 실행
		int dx = 1;
		int dy = 1;
		
		int xT = t % (2 * w);
		int yT = t % (2 * h);
		while (xT-- > 0) {
			if (p == w || p == 0)
				dx *= -1;
			p += dx;
		}
		while (yT-- > 0) {
			if (q == h || q == 0)
				dy *= -1;
			q += dy;
		}
		System.out.printf("%d %d", p, q);
	}
}