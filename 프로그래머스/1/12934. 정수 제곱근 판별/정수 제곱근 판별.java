class Solution {
    public long solution(long n) {
        long answer = 0;
        for (long i = 1; i <= n; i++) {
            long sqrt = i * i;
            if (sqrt == n)
                return (i + 1) * (i + 1);
            if (sqrt > n)
                break;
        }
        return (-1);
    }
}