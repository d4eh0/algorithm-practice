import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int idx = 1;
        int[] arr = new int[n + 1]; // 1 2 3 ...
        for (int i = 0; i <= n; i++)
            arr[i] = 1;
        for (int i = 0; i < section.length; i++)
            arr[section[i]] = 0;
        // System.out.println("초기화" + Arrays.toString(arr));
        while (idx <= n) {
            if (arr[idx] == 0) {
                answer++;
                for (int i = idx; i < idx + m; i++) {
                    if (i <= n)
                        arr[i] = 1;
                }
                idx += m;
            } else
                idx++;
        }
        // System.out.println("결과" + Arrays.toString(arr));
        return answer;
    }
}