import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] correct = {0, 0, 0};
        int[] arr0 = {1, 2, 3, 4, 5};
        int[] arr1 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr2 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == arr0[i % arr0.length]) correct[0]++;
            if(answers[i] == arr1[i % arr1.length]) correct[1]++;
            if(answers[i] == arr2[i % arr2.length]) correct[2]++;
        }
        
        int maxScore = Math.max(correct[0], Math.max(correct[1], correct[2]));
        for (int i = 0; i < 3; i++)
            if (correct[i] == maxScore) arr.add(i + 1);
        int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }
        return result;
    }
}