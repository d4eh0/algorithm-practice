/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10828                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10828                          #+#        #+#      #+#    */
/*   Solved: 2026/01/29 20:15:59 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();

		while (N-- > 0) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
				case "push":
					stack.push(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					if (stack.isEmpty()) System.out.println(-1);
					else System.out.println(stack.pop());
					break;
				case "size":
					System.out.println(stack.size());
					break;
				case "empty":
					if (stack.isEmpty()) System.out.println(1);
					else System.out.println(0);
					break;
				case "top":
					if (stack.isEmpty()) System.out.println(-1);
					else System.out.println(stack.peek());
					break;	
			}
		}
	}
}