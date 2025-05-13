import java.util.*;
import java.io.*;

class Solution {
    int[][] box;
    int[] answer = new int[2];
    
    public int[] solution(int[][] arr) {
        this.box = arr;
        canZip(box.length, 0, 0);
        return answer;
    }
    
    public void canZip(int n, int x, int y) {
        if (n < 2) {
            answer[box[x][y]]++;
            return;
        }
        int target = box[x][y];
        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++)   
                if (box[i][j] != target) {
                    int half = n / 2;
                    canZip(half, x, y);
                    canZip(half, x + half, y);
                    canZip(half, x, y + half);
                    canZip(half, x + half, y + half);
                    return;
                }
        }
        answer[target]++;
    }
}