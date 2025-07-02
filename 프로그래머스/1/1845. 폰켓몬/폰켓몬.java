import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer n : nums) {
            if (map.getOrDefault(n, 0) != 0)
                map.put(n, map.get(n) + 1);
            else {
                map.put(n, 1);
                count++;
            }
        }
        return (nums.length / 2 < count ? nums.length /2 : count);
    }
}