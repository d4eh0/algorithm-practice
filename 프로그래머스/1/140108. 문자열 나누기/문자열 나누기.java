class Solution {
    public int solution(String s) {
        int answer = 0;
        int idx = 0;
        while (idx < s.length()) {
            char key = s.charAt(idx++);
            answer++;
            int keyCount = 1;
            int readCount = 0;
            while (idx < s.length()) {
                if (idx + 1 == s.length()) return (answer);
                if (key == s.charAt(idx++)) 
                    keyCount++;
                else 
                    readCount++;
                if (keyCount == readCount) {
                    // answer++;
                    break;
                }
            }
        }
        return answer;
    }
}