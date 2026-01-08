/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 4659                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/4659                           #+#        #+#      #+#    */
/*   Solved: 2026/01/09 00:27:25 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		while (!input.equals("end")) {
			boolean MoumOK = false;
			boolean seqOK = true;

			// 실험환경
			char[] pw = new char[25];
			for (int i = 0; i < 25; i++)
				pw[i] = '-';
			for (int i = 0; i < input.length(); i++) {
				pw[i] = input.charAt(i);
			}

			// 메인로직
			for (int i = 0; i < input.length(); i++) {
				if (isMoum(pw[i])) MoumOK = true;

				if (pw[i] == pw[i + 1] && pw[i] != '-') {
					if (pw[i] != 'e' && pw[i] != 'o') {
						seqOK = false;
					}
				}
				
				if (isMoum(pw[i]) && isMoum(pw[i + 1]) && isMoum(pw[i + 2])) {
					seqOK = false;
				}

				if (!isMoum(pw[i]) && !isMoum(pw[i + 1]) && !isMoum(pw[i + 2])) {
					if (pw[i + 2] != '-'){
						seqOK = false;
					}
				}
			}

			if (MoumOK && seqOK)
				System.out.printf("<%s> is acceptable.\n", input);
			else
				System.out.printf("<%s> is not acceptable.\n", input);
			input = br.readLine();
		}
	}

	public static boolean isMoum(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			return true;
		return false;
	}
}