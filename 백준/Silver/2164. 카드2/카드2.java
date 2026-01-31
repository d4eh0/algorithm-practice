import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> dq = new ArrayDeque<>();
		for (int i = 1; i <= N; i++)
			dq.offer(i);
		while (N-- > 0) {
			if (dq.size() == 1) {
				System.out.println(dq.pollFirst());
				return;
			}
			dq.pollFirst();
			if (dq.size() == 1) {
				System.out.println(dq.pollFirst());
				return;
			}
			//int front = dq.pollFirst();
			dq.offerLast(dq.pollFirst());

		}
	}
}