/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10101                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10101                          #+#        #+#      #+#    */
/*   Solved: 2026/01/31 21:08:03 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());

		if (a == b && b == c && c == 60) {
			System.out.println("Equilateral");
		} else if ((a == b || b  == c || a == c) && a + b + c == 180){
			System.out.println("Isosceles");
		} else if ((a != b && b != c && a != c) && a + b + c == 180){
			System.out.println("Scalene");
		} else if (a + b + c != 180) {
			System.out.println("Error");
		}
	}
}