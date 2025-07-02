class Solution {
    public int solution(int a, int b, int n) {
        if (n < a)
            return (0);
        int sum = (int)Math.floor(n / a) * b;
        sum += solution(a, b, sum + n % a);
        return (sum);
    }
}