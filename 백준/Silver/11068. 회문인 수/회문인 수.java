/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11068                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11068                          #+#        #+#      #+#    */
/*   Solved: 2026/01/29 14:48:33 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			String text = br.readLine();
			if (check(text) == 1)
				System.out.println(1);
			else {
				changeAndCheck(text);
			}
		}

	}
	public static int check(String text) {
		for (int i = 0, j = text.length() - 1; i <= j; i++, j--) {
			if (text.charAt(i) != text.charAt(j)) {
				return 0;
			}
		}
		return 1;
	}

	public static void changeAndCheck(String text) {
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(text);
		Stack<Integer> stack = new Stack<>();
		
		int B = 2;
		while (B <= 64) {
			int num = N;
			while (num > 0) {
				stack.push(num % B);
				num /= B;
			}
			while (!stack.isEmpty()) {
				int n = stack.pop();
				if (n >= 10) {
					sb.append((char) (n + 55));
				} else {
					sb.append((char) (n + 48));
				}
				
			}
			if (check(sb.toString()) == 1) {
				System.out.println(1);
				return;
			}
			sb.setLength(0);
			B++;
			stack.clear();
		}
		System.out.println(0);
	}
}