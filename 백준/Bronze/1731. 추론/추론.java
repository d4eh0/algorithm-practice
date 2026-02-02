/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1731                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1731                           #+#        #+#      #+#    */
/*   Solved: 2026/02/02 18:29:49 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int flag = 1;

		// 입력 
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(br.readLine());
			
		// 솔루션
		if (arr[2] - arr[1] == arr[1] - arr[0]) flag = 0;
		if (flag == 0)
			System.out.println(arr[N - 1] += arr[1] - arr[0]);
		else
			System.out.println(arr[N - 1] *= arr[1] / arr[0]);
	}
}