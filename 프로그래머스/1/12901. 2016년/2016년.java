class Solution {
    public String solution(int a, int b) {
        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] yoil = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int days = b - 1;
        for (int i = 1; i < a; i++) {
            days += month[i];
        }
        System.out.println(days);
        String answer = yoil[days % 7];
        return answer;
    }
}