/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2744                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: eogud3332 <boj.kr/u/eogud3332>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2744                           #+#        #+#      #+#    */
/*   Solved: 2025/12/29 21:11:05 by eogud3332     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.nextLine().toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (Character.isUpperCase(arr[i]))
				arr[i] = Character.toLowerCase(arr[i]);
			else
				arr[i] = Character.toUpperCase(arr[i]);
		}
		for (char c : arr) {
			System.out.print(c);
		}
	}
}