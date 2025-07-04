import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int idx = score.length;
        Arrays.sort(score);
        
        for (int i = 0; i < score.length / m; i++) {
            idx -= m;
            answer += score[idx] * m;
        }
        return answer;
    }
}