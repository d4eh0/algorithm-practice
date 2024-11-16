import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int[] alpha = new int[26];
        for (int i=0; i<s.length(); i++) {
            char temp = s.charAt(i);
            alpha[temp - 'a']++;
        }

        for (int i=0; i<alpha.length; i++) {
            System.out.print(alpha[i] + " ");
        }
    }
}
