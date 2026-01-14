/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 9017                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/9017                           #+#        #+#      #+#    */
/*   Solved: 2026/01/14 10:34:55 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[N];
			for (int i = 0; i < N; i++)
				arr[i] = Integer.parseInt(st.nextToken());
			System.out.println(calc(N, arr));
		}

	}

	public static int calc(int N, int[] arr) {
		int[] teamMemberCount = new int[201];
		int[] teamScore = new int[202];
		int[] teamScoredMemberCount = new int[201];
		int[] fifthScore = new int[202];

		for (int i = 0; i < N; i++) {
			teamMemberCount[arr[i]]++;
		}
		int rank = 1;
		for (int i = 0; i < N; i++) {
			int team = arr[i];
			if (teamMemberCount[team] == 6) {
				if (teamScoredMemberCount[team] < 4) {
					teamScore[team] += rank;
					teamScoredMemberCount[team]++;
					rank++;
				} else if (teamScoredMemberCount[team] == 4) {
					fifthScore[team] += rank;
					teamScoredMemberCount[team]++;
					rank++;
				} else {
					rank++;
				}
			}
		}
		int lowScoredTeam = 201;
		teamScore[201] = 2147483647;
		for (int team = 1; team <= 200; team++) {
			if (teamMemberCount[team] == 6) {
				if (teamScore[team] < teamScore[lowScoredTeam]) {
					lowScoredTeam = team;
				} else if (teamScore[team] == teamScore[lowScoredTeam]) {
					lowScoredTeam = (fifthScore[team] < fifthScore[lowScoredTeam]) ? team : lowScoredTeam;
				}
			}
		}
		return lowScoredTeam;
	}
}