/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10845                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10845                          #+#        #+#      #+#    */
/*   Solved: 2026/01/31 19:34:23 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> dq = new ArrayDeque<>();

		while (N-- > 0) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
				case "push" :
					dq.offerLast(Integer.parseInt(st.nextToken()));
					break;
				case "pop" :
					if (dq.isEmpty())
						bw.write("-1\n");
					else
						bw.write(dq.pollFirst() + "\n");
					break;
				case "size" :
					bw.write(dq.size() + "\n");
					break;
				case "empty" :
					if (dq.isEmpty())
						bw.write("1\n");
					else
						bw.write("0\n");
					break;
				case "front" :
					if (dq.isEmpty())
						bw.write("-1\n");
					else
						bw.write(dq.peekFirst() + "\n");
					break;
				case "back" :
					if (dq.isEmpty())
						bw.write("-1\n");
					else
						bw.write(dq.peekLast() + "\n");
					break;
			}
		}
		bw.flush();
		bw.close();
	}
}