/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 31403                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/31403                          #+#        #+#      #+#    */
/*   Solved: 2026/02/07 23:25:00 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int AB = Integer.parseInt("" + A + B);

		System.out.println(A + B - C);
		System.out.println(AB - C);
	}
}