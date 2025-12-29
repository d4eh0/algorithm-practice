/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1919                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1919                           #+#        #+#      #+#    */
/*   Solved: 2025/12/29 22:54:30 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = 0;

		String str1 = br.readLine();
		String str2 = br.readLine();

		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		
		for (int i = 0; i < str1.length(); i++)
			arr1[str1.charAt(i) - 97]++;

		for (int i = 0; i < str2.length(); i++)
			arr2[str2.charAt(i) - 97]++;

		for (int i = 0; i < 26; i++)
			result += Math.abs(arr1[i] - arr2[i]);

		System.out.println(result);
	}
}