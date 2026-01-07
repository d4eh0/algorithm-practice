/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10448                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10448                          #+#        #+#      #+#    */
/*   Solved: 2026/01/07 15:37:00 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		// 1. 모든 삼각수 구하기
		int[] triNumbers = new int[50];
		int triIdx = 0;
		int triNum;
		for (int i = 1; ; i++) {
			triNum = i * (i + 1) / 2;
			if (triNum > 1000) break;
			triNumbers[triIdx++] = triNum;
		}

		// 2. 모든 유레카넘버 구하기
		boolean[] isUrekaNumbers = new boolean[1001];
		for (int i = 0; i < triIdx; i++) {
			for (int j = 0; j < triIdx; j++) {
				for (int k = 0; k < triIdx; k++) {
					int sum = triNumbers[i] + triNumbers[j] + triNumbers[k];
					if (sum <= 1000) isUrekaNumbers[sum] = true;
				}
			}
		}

		// 3. 테스트케이스 실행
		while (T-- > 0) {			
			int num = Integer.parseInt(br.readLine());
			if (isUrekaNumbers[num]) System.out.println(1);
			else System.out.println(0);
		}

	}
}