import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String pass : completion)
            map.put(pass, map.getOrDefault(pass, 0) + 1);
        for (String isPass : participant)
            if (map.get(isPass) == null || map.get(isPass) == 0)
                return isPass;
            else
                map.put(isPass, map.get(isPass) - 1);
        return "aaa";
    }
}