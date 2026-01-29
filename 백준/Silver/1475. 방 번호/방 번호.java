/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1475                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1475                           #+#        #+#      #+#    */
/*   Solved: 2026/01/29 19:43:02 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int answer = 0;
		int[] count = new int[10];
		
		// 1. 입력받기
		while (N > 0) {
			int tmp = N % 10;
			if (tmp == 9) tmp = 6;
			count[tmp]++;
			N /= 10;
		}

		while (isRemain(count)) {
			answer++;
			for (int i = 0; i < count.length; i++) {
				count[i]--;
				if (i == 6) 
					count[i]--;
			}
		}
		System.out.println(answer);	
	}
	
	public static boolean isRemain(int[] count) {
		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0)
				return true;
		}
		return false;
	}
}