import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        long num = n;
        int length = 0;
        while (num > 0) {
            num /= 10;
            length++;
        }
        long[] arr = new long[length + 1];
        for (int i = 0; i < length; i++) {
            arr[i] = n % 10;
            n /= 10;
        }
        Arrays.sort(arr);
        for (int i = length; i > 0; i--) {
            answer = (10 * answer) + arr[i];
        }
        return (answer);
    }
}