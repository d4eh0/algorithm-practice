import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++)
            map.put(players[i], i);
        
        for (int j = 0; j < callings.length; j++) {
            int winnerIdx = map.get(callings[j]);
            String loser = answer[winnerIdx - 1];
            answer[winnerIdx - 1] = callings[j];
            answer[winnerIdx] = loser;
            
            map.put(callings[j], winnerIdx - 1);
            map.put(loser, winnerIdx);
        }
        return answer;
    }
}