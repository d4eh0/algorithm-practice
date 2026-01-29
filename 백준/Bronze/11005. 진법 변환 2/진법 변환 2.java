/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11005                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11005                          #+#        #+#      #+#    */
/*   Solved: 2026/01/29 13:39:20 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		if (N == B) {
			System.out.println(10);
			return;
		}

		Stack<Integer> stack = new Stack<>();
		
		while (N > 0) {
			stack.push(N % B);
			N /= B;
		}

		while (!stack.isEmpty()) {
			int num = stack.pop();
			if (num >= 10) {
				System.out.print((char) (num + 55));
			} else {
				System.out.print(num);
			}
		}
	}
}