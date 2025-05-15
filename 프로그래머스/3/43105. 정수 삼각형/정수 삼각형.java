class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        for (int level = triangle.length - 1; level > 0; level--) {
            for (int idx = 0; idx < triangle[level].length - 1; idx++) {
                if (triangle[level][idx] > triangle[level][idx + 1])
                    triangle[level - 1][idx] += triangle[level][idx];
                else triangle[level - 1][idx] += triangle[level][idx + 1];
            }
        }
        answer = triangle[0][0];
        return answer;
    }
}