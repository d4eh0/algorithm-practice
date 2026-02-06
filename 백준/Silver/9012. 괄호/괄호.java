/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 9012                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/9012                           #+#        #+#      #+#    */
/*   Solved: 2026/02/06 17:29:50 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		while (N-- > 0)
			System.out.println(check(br.readLine()));
	}
	
	static String check(String input) {
		Stack<Character> stack = new Stack<>();

			for (int i = 0; i < input.length(); i++) {
				char next = input.charAt(i);
				if (next == '(') {
					stack.push(next);
				} else {
					if (stack.isEmpty()) {
						return "NO";
					} else
						stack.pop();
				}
			}
			if (stack.isEmpty())
				return "YES";
			else
				return "NO";
	}
}