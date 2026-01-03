/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1236                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1236                           #+#        #+#      #+#    */
/*   Solved: 2026/01/03 19:32:39 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		char[][] board = new char[N][M];

		for (int row = 0; row < N; row++)
			board[row] = br.readLine().toCharArray();

		// 구현
		int rowCount = 0;
		int colCount = 0;

		// 1. row count
		for (int i = 0; i < N; i++) {
			boolean thisRowIsProtected = false;
			for (int j = 0; j < M; j++) {
				if (board[i][j] == 'X') {
					thisRowIsProtected = true;
					break;
				}
			}
			if (!thisRowIsProtected) rowCount++;
		}
		
		// 2. col count
		for (int j = 0; j < M; j++) {
			boolean thisColIsProtected = false;
			for (int i = 0; i < N; i++) {
				if (board[i][j] == 'X') {
					thisColIsProtected = true;
					break;
				}
			}
			if (!thisColIsProtected) colCount++;
		}
		System.out.println(Math.max(rowCount, colCount));

	}
}