/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1874                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1874                           #+#        #+#      #+#    */
/*   Solved: 2026/01/29 20:45:49 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int n = 1;

		while (N > 0) {
			int cur = Integer.parseInt(br.readLine());
			while (n <= cur) {
				stack.push(n++);
				sb.append("+\n");
			}
			if (stack.peek() == cur) {
				stack.pop();
				sb.append("-\n");
				N--;
			} else {
				sb.setLength(0);
				sb.append("NO");
				System.out.println(sb.toString());
				return;
			}
		}
		System.out.println(sb.toString());
	}
}

// peek 전에 스택에 비어있으면 일단 push
// peek 했는데 cur보다 크면 -> NO
// peek 했는데 cur보다 작으면 -> push
// peek 했는데 cur과 같으면 -> pop, continue