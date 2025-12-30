/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1157                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1157                           #+#        #+#      #+#    */
/*   Solved: 2025/12/30 14:44:36 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char mostAlpha = 'A';
		int mostCount = 0;
		boolean dup = false;
		char[] input = br.readLine().toUpperCase().toCharArray();
		// System.out.println(input);
		int[] count = new int[26];
		for (char c : input)
			count[c - 'A']++;
		for (int i = 0; i < 26; i++) {
			if (count[i] > mostCount) {
				dup = false;
				mostCount = count[i];
				mostAlpha = (char)('A' + i);
			} else if (count[i] == mostCount) {
				dup = true;
			}
		}
		if (dup)
			System.out.println('?');
		else
			System.out.println(mostAlpha);
	
	}
}