/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10773                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10773                          #+#        #+#      #+#    */
/*   Solved: 2026/01/29 20:32:11 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		int answer = 0;
		Stack<Integer> stack = new Stack<>();

		while (K-- > 0) {
			int num = Integer.parseInt(br.readLine());
			if (num == 0) {
				if (!stack.isEmpty())
					stack.pop();
			} else {
				stack.push(num);
			}
		}
		
		while (!stack.isEmpty())
			answer += stack.pop();

		System.out.println(answer);
	}
}
